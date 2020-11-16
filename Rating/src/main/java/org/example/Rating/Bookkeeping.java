package org.example.Rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component("Bookkeeping")
public class Bookkeeping {

    private Double Amount; // Новая часть
    private Bond bond; // Новая облигация

    private static ArrayList<Double> ListAmount; //хранилище долей в портфеле в деньгах
    private static ArrayList<Double> ListBond; // хранилище доходов от облигаций в портфеле

    @Autowired
    public static void setBond(Bond bond) {
        ListBond.add(bond.Profit()); //Добавляем доход
    }
    @Autowired
    public static void setAmount(double Amount) {
        double PartSum = 0;

        for(int i = 0; i < ListAmount.size(); i++)
            PartSum += ListAmount.get(i);

        for(int i = 0; i < ListAmount.size(); i++)
            ListAmount.add((Amount / PartSum) * 100); // Добавляем части в процентах

    }

    public double PortfolioIncome(){
        double Sum = 0;

        for (int i = 0 ; i < ListBond.size(); i++){
            Sum += ListBond.get(i) * ListAmount.get(i);
        }

        return Sum;
    }
}
