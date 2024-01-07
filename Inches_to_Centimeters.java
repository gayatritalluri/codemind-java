import java.util.Scanner;
public class Height{
    public static void main(String [] args){
        double height,conversion;
        Scanner n = new Scanner(System.in);
       height = n.nextDouble();
       conversion = 2.54 * height ;
        System.out.printf("%.2f",conversion);
    }
}