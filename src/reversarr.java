public class reversarr {
    public static void main(String arg[]){
        int a[]={4,5,6,7,8,9,3,2};
        int b[]=new int[a.length];
        int j=a.length;


        for(int i=0;i<a.length;i++){
           b[j-1]=a[i];
           j=j-1;
        }

        System.out.println("");


                for (int k = 0; k <a.length; k++) {
                    System.out.print(b[k] + ",");
                }


    }
}

//  another logic
/*
    int low = 0, high = n - 1;

    	while(low < high)
        {
        int temp = arr[low];

        arr[low] = arr[high];

        arr[high] = temp;

        low++;
        high--;
    */