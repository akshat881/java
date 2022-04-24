public class arr2 {
    public static void main(String arg[]){
        int arr[]={2,3,6,6,5};
        int m1=arr[0];
        int m2=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>m1){
                m2=m1;
                m1=arr[i];

            }
            else if(arr[i]>m2){
                m2=arr[i];
            }
        }
        System.out.println(m1);
        System.out.println(m2);


    }
}
