public class insrtarr {
    public static void main(String arg[]){
        int a[]=new int[10];
        a[0]=3;a[1]=4;a[2]=6;a[3]=7;a[4]=8;a[5]=2;
        int u=19;
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println(" ");

        for(int i=6;i>2;i--){
            a[i]=a[i-1];
        }
        a[2]=u;
        System.out.println(" ");

        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + ",");
        }
    }
}
