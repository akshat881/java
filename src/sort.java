public class sort {
    public static void main(String arg[]){
        int a[]={46,6,7,85,9,2,99};

        for(int k=0;k<a.length-1;k++){
            boolean swapped = true;

            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int tem=a[j+1];
                    a[j+1]=a[j];
                    a[j]=tem;
                    swapped=false;
                }
            }
            if (swapped==true)
                break;
        }
        System.out.print("[");
        for(int k=0;k<a.length;k++){

        System.out.print(a[k]);
        if(k<a.length-1){
            System.out.print(",");
        }
        }
        System.out.print("]");
    }
}
