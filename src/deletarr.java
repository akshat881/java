public class deletarr {
    public static void main(String arg[]){
        int a[]={3,4,6,7,8,9,5};
        for(int i=3;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=0;

        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + ",");
        }
    }
}
