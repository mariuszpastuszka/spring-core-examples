package workshop.spring5.aop;

import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import workshop.spring5.aop.service.MyService;
import workshop.spring5.aop.service.subpackage.Subservice;

import java.io.ByteArrayOutputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:arround-spring.xml"})
public class AroundTest {

    @Autowired
    private MyService myService;
    @Autowired
    private Subservice subservice;


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupAppenderForLogger() {
        Logger logger = Logger.getRootLogger();
        Appender appender = new WriterAppender(new SimpleLayout(), outContent);
        appender.setName("log4jAppender");
        logger.addAppender(appender);
    }

    @Test
    public void shouldLogAllMethodsAndArroundAspectForLoggable() throws Exception {
        // Given
        String expectedOutput = "DEBUG - workshop.spring5.aop.service.MyServiceImpl#go\n" +
                "DEBUG - AroundAspect aspect before method\n" +
                "DEBUG - workshop.spring5.aop.service.MyServiceImpl#goWithLoggable\n" +
                "DEBUG - AroundAspect aspect after method\n" +
                "DEBUG - workshop.spring5.aop.service.subpackagel.SubserviceImpl#go\n" +
                "DEBUG - AroundAspect aspect before method\n" +
                "DEBUG - workshop.spring5.aop.service.subpackagel.SubserviceImpl#goWithLoggable\n" +
                "DEBUG - AroundAspect aspect after method\n";
        // When
        myService.go();
        myService.goWithLoggable();
        subservice.go();
        subservice.goWithLoggable();
        // Then
        assertThat(outContent.toString(), is(expectedOutput));

    }


}

/*
    TODO zapoznaj się z projektem:

                                    workshop.spring5.aop.ArroundTest
                                    Przykładowy test dla ArroundAspect z pointcut wszystkieMetodyZAdnotacjąLoggable()

                                    Na podstawie tego testu, implementacji logAdvice w AroundAspect, utwórz kolejne
                                    advice w aspektach, oraz napisz testy AfterAspectTest, BeforeAspectTest etc. z różnymi advice / pointcut.

                                    workshop.spring5.aop.aspects:
                                    klasy, do zaimplementowania aspektów,
                                    oraz MyPointucts, gdzie są zdefiniowane pointcut'y - do wykorzystania w aspektach.

                                    resources:
                                    konfiguracja(e) Spring'a - do użycia w testach

                                    annotations.Logable - gdy chcemy przetestować aspkekt wywoływany dla metod o tej adnotacji

                                    workshop.spring5.aop.service
                                    Tu możemy dopisywać klasy / pakiety dla testowania aspektów z różnymi pointcut


  */
