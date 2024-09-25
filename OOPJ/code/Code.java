package OOPJ.code;

abstract class Base{

    abstract int age();
    public Base(int age){
        //this.age=age;
       //System.out.println("Base"+age);

    }

    public void getage(){

        System.out.println("age");
    }

}


class Derive extends Base{
   public Derive(){

    super(10);
    }
}
public class Code {
    
    public static void main(String[] args){
//Derive d1=new Derive(1234567812);
   //d1.getage();
   
Base b1= new Derive(10);//upcasting

Derive d11=(Derive) b1;//downcast
//b1.getage();

d11.getage();

    }
}
