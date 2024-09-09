package assignment3.pattern;

/*
 
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2

 */
class P2 {
    
    public static void main(String args[]){
        for(int row=1;row<=5;row++){

            for(int colmn=1;colmn<=row;colmn++){

                if(row==1){
                    System.out.print(row);

                    break;
                }
                System.out.print(row);
                if(colmn<row){

                    System.out.print("*");
                }
            }

            System.out.println();

        }
        for(int row=5;row>1;row--){
            for(int colmn=1;colmn<=row;colmn++){

                System.out.print(row);
                if(colmn<row){

                    System.out.print("*");
                }
            }

            System.out.println();

        }

    }
}
