package com.assignment1.MockExam.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class NotificationAspect {

//    @AfterReturning(
//            pointcut = "execution(public java.util.List<com.assignment1.MockExam.Entity.Student> com.assignment1.MockExam.Controller.StudentController.getAllStudents())"
//    )

//    @After("execution(public java.util.List<com.assignment1.MockExam.Entity.Student> com.assignment1.MockExam.Controller.StudentController.*(..))")

    @Pointcut("execution(public java.util.List<com.assignment1.MockExam.Entity.*> com.assignment1.MockExam.Controller.*.*(..))")
    public void ReturnListOfStudents(){}


    @After("ReturnListOfStudents()")
    public void sendAlert(JoinPoint joinPoint ){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Method " + methodName + " executed and returned a list of students.");
    }

    @Pointcut("@annotation(ExecutionTime)")
    public void MeasureTime(){}

    @Around("MeasureTime()")
    public Object MeasureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("time taken to execute: " + joinPoint.getSignature().getName() + "is: " + (end -start) + "ms");
        return  proceed;
    }
}
