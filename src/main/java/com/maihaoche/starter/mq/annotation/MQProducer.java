package com.maihaoche.starter.mq.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by yipin on 2017/6/27.
 * RocketMQ生产者自动装配注解
 *
 * 关闭 Component 注解，用来可以通过 ConditionalOn * 的注解进行按需配置  by guzhandong at 2022年10月18日15:14:46
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Component
public @interface MQProducer {
}
