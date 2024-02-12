import java.util.Scanner;
public class Large{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int x,y,z;
   int max=0;
    x=sc.nextInt();
    y =sc.nextInt();
    z =sc.nextInt();
    if(x>z && x>y){
        max=x;
    }
    else if(y>x && y>z){
        max=y;
    }
    else{
        max=z;
    }
    System.out.println(max);

   
    
  }
}