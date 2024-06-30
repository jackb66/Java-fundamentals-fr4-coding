package Ushtrimi8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double vlera = Calculator();
        System.out.println(vlera);
        System.out.println("Logjik kodi");

    }

    public static double Calculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni numrin e 1");
        float number1 = scanner.nextFloat();
        System.out.println("Vendosni numrin e operatorit");
        char operatori = scanner.next().charAt(0);
        System.out.println("Vendosni numrin e 1");
        float number2 = scanner.nextFloat();

        switch (operatori) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;

            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    System.out.println("pjesetimi me zero nuk ka kuptim");
                    return Integer.MIN_VALUE;
                } else {

                   return number1 / number2;
                }
            default:
                System.out.println("invalid operator");
        }
        return Integer.MIN_VALUE;


    }

}




