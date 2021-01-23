package com.companyCat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  /**
   * quadratic equation:
   * ax^2 + bx + c = 0
   * D = b^2 − 4ac
   * Если дискриминант D > 0
   * x1 = (-b+sqrt(d))/2a
   * x2 = (-b-sqrt(d))/2a
   * если D = 0 любая из формул
   * если D<0 нет решения
    */
        QudroEq();

    }

    private static void QudroEq() {
        double a,b,c,d;
        double x=0;
        double x1=0;
        double x2=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения a,b,c для решения уравнения ax^2 + bx + c = 0");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = Math.pow(b,2) - 4*a*c;

         //   Промежуточная проверка
         //   System.out.println(a+System.lineSeparator()+b+System.lineSeparator()+c+System.lineSeparator()+d);
        
        if (d<0){
            System.out.println("дискриминант отрицательный D = "+d+"  нет решения");
        }
        else {
            if (d == 0){
                    x=-b/(2*a);
                    System.out.println(" Дискриминант = 0. Одно решение. х = "+x);
                }
            else {
                x1 = (-b+Math.sqrt(d))/(2*a);
                x2 = (-b-Math.sqrt(d))/(2*a);
                System.out.println("Решение уравнения"+System.lineSeparator());
                // как округлять до заданного количества знаков после запятой - только 2 получилось(((
                System.out.println("x1 = "+Math.round(x1*100.0)/100.0);
                System.out.println("x2 = "+Math.round(x2*100.0)/100.0);
            }
                    }

    }
}
