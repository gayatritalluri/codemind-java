import java.util.Scanner;
public class Add{
    public static void main(String [] args){
        int a,b,sum;
        Scanner n = new Scanner(System.in);
        a = n.nextInt();
        b = n.nextInt();
        sum = a+b;
       
        System.out.printf("%d",sum);
    }
}