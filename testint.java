interface printable{
    void print();
    }
    interface showable{
    void show();
    }
    public class testint implements printable,showable{
    public void print(){
    System.out.println("print");
    }
    public void show(){
    System.out.println("show");
    }
    public static void main(String[] args){
    testint t=new testint();
    t.print();
    t.show();
    }
    }