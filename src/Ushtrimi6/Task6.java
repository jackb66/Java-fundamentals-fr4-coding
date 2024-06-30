package Ushtrimi6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.println("vendos numrin");
         int numri= scanner.nextInt();
         double sum=0;
         for (int i= 1; i<numri; i++){
             System.out.println("Shuma:" +sum +"iteracioni:"+i);
             sum=sum+1/(double)1/i;}
         System.out.println(sum);
    }
}
