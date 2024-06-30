package Fibo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
              System.out.println("Put a pozitive number or 0");
            int index = scanner.nextInt();
        if (index > 0.) {
            System.out.println(Fibonacci.Fibo(index)+ " " );
        }else {
            System.out.println("The number you have put is wrong");
        }
    }
}
