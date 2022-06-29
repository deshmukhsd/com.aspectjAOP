package org.example;





import com.google.common.base.Stopwatch;
import org.apache.commons.lang3.time.StopWatch;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class Logging {
    public static long Total;
    public static long start;
    public static long end;
  //public static Stopwatch stopwatch=new Stopwatch();
    @Pointcut("within(org.example..*)")
    private void selectAll(){}


   @Around("selectAll()")
    public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
        long start=System.currentTimeMillis();
      //stopwatch.start();
        Object obj=jp.proceed();
        long end=System.currentTimeMillis();
       //stopwatch.stop();
        System.out.println("Elapsed time for method: "+jp.getSignature().getName()+" is "+(end-start)+" milliSecond");
        //System.out.println("Total Elapsed time is "+stopwatch.elapsedMillis()+" milliSecond");
    }
}
