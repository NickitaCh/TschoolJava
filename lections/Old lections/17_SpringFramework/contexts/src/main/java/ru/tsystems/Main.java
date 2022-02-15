package ru.tsystems;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // XML defined context. All beans are described in XML config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(BookService.class).orderBook();
        context.close();

        // Annotation based config. XML only starts scanning of the package.
        // To make this config work uncomment annotations in beans.
        // You can also uncomment only @Configuration in JavaConfig class - it will be scanned with all bean definitions
        ClassPathXmlApplicationContext annotationContext = new ClassPathXmlApplicationContext("annotation-context.xml");
        annotationContext.getBean(BookService.class).orderBook();
        annotationContext.close();

        // No XML at all. Uncomment @Configuration in JavaConfig.
        AnnotationConfigApplicationContext javaConfigContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        javaConfigContext.getBean(BookService.class).orderBook();
        javaConfigContext.close();

    }
}
