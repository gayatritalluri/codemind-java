import java.util.Scanner;
public class Product{
    public static void main(String [] args){
        int a,b,mul;
        Scanner n = new Scanner(System.in);
        a = n.nextInt();
        b = n.nextInt();
        mul = a*b;
       
        System.out.printf("%d",mul);
    }
}