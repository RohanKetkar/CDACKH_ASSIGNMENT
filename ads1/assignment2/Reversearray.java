package ads1.assignment2;

public class Reversearray {
    
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5,6,7,8};
        int start1=0;
        int end1=arr1.length-1;

        while(end1>start1){
            int temp1=arr1[start1];
            arr1[start1]=arr1[end1];
            arr1[end1]=temp1;

            start1++;
            end1--;
            
        }

for(int i=0;i<arr1.length;i++){
System.out.print(arr1[i]);

}
    }

}
