import java.util.*;
public class wrapperclassmethods {
    public static void main(String[] args){
        // converting string to primitive types
        int i=Integer.parseInt("123");
        double a=Double.parseDouble("3.14");
        boolean b=Boolean.parseBoolean("true");
        //converting primitive types to strings
          String s=Integer.toString(123);
          String s1=Double.toString(3.14);
          String s2=Boolean.toString(true);
          System.out.println(i);
          System.out.println(a);
          System.out.println(b);
          System.out.println(s);
          System.out.println(s1);
          System.out.println(s2);
    }

    
}
