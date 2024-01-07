import java.util.Scanner;
public class Average{
    public static void main(String [] args){
        float a,b,avg;
        Scanner n = new Scanner(System.in);
        a = n.nextFloat();
        b = n.nextFloat();
        avg = (a+b)/2;
        System.out.printf("%.4f",avg);
    }
}