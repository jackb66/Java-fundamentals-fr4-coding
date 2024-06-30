package Ushtrimi1;
import java.util.Scanner;

public class Rrethi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("jep diametrin ");
        float diametri=scanner.nextFloat();
        float rrezja= diametri/2;
        float perimetri= (float) (2*Math.PI*rrezja);
        double perimetri2= (2*Math.PI*rrezja);
        System.out.println("perimetri float eshte " +perimetri);
        System.out.println("perimetri double eshte " +perimetri2);
    }
}
