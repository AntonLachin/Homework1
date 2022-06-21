public class Main {
    static class Calculator {
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
        public static int divide (int a,int b) {
            return a / b;
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
        public static long divide (long a, long b){
            return a / b;
        };
    }
    public static void main(String[] args) {
        System.out.println(Calculator.divide(32.4,11) + "Ура!");
        System.out.println(Calculator.multiply(235562L,12254L));
        System.out.println(Calculator.subtract(22.3,16.1));
        System.out.println(Calculator.sum(120,25));
    }
}