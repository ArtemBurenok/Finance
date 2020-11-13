package org.example.Rating;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;

public class TestRating {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("ApplicationContext.xml");

        double[] CF = new double[] {50, 1050};
        Bond bond = new Bond(1000, 13, 2, CF);

        ArrayList<Double> PresentValue = new ArrayList<Double>();
        PresentValue.add(bond.PresentValue());

        context.close();
    }
}
