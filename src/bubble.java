import java.util.*;
public class bubble {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int a[] =new int[b];
        System.out.println("Enter the no of elements");
        for(int i=0;i<b;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Before sorting");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("");

        for(int k=0;k<a.length-1;k++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int tem=a[j+1];
                    a[j+1]=a[j];
                    a[j]=tem;
                }
            }
        }
        System.out.println("after sorting");
        for(int n=0;n<a.length;n++){
            System.out.print(a[n]);
            if(n<a.length-1){
                System.out.print(",");
            }
        }
    }
}
