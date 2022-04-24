public class stringrev {
   static void rev(String c){
       int len=c.length();
       for(int i=len-1;i>=0;i--){
           System.out.print(c.charAt(i));
       }

    }
    public static void main(String arg[]){

        String st="akshat";
        rev(st);
    }
}
