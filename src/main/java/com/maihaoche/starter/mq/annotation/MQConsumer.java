package com.maihaoche.starter.mq.annotation;

import com.maihaoche.starter.mq.base.MessageExtConst;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by yipin on 2017/6/27.
 * RocketMQ消费者自动装配注解
 *
 * 关闭 Component 注解，用来可以通过 ConditionalOn * 的注解进行按需配置  by guzhandong at 2022年10月18日15:14:46
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Component
public @interface MQConsumer {
    String consumerGroup();
    String topic();

    /**
     * 广播模式消费： BROADCASTING
     * 集群模式消费： CLUSTERING
     * @return 消息模式
     */
    String messageMode() default MessageExtConst.MESSAGE_MODE_CLUSTERING;

    /**
     * 使用线程池并发消费: CONCURRENTLY("CONCURRENTLY"),
     * 单线程消费: ORDERLY("ORDERLY");
     * @return 消费模式
     */
    String consumeMode() default MessageExtConst.CONSUME_MODE_CONCURRENTLY;
    String[] tag() default {"*"};
}
