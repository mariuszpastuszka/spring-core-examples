package workshop.spring5.aop.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 *  Opakowanie metody - metody z @Arround
 */
@Aspect
public class AroundAspect {
    private static final Logger LOGGER = Logger.getRootLogger();

    @Around("workshop.spring5.aop.aspects.MyPointcuts.wszystkieMetodyZAdnotacjąLoggable()")
    public void logAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.debug("AroundAspect aspect before method");
        proceedingJoinPoint.proceed();
        LOGGER.debug("AroundAspect aspect after method");
    }

    @Around("workshop.spring5.aop.aspects.MyPointcuts.wszystkieMetodyZAdnotacjąLoggable()")
    public void log2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.debug("AroundAspect aspect before method");
        proceedingJoinPoint.proceed();
        LOGGER.debug("AroundAspect aspect after method");
    }

}
