import java.util.Scanner;
public class Ticket{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n;
   
    n=sc.nextInt();
  
    if(4*n<=1000){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }

   
    
  }
}