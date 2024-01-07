import java.util.Scanner;
public class Height{
    public static void main(String [] args){
        int t,s,b,capacity;
        Scanner n = new Scanner(System.in);
       t = n.nextInt();
       s = n.nextInt();
       b = n.nextInt();
       capacity =(2*t*s*b*512)/1024;
        System.out.printf("%d KB",capacity);
    }
}