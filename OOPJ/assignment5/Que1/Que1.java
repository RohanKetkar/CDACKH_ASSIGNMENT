package OOPJ.assignment5.Que1;

class Instancetracker{

    static int count=0;
public Instancetracker(){
    
count=count+1;

System.out.println("count: "+count);
}
}

public class Que1 {
    
    public static void main(String[] args){

Instancetracker i1=new Instancetracker();


Instancetracker i11=new Instancetracker();
    }
}
