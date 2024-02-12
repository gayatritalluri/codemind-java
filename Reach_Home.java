import java.util.Scanner;
public class Ticket{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n,m;
   
    n=sc.nextInt();
    m =sc.nextInt();
    if(5*n >= m){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }

   
    
  }
}