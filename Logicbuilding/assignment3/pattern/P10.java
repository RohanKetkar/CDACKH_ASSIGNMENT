package assignment3.pattern;

public class P10 {
 
    public static void main(String[] args) {
        

        

        for (int row = 1; row <= 4; row++) {
             

             int num = 1;
            
            for (int col = 1; col <= row; col=col+1) {
                
                if (num % 2 != 0) {
                    System.out.print(num); 
                }

                if (col < row) {
                    System.out.print("*"); 
                }

                num =num+2; 
            }

            System.out.println(); 
        }
}

}