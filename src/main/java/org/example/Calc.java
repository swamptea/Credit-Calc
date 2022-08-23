package org.example;
public class Calc {
    public static double payment(double creditSum, double percent, int month){
        double monthPercent = percent / 1200;
        double res = creditSum * (monthPercent/(1-(Math.pow(monthPercent + 1, (-month)))));
        double scale = Math.pow(10, 2);
        return Math.round(res * scale) / scale;
    }
    public static double creditSum (double payment, int month){
        return payment * month;
    }
    public static double overPayment (double credit, double creditSum){
        return creditSum - credit;
    }
}
