
import java.util.*;
public class  removevowelsinstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] k={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<s.length();i++){
            boolean isvowel=false;
            for(int j=0;j<k.length;j++){
                if(s.charAt(i)==k[j]){
                    isvowel=true;
                    break;
                    
                }
            }
            if(!isvowel){
                System.out.print(s.charAt(i));
            }
        }
    }
}