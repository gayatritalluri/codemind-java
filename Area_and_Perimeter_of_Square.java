import java.util.Scanner;
public class Square{
    public static void main(String [] args){
        int s,area,perimeter;
        Scanner n = new Scanner(System.in);
        s = n.nextInt();
        area=s*s;
        perimeter=4*s;
       
        System.out.printf("%d %d",area,perimeter);
    }
}