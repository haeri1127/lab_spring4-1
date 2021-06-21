package com.example.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})//메소드와 타입 두개에 타겟을 건다.
@Retention(RetentionPolicy.RUNTIME)//런타임에 사용한다.
public @interface Timer {
}
