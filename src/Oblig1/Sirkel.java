package Oblig1;


import java.text.DecimalFormat;

public class Sirkel {


    public static double beregnDiameter(double radius) {
        double diameter = radius * 2;
        return diameter;

    }

    private static double beregnOmkrets(double radius) {
        double omkrets = (2 * Math.PI) * radius;
        return omkrets;
    }

    private static double beregnAreal(double radius) {
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }

    public static void main(String[] args) {
        double radius = 23.5;
        double areal = beregnAreal(radius);
        DecimalFormat df2 = new DecimalFormat(".##");
        System.out.println("Arealet av sirklen med radius 23.5 er " + df2.format(areal) );

        double omkrets = beregnOmkrets(radius);
        DecimalFormat df1 = new DecimalFormat(".##");
        System.out.println("Omkretsen av sirkelen med radius 23.5 er " + df1.format(omkrets) );

        double diameter = beregnDiameter(radius);
        df1 = new DecimalFormat(".##");
        System.out.println("Diameteren til sirkelen er med radius 23.5 er " + df1.format(diameter) );

    }
}
