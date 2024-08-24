package assignment3.program;

class LargeDigit {
  
    public static void main(String args[]){
        int number = 4825;
 int max=1;
        while(number!=0){

if(number%10 >max){
    max=number%10;

}

number = number/10;
        }

System.out.println(max);

    }
}
