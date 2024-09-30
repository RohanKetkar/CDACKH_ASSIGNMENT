package ads1.assignment2;

public class Reversenumber1 {
    
    public static void main(String[] args){
        int num1= -12345678;

int num11=num1;

String str1="";

        while(num1>0 || num1<0 ){
            int index=num1%10;  



            if(index<0){
index=-1*index;

}else{

 index=index;   
}


str1=str1+index;


num1=num1/10;

        }

if(num11<0){

    System.out.print("-");

    System.out.println(str1);
}else{

System.out.println(str1);

}
    }

}
