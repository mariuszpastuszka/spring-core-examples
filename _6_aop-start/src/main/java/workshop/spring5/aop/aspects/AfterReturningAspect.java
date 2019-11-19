package workshop.spring5.aop.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 *  Wykonanie po, jeśli nie ma błędu - metody z @AfterReturning
 */
@Aspect
public class AfterReturningAspect {

}
