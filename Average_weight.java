import java.util.Scanner;
public class Average{
    public static void main(String [] args){
        int x,a,b,c;
        Scanner n = new Scanner(System.in);
        x = n.nextInt();
        a = n.nextInt();
        b = n.nextInt();
        c = ((3*x)-a-b);
        System.out.printf("%d",c);
    }
}