package assignment3.pattern;

class P3 {
    
    public static void main(String args[]){
        int n=10;

        int i=0;

        int k=0;
        for(int row = 1;row<=n;row++){
            int c =row;
            
            if(i==1){
                ++k;
                c=row+k;
    
            }
            for(int col =1;col<=c;col++){                
                if(row<3){
                    
                    System.out.print(" * ");
                }
                else{
                    i=1;
                    System.out.print(" * ");
                }

            }


            System.out.println();
        }
    }
}
