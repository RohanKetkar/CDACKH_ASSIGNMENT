package OOPJ.assignment5.Que11;

class Java1{

    private Java1(){
        

       System.out.println("abcde");

    }
public static Java1 refernce=null;

public static Java1 getJava1(){

    if(refernce==null) refernce=new Java1();
    

return refernce;


}

}
public class Que11 {
    

public static void main(String[] args){
    Java1 l1=Java1.getJava1();

    Java1 l11=Java1.getJava1();
}

}
