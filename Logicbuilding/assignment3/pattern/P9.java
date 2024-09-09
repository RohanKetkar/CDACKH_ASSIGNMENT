package assignment3.pattern;

public class P9 {
    
    public static void main(String args[]){
for(int row =5;row>=1;row--){

    for(int col =5;col>=row;col--){

        System.out.print(col);
if(col>row){

    System.out.print("*");
}

    }

    System.out.println();
}

    }
}
