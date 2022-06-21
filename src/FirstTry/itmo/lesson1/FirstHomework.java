package FirstTry.itmo.lesson1;

import java.util.Scanner;

public class FirstHomework {
    public static void main (String[] args){
        String a1 = "Я ";
        String a2 = "хорошо ";
        String a3 = "знаю ";
        String a4 = "Java";
            System.out.println(a1+a2+a3+a4); //1 задание

        double b1 = (46+10)/((double)10/3);
        int b2 = 29*4*(-15);
            System.out.println(b1 + ", " + b2); //2 задание

        int number = 10500;
        double result = (number*1.0/10)/10;
            System.out.println(result); //3 задание

        double c1 = 3.6;
        double c2 = 4.1;
        double c3 = 5.9;
        double result1 = c1*c2*c3;
            System.out.println(result1); //4 задание

        Scanner sc = new Scanner(System.in);
        Integer s1 = sc.nextInt();
        Integer s2 = sc.nextInt();
        Integer s3 = sc.nextInt();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);// 5 задание

        int b = sc.nextInt();
        if (b % 2 != 0){
            System.out.println("Нечётное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапозона");
        } else {
            System.out.println("Чётное");// 6 задание
        }
    }
}
