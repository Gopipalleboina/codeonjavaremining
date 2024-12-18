import java.util.Scanner;
public class removingspacesinstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.nextLine();
       String s1=s.replace(" ","");
       System.out.print(s1);
    }
}
