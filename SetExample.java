import java.util.*;
public class SetExample {
    public static void main(String[] args){
        HashSet<Integer>hs=new HashSet<>();
        Collections.addAll(hs,1,2,3,4,5,1,2,4);
        System.out.println(hs);
        System.out.println(hs.contains(1));
        hs.remove(1);
        System.out.println(hs);
        for(int i:hs){
            System.out.print(i+" ");
        }
    }
    
}
