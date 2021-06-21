package com.example.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//특정 메소드의 실행 시간을 출력할 수 있도록 만들어 본다.
//@Bean과 @Component의 차이는 클래스에 붙일 수 없다는 것이다. 누가 빈이 
//@Configuration은 하나에 여러개 의 빈을 사용한다.

@Aspect
@Component
public class TimerAop {
    //여기서 cut의 이름은 다른 이름도 가능하다.
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private void cut(){}

    @Pointcut("@annotation(com.example.aop.annotation.Timer)")
    private void enableTimer(){}

    //시간을 잴거라서 전 후가 필요를 비교해야 하므로 
    //before와 after가 있으면 비교할 수가 없어서 이럴 때 @Around를 사용할 수 있다.
    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
    	//스프링에서 제공하는 클래스
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        //호출된 메소드가 실행하고 나면 Object를 반환해 줌.
        //호출된 메소드가 void이면 비어 있을 것임.
        Object result = joinPoint.proceed();

        stopWatch.stop();
        System.out.println("total time : "+stopWatch.getTotalTimeSeconds());
    }
}
