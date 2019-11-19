package workshop.spring5.aop.service.subpackage;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import workshop.spring5.aop.anotations.Loggable;

@Service
public class SubserviceImpl implements Subservice {
    private Logger logger = Logger.getRootLogger();

    @Override
    public void go() {
        logger.debug("workshop.spring5.aop.service.subpackagel.SubserviceImpl#go");
    }

    @Loggable
    public void goWithLoggable(){
        logger.debug("workshop.spring5.aop.service.subpackagel.SubserviceImpl#goWithLoggable");
    }
}
