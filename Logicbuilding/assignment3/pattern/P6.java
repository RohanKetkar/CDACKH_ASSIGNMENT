package assignment3.pattern;

class P6 {
    
    public static void main(String args[]){
        for(int row=0;row<=4;row++){

int space = row;


            for(int col =0;col<=4-row;col++){

             while(space!=0){

                System.out.print(" ");
                space--;

             }

             System.out.print(" *");

            
            }




         System.out.println();

        }

}

    


}





