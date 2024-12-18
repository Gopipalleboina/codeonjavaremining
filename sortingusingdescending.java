import java.util.Arrays;
import java.util.Collections;
public class sortingusingdescending{
    public static void main(String[] args){
        Integer[] a={9,2,3,1,5};
        Arrays.sort(a,Collections.reverseOrder());
      //  for(int i=0;i<a.length;i++){
            System.out.print(Arrays.toString(a));
      //  }
       
    }
}