import java.util.Scanner;
public class placm2 {

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int temp=0;
        for (int i=0;i<n;i++){
            String str=sc.next();
            int n1=sc.nextInt();
            int n3=sc.nextInt();
            int n4=sc.nextInt();
            int n5=sc.nextInt();
            int n6= sc.nextInt();
            int avg=(n1+n6+n3+n4+n5)/5;
            System.out.println("average score of "+str+": "+avg);
        }


    }
}
