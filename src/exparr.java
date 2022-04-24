public class exparr {
    public static void main(String arg[]) {
        int a[] = {3, 5, 7, 8, 9, 6};
        int u = a[0];

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = u;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
