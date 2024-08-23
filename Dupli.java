import java.util.Scanner;

class Dupli {
    

    public static void main(String[] args) {
        String str1 = "mississippi";
        char[] str11 =str1.toCharArray();  

int fin1 =1;
for(int i=0;i<str11.length;i++){
    int count=0;
    for(int j=0;j<str11.length;j++){
        if(str11[i]==str11[j]){
            count=count+1;
            if(count >1){
                System.out.println(str1.charAt(i)+" - "+count+" times");

                fin1=10;
                str11[i]='0';
                
            }
            
        }
    }
    if(i==0){
    System.out.println("Duplicate Characters:");
}
}
if(fin1==1){
System.out.println("No Duplicate");
}
}
}