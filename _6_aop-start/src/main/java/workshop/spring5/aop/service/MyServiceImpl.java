package workshop.spring5.aop.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import workshop.spring5.aop.anotations.Loggable;

@Service
public class MyServiceImpl implements MyService {
    private static final Logger LOGGER = Logger.getRootLogger();

    public void go(){
        LOGGER.debug("workshop.spring5.aop.service.MyServiceImpl#go");
    }

    @Loggable
    public void goWithLoggable(){
        LOGGER.debug("workshop.spring5.aop.service.MyServiceImpl#goWithLoggable");
    }
}
