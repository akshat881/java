public class arrotat {
    public static void main(String arg[]){
       int a[]={3,6,8,7,9,5};
       int b=a[0];

       for(int i=0;i<a.length-1;i++){
           a[i]=a[i+1];
       }
       a[a.length-1]=b;
       for(int i=0;i<a.length;i++){

           System.out.print(a[i]+",");
       }
    }
}
