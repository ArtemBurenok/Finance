package org.example.Rating;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRating {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("ApplicationContext.xml");

        Bookkeeping bookkeeping = context.getBean("Bookkeeping", Bookkeeping.class);


        context.close();
    }
}
