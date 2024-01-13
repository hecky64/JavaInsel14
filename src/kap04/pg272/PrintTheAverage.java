package kap04.pg272;

public class PrintTheAverage {
    public static void main(String[] args){
        double[] numbers = {1.9, 7.8, 2.4, 9.3};

        double sum = 0;
        for(double s : numbers){
            sum += s;
        }

        System.out.println("Average: " + sum / numbers.length);
    }
}
