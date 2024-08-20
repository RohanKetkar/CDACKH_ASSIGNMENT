package assignment1;

class quest1 {
    
    public static void main(String args[]){
        int num=10;
boolean ans = positiveornot(num);

if(ans){

    if(num==0){

System.out.println("You Enter 0");

return;
    }
    System.out.println("num is positive");
}else{

    System.out.println("num is negative");
}
    }



















static boolean positiveornot(int num){

    if(num>=0){
        return true;
    }
    
    return false;
}

}
