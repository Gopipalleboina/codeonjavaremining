import java.util.Scanner;
class vowelchecking {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      char s=sc.next().charAt(0);
      int flag=0;
      char a[]={'a','e','i','o','u'};
     
      
      for(int i=0;i<a.length;i++){
          if(a[i]==s){
             
              flag=1;
          }
      }
      if(flag==0){
          System.out.println(s+" is not vowel");
      }
      else{
      System.out.println(s+" is vowel");
      }
    }
}