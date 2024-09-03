package assignment3.pattern;

class P8 {
    
    public static void main(String args[]){
      for(int row = 1;row<=5;row++)  {

        for(int col =1;col<=row;col++){

            System.out.print(col);
            if(col<row){

                System.out.print("*");
            }
        }
System.out.println();

      }
    }
}
