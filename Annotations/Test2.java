package Annotations;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class xiaomiClass = Class.forName("Annotations.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiaomi Class: " + smartPhone1.OS() + ", " + smartPhone1.yearOfCompanyCreation());

        Class iPhoneClass = Class.forName("Annotations.iPhone");
        Annotation annotation2 = iPhoneClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from iPhone Class: " + smartPhone2.OS() + ", " + smartPhone2.yearOfCompanyCreation());
    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "iOS", yearOfCompanyCreation = 1976)
class iPhone {
    String model;
    double price;
}