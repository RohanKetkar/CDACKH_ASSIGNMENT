package ads1.assignment1;

public class firstrepeat {
    
    static int search(String str1){
       for(int i=0;i<str1.length();i++){

        int count=0;

       for(int j=0;j<str1.length();j++){

        
             if(str1.charAt(i)==str1.charAt(j)){
            
             count=count+1;

               if(count>0){
                System.out.println(str1.charAt(i));

                return 1;
               }



             }


     }


       }

       return 0;

    }

    public static void main(String[] args){
       search("search11") ;
    }
}
