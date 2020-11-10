package org.example.Rating;

public class Income {
    private final double[] Part;
    private final double[] Income;

    public Income(double[] Part, double[] Income){
        this.Income = Income;
        this.Part = Part;
    }

    public double PortfolioIncome(){
        double Sum = 0;
        for (int i = 0; i < Income.length; i++){
            Sum += Income[i] * Part[i];
        }
        return Sum;
    }
}
