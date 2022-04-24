public class copyarr {
    public static void main(String arg[]){
        int a[]={4,5,6,7,8,9,3,2};
        int b[]=new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+",");
        }
    }
}
