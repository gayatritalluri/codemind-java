import java.util.Scanner;
public class Div{
    public static void main(String [] args){
        int a,b,div;
        Scanner n = new Scanner(System.in);
        a = n.nextInt();
        b = n.nextInt();
        div = a/b;
       
        System.out.printf("%d",div);
    }
}