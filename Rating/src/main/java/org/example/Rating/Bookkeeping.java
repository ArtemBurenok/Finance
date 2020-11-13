package org.example.Rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component("Bookkeeping")
public class Bookkeeping {

    private Double Part; // Новая часть
    private Bond bond; // Новая облигация

    private static ArrayList<Double> ListPart; //хранилище долей в портфеле
    private static ArrayList<Double> ListBond; // хранилище доходов от облигаций в портфеле

    @Autowired
    public static void setBond(Bond bond) {
        ListBond.add(bond.Profit()); //Добавляем доход
    }

    public static void setPart(double part) {
        ListPart.add(part); // Добавляем части
    }

    public double PortfolioIncome(){
        double Sum = 0;
        return 0;
    }
}
