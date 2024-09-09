package assignment3.program;

class SumDigit {
  
    public static void main(String args[]){
        int num = 12345678;

int add=0;
        
      while(num!=0) { 
           int num1=num%10;

add=add+num1;
num=num/10;

}

System.out.println(add);

    }
}
