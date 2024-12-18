import java.util.*;

public class wrapperexample {
    public static void main(String[] args){
        // autoboxing:primitive to wrapper
        int num=5;
        Integer numobj=num;
        //unboxing:wrapper to primitive
        Integer obj=Integer.valueOf(10);
        int i=obj;
        System.out.println("autoboxing:"+numobj);
        System.out.println("unboxing:"+i);
    ArrayList<Integer>ar=new ArrayList<>();
    ar.add(num);
    ar.add(obj);
    //System.out.println("arraylist:"+ar);
    for(int j=0;j<ar.size();j++){
      System.out.print(ar.get(j)+" ");
    }
    }
    
}
