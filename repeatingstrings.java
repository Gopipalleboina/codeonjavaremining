import java.util.*;
public class repeatingstrings{
    public static void main(String[] args){
        String s="engineering";
        for(int i=0;i<s.length();i++){
            boolean isprinted=false;
            for(int k=0;k<i;k++){
                if(s.charAt(i)==s.charAt(k)){
                    isprinted=true;
                    break;
                }
            }
            if(isprinted){
                continue;
            }
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println("repeating characters are:"+s.charAt(i));
                    break;
                }
            }
        }
    }
}
//another method for repeating string
/*import java.util.*;
public class Main{
    public static void main(String[] args){
        HashSet<Character>h=new HashSet<>();
        String s="engineering";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if((s.charAt(i)==s.charAt(j)) && (!h.contains(s.charAt(i)))){
                    
                    System.out.println("repeating characters:"+s.charAt(i));
                    h.add(s.charAt(i));
                    break;
                    
                }
            }
        }
    }
}*/