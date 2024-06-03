package com.assignment.Lab4.aspect;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class Logger {
    private final LogRepo logRepo;

    @Pointcut("execution(* com.assignment.Lab4.controller.*.*(..))")
    public  void operationLogging(){
    }

    @Pointcut("@annotation(ExecutionTime)")
    public void methodExecutionTimeLogging(){}

    @Around("methodExecutionTimeLogging()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws  Throwable{
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("Time taken to execute: " + (end -start)+ "ms");
        return proceed;
    }

    @Before("operationLogging()")
    public void log(JoinPoint joinPoint){
        Log log = new Log();
        log.setDate(new java.sql.Date(System.currentTimeMillis()));
        log.setTime(new java.sql.Time(System.currentTimeMillis()));
        log.setPrinciple("FakeUser");
        log.setOperation(joinPoint.getSignature().toShortString());
        logRepo.save(log);
    }


}
