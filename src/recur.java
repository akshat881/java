public class recur {
   public static void rec(int r){
        if(r>0){

            rec(r-1);
            System.out.println("akshat");
        }
    }
    public static void main(String arg[]){
        recur.rec(4);

    }
}
