import java.util.Scanner;
public class placmenpract {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        while(a>0){
            int su=a%10;
            a=a/10;
            sum=sum+su;

        }
        System.out.println(sum);
    }
}
