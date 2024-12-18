
import java.util.*;
public class selectionsort{
    static void selectionsort(int[] ar){
        int n=ar.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(ar[j] < ar[min]){
                    min=j;
                }
            }
            int temp=ar[min];
            ar[min]=ar[i];
            ar[i]=temp;
        }
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int[] ar=new int[n];
     
      for(int i=0;i<ar.length;i++){
          ar[i]=sc.nextInt();
      }
      selectionsort(ar);
      System.out.println(Arrays.toString(ar));
      
    }
}