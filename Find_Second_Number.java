import java.util.Scanner;
public class Average{
    public static void main (String [] args){
        int x,y,second;
        Scanner n  = new Scanner(System.in);
         x = n.nextInt();
        y = n.nextInt();
        second = (2*x)-y;
        System.out.printf("%d",second);
    }
}