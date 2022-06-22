package Homework2;

public class Homework2 {
    static class Calculator {
        //1st exercise:
        int a;
        int b;

        public static int sum(int a,int b) {
            return a + b;
        };
        public static int subtract (int a,int b) {
            return a - b;
        };
        public static int multiply (int a,int b) {
            return a * b;
        };
        public static double divide (int a,int b) {
            return (a*1.0) / b;
        };

        public static double sum (double a, double b){
            return a + b;
        };
        public static double subtract (double a, double b){
            return a - b;
        };
        public static double multiply (double a, double b){
            return a * b;
        };
        public static double divide (double a, double b){
            return a / b;
        };

        public static long sum (long a, long b){
            return a + b;
        };
        public static long subtract (long a, long b){
            return a - b;
        };
        public static long multiply (long a, long b){
            return a * b;
        };
        public static double divide (long a, long b){
            return (a*1.0) / b;
        };
    }
    public static void main(String[] args) {
        System.out.println(Calculator.divide(32.4,11) + "Ура!");
        System.out.println(Calculator.multiply(235562L,12254L));
        System.out.println(Calculator.subtract(22.3,16.1));
        System.out.println(Calculator.sum(120,25));
//2nd exercise:
        Dog Hound = new Dog("Hound", null, 2, false, 0, FurColor.BROWN);
        Dog Poodle = new Dog("Poodle", null, 3, true, 0, FurColor.WHITE);
//before
        System.out.println(Hound);
        System.out.println(Poodle);
//setters
        Hound.setPrice(300000);
        Hound.setFurColor(FurColor.BLACK);
        Poodle.setPrice(500000);
        Poodle.setFurColor(FurColor.YELLOW);
//getters
        Hound.getName();
        Poodle.getName();
//after
        System.out.println(Hound);
        System.out.println(Poodle);
    }
}