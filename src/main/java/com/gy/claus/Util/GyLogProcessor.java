package com.gy.claus.Util;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class GyLogProcessor {


    @Pointcut("@annotation(com.gy.claus.Util.GyLog)")
    public void log() {
    }

    @Around("log()")
    public Object beforeLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around aspect");
        System.out.println(proceedingJoinPoint.getSignature().getName());
        String arg = proceedingJoinPoint.getArgs()[0].toString();
        Object[] objects = new Object[]{arg+"is good"};
        return proceedingJoinPoint.proceed(objects);
    }

    @After("log()")
    public void afterLog(){
        System.out.println("after aspect");
    }
}
