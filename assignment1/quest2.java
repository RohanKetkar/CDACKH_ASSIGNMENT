
package assignment1;

class quest2 {
    
    public static void main(String args[]){
int ans = oddeven(0);

if(ans==1){

System.out.println("num is even");

}else{
    
System.out.println("num is odd");

}
    }

static int oddeven(int num){

    if(num%2==0){
        return 1;
    }
    return 0;
}

}
