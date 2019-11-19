package workshop.spring5.aop.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 *  Wykonanie, gdy został rzucony wyjątek - metody z @AfterThrowing
 */
@Aspect
public class AfterThrowingAspect {

}
