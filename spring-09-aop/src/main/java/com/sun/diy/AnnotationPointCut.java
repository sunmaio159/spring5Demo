package com.sun.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 使用注解实现aop
 */
@Component
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.sun.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===========方法执行前=========");
    }
    @After("execution(* com.sun.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("===========方法执行后=========");
    }

    @Around("execution(* com.sun.service.UserServiceImpl.*(..))")
    public void round(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        joinPoint.proceed();
        System.out.println("环绕后");
    }
}
