import java.util.Scanner;
public class Mul{
    public static void main(String [] args){
        float a,b,mul;
        Scanner n = new Scanner(System.in);
        a = n.nextFloat();
        b = n.nextFloat();
        mul = a*b;
       
        System.out.printf("%.2f",mul);
    }
}