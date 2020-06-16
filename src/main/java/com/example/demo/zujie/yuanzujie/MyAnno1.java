package com.example.demo.zujie.yuanzujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 元注解： 用于描述注解的注解
 * @Target:     描述注解能够作用的位置
 * @Retention:  描述注解被保留的阶段
 * @Documented: 描述注解是否被抽取到api文档中
 * @Inherited:  描述注解是否被子类继承
 *
 *
 *
 */
//TYPE(作用于类上),METHOD(作用于方法上),FIELD(作用于成员变量上)
@Target(value = {ElementType.TYPE})
//作用于当前被描述的注解,会保留到class字节码文件中，并被JVM读取到
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno1 {
}
