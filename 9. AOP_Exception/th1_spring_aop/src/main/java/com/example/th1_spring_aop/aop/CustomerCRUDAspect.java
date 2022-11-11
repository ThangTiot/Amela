package com.example.th1_spring_aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CustomerCRUDAspect {
    @After("execution(public * com.example.th1_spring_aop.service.CustomerService.findAll(..))")
    public void log(JoinPoint joinPoint) {
        System.out.println("EmployeeCRUDAspect.log() : " + joinPoint.getSignature().getName());
    }
}
