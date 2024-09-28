package ads1.assignment1;

public class gcd1 {

    public static void gcd11(int num1,int num11){
        for(int i=2;i<num1;i++){
           
           double num28=i; 

   if(num1%2==0){
    for(int j=2;j<num11-1;j++){

      double num8=j;

    if(num11%j==0 && num11%num28==0 ){
      //if(num28==num8){

        System.out.println(num28);

      //}
    }

}

}
            
        }
    }

    public static void main(String[] args){

        gcd11(54,24);
    }

}
