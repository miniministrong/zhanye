package com.ebiz.zhanye.controller;

import com.ebiz.zhanye.commons.utils.DozerUtils;
import com.ebiz.zhanye.commons.utils.JwtUtils;
import com.ebiz.zhanye.commons.validation.user.Login;
import com.ebiz.zhanye.config.ResultModel;
import com.ebiz.zhanye.db.generated.model.EbizUser;
import com.ebiz.zhanye.dto.UserDTO;
import com.ebiz.zhanye.service.EbizUserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Valid
@Slf4j
@RestController
//@CrossOrigin("*")
@RequestMapping("/user")
public class EbizUserController {
    @Autowired
    EbizUserService userService;

    @ApiOperation("新增用户")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ResultModel insert(@RequestBody EbizUser user){
        if (user == null) {
            log.error("新增失败，传入的数据为：{}", user.toString());
            return ResultModel.error(400, "新增失败，传入的数据为："+ user.toString());
        }
        String id = userService.insert(user);
        return ResultModel.success(id);
    }

    @ApiOperation("根据id删除用户")
    @RequestMapping(value="/deleteById",method = RequestMethod.GET)
    public ResultModel deleteById(@RequestParam(value = "id") String id ){
        if(StringUtils.isEmpty(id)){
            return ResultModel.error();
        }else {
            return ResultModel.success(userService.deleteById(id));
        }
    }

    @ApiOperation("更新用户信息")
    @PostMapping("/update")
    public ResultModel update(@RequestBody EbizUser user){
        int row = userService.update(user);
        return ResultModel.success(row);
    }

    @ApiOperation("根据id查询用户")
    @GetMapping(value="/selectById")
    public ResultModel selectById(@RequestParam(value = "id") String id ){
        if(StringUtils.isEmpty(id)){
            return ResultModel.error();
        }else {
            EbizUser user = userService.selectById(id);
            return ResultModel.success(user);
        }
    }


    @RequestMapping(value="/selectByName",method = RequestMethod.GET)
    public ResultModel selectByName(@RequestParam(value = "name") String name ){
        if(StringUtils.isEmpty(name)){
            return ResultModel.error();
        }else {
            List<EbizUser> users = userService.selectByName(name);
            return ResultModel.success(users);
        }
    }

    /**
     * 根据客户id和名称模糊查
     * @param id
     * @param name
     * @return: ResultModel
     */
    @RequestMapping(value="/selectByCnoAndCname",method = RequestMethod.GET)
    public ResultModel selectByCnoAndCname(@RequestParam(value = "id") String id,@RequestParam(value = "name") String name){
        if(StringUtils.isEmpty(id) || StringUtils.isEmpty(name)){
            return ResultModel.error();
        }else {
            List<EbizUser> userList = userService.selectByCnoAndCname(id,name);
            return ResultModel.success(userList);
        }
    }

    @ApiOperation("登录接口")
    @PostMapping("/login")
    public ResultModel login(@Validated(Login.class) @RequestBody EbizUser ebizUser){
        EbizUser userInfo = userService.login(ebizUser);
        if (userInfo != null) {
            String token = JwtUtils.createToken(userInfo.getId());
            Map resultMap = new HashMap();
            resultMap.put("token", token);
            return ResultModel.success(resultMap);
        } else {
            log.error("您的用户名或密码错误，传入参数：{}", ebizUser.toString());
            return ResultModel.error(400, "您的用户名或密码错误");
        }
    }
/*
    @ApiOperation("根据工号查询用户")
    @GetMapping("/getUserByNo")
    public ResultModel getUserByNo(Integer workNo){
        if (workNo == null) {
            log.error("您输入的工号为：" + workNo);
            return ResultModel.error("您的工号为空，请重新输入：" + workNo);
        }
        List<EbizUser> users = userService.selectByNo(workNo);
        Map resultMap = new HashMap();
        resultMap.put("username", users.get(0).getWorkName());
        return ResultModel.success(resultMap);
    }*/

    @GetMapping("/listNoName")
    public ResultModel listUsersByNoAndName(){
        List<EbizUser> ebizUsers = userService.listUsersByNoAndName();
        List<UserDTO> userDTOS = DozerUtils.mapList(ebizUsers, UserDTO.class);
        Map resultMap = new HashMap();
        resultMap.put("list", userDTOS);
        return ResultModel.success(resultMap);
    }
}
