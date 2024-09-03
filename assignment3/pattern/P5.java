package assignment3.pattern;

class P5 {
    
    public static void main(String args[]){
        int n =8;
        
       int i=0;


        for(int row=1;row<n;row++){

            
int space = n-row;

for(int col=1;col<=n+i;col++){

if(space>=1){

    System.out.print(" ");
space--;

}else{

    System.out.print(" *");
}
}

i=i+1;
System.out.println("");
        }
    }
}
