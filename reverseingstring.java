import java.util.*;
public class reverseingstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String st="";
        for(int i=(s.length()-1);i>=0;i--){
            st=st+s.charAt(i);
        }
        System.out.println(st);


    }

}