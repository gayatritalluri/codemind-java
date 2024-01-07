import java.util.Scanner;
public class Temperature{
    public static void main(String [] args){
        float a,temp;
        Scanner n = new Scanner(System.in);
        a = n.nextFloat();
        temp = 32+(a*9/5);
        System.out.printf("%.2f",temp);
    }
}