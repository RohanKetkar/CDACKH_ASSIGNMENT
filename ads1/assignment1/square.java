package ads1.assignment1;

public class square {
    
    public static void square1(int num1){
     for(int i=1;i<num1;i++){
        if(i*i==num1){
            System.out.println(i);
        }
     }
    }
    public static void main(String[] args){
       square1(25); 
    }
}
