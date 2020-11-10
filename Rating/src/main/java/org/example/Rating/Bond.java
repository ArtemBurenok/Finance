package org.example.Rating;

public class Bond {
    private final double ParValue;
    private final double Percent;
    private final int Time;
    private double[] CF;

    public Bond(double ParValue, double Percent, int Time, double[] CF){
        this.ParValue = ParValue;
        this.Percent = Percent;
        this.Time = Time;
        this.CF = CF;
    }
    public double PresentValue(){
        double PV = 0;
        for (int i = 0; i < Time; i++){
            PV += CF[i] / Math.pow((1 + Percent / 100), i);
        }
        return PV;
    }

    public double ForwardRate(double SecondPercent, int SecondTime){
        return (Math.pow((1 + SecondPercent / 100), SecondTime) / Math.pow((1 + Percent / 100), Time)) - 1;
    }

    public double DiscountCoefficient(){
        return 1 / Math.pow((1 + Percent / 100), Time);
    }

    public double SpotRate(){
        return ParValue / Math.pow((1 + Percent), Time);
    }

    public double ForwardDiscountCoefficient(double SecondPercent, int SecondTime){
        return 1 / ((1 + Percent / 100) * (1 + ForwardRate(SecondPercent, SecondTime)));
    }
}
