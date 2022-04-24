public class arrayp {
    public static void main(String []arg) {
        int ak[] = new int[10];
        int am[] = {4, 6, 7, 8, 5, 9};
        int[] c = {7, 98, 56, 45, 32};
        int u=0;

        for(int i = 0; i < am.length; i++){
            int y=am[i];
            u+=y;
        }
        System.out.println(u);
    }
}
