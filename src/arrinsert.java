import java.util.*;
public class arrinsert {
    public static  void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of array");
        int a= sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++){
            int g=sc.nextInt();
             b[i]=g;

        }
        for(int i=0;i<b.length;i++) {
            System.out.print(b[i]+",");
        }


    }
}
