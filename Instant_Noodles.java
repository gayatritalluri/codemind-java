import java.util.Scanner;
public class Noodles{
    public static void main (String [] args){
        int x,y,k;
        Scanner n  = new Scanner(System.in);
        x = n.nextInt();
        y = n.nextInt();
        k = x*y;
        System.out.printf("%d",k);
    }
}