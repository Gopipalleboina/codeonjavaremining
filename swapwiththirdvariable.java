//swap two variables with and without using third variable
import java.util.Scanner;
public class swapwiththirdvariable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swap numbers:"+a +" "+b);
        int temp;
        temp=a;
       a=b;
       b=temp;
      
       
        
        System.out.println("after swap numbers:"+a+" "+b);
        
        
    }
}