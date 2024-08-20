package assignment1;

class quest6 {
    
public static void main(String args[]){

System.out.println("largest num is : "+largest(110,80,280));
}

static int largest(int num1 , int num2 ,int num3){

    int ans = num1;
    
if(num1>num2 && num1>num3){

     ans = num1;
}

if(num2>num3 && num2>num1){
System.out.println("ok");
    ans = num2;
}

if(num3 > num1 && num3 >num2){

    ans = num3;
}






return ans;

}
}
