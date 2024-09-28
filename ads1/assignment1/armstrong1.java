package ads1.assignment1;

public class armstrong1 {
    
static void armstrong1(int num1){
    int num8=num1;

    String num11 = ""+num1;
    
    int num86=num1;
    double ans1=0;

    for(int i=0;i< num11.length();i++){
  
      num86=num1;
     
     
       num86 = num86%10;

       double num28=Math.pow(num86,3);

       
       ans1=ans1+num28;

       num1=num1/10;

    }
if((int)num8==(int)ans1){
    System.out.println(true);

}else{

System.out.println(false);

}
}

public static void main(String[] args){
        int num1 = 158;
       armstrong1(num1);

    }
}
