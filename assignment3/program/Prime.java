package assignment3.program;

class Prime {
    
    public static void main(String args[]){
System.out.println("Prime");
    
     for(int i =2;i<13;i++){  
        
        boolean prime=true;

        for(int j=2;j<i;j++){
            if(i%j==0){
                prime=false;
                break;
            }
        }
        if(prime){

            System.out.println(i);
        }

     }   
        
    }

}
