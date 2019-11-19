package workshop.spring5.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyPointcuts {

    @Pointcut("execution(public * *(..))")
    void wszystkiePubliczneMetody() {
    }

    @Pointcut("execution(* set*(..))")
    void wszystkieMetodyZaczynajaceSieNaSet() {
    }

    @Pointcut("execution(* workshop.spring5.aop.service.MyServiceImpl.*(..))")
    void wszystkieMetodyWMyServiceImpl() {
    }

    @Pointcut("execution(* workshop.spring5.aop.service.*.*(..))")
    void wszystkieMetodyWPakiecieService() {
    }

    @Pointcut("execution(* workshop.spring5.aop.service..*.*(..))")
    void wszystkieMetodyWPakiecieServiceLubPodpakietach() {
    }

    @Pointcut("args(java.io.Serializable)")
    void wszystkieMetodyJedenParamImplementorSerializable() {
    }

    @Pointcut("@annotation(workshop.spring5.aop.anotations.Loggable)")
    void wszystkieMetodyZAdnotacjąLoggable() {
    }
}




