//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.Scanner;
public class sumofoddandsumofeven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int numeven=0,numodd=0;
       for(int i=1;i<=n;i++){
       if(i%2==0){
           
           numeven+=i;
          
          
       }
       else{
           numodd+=i;
          
          
       }
    }
     System.out.println("sum of even numbers:"+numeven);
      System.out.println("sum of odd numbers:"+numodd);
    }
}