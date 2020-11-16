package org.example.Rating;

import java.util.ArrayList;

public class Statistic {
    public double Mean(ArrayList<Double> List){
        int Size = 0;
        double Sum = 0;

        for (int i = 0; i < List.size(); i++){
            Sum += List.get(i) / List.size();
        }
        return Sum;
    }

    public double Variable(ArrayList<Double> List){
        double Variable = 0;

        for(int i = 0; i < List.size(); i++){
            Variable += Math.pow((List.get(i) - Mean(List)), 2) / List.size();
        }

        return Variable;
    }

    public double Std(ArrayList<Double> List){
        return Math.sqrt(Variable(List));
    }



}
