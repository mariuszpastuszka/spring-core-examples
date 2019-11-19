package workshop.spring5.qualifier.customq.juicemaker.annotation;

/*
    TODO 2
    Uwtórz z interfejsu definicję adnotacji @JuiceType - będzie to 'customowa' adnotacja @Qualifier

    target - typ, pole, konstruktor
    retention - runtime

 */
public @interface JuiceType {

    String value();
}
