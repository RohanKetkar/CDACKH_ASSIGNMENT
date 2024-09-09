package assignment3.pattern;

class P4 {
    
    public static void main(String args[]){
      int n=8;

        for(int row=1;row<=n;row++){

            int space = n-row;
            for(int col=1;col<=n;col++){

                 if(space>=1){

                    System.out.print(" ");
                    space--;

                 }else{
                System.out.print(" * ");
                 }
            }

            System.out.println();
        }
    }
}
