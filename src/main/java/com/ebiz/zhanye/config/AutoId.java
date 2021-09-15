package com.ebiz.zhanye.config;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface AutoId {
    IdType value() default IdType.SNOWFLAKE;

    public static enum IdType {
        UUID,
        SNOWFLAKE;

        private IdType() {
        }
    }
}
