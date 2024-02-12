import java.util.Scanner;
public class Student{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int t,n,m,k;
   t=sc.nextInt();
   for(int i =0;i<t;i++){
    n=sc.nextInt();
    m=sc.nextInt();
    k=sc.nextInt();
    if((n+k)<=m){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
   }
   
    
  }
}