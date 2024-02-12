import java.util.Scanner;
public class Good{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n,m;
    n=sc.nextInt();
    m=sc.nextInt();
    
    if(n>=(2*m)){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
  }
}