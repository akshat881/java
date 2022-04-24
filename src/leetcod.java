public class leetcod {
    void mango(int c[],int b[]){
        int j=c.length;


        for(int i=0;i<c.length;i++){
            b[j-1]=c[i];
            j=j-1;
        }

    }
    public static void main(String arg[]){
        leetcod aru=new leetcod();
        int a[]={1,2,3,5,6,7};
        int b[]=new int[a.length];
        aru.mango(a,b);
        for (int x:b) {
            System.out.print(x+",");

        }


    }

}
