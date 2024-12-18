//left, right and pyramid star pattern problem
import java.util.Scanner;
class rightpattern {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           /*  for(int s=n-i;s>0;s--){
               System.out.print(" ");
           }*/
           for(int j=n;j>=i;j--){
               System.out.print("*");
           }
           System.out.println("");
       }
       
    }
}