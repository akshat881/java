import java.util.Scanner;

class Solution
{
    public static void main(String arr[]) {
        int [] x = {1,1,0,1,1,1,0,1,1,1,1,1,1};
        int c = 0;
        for(int i=0; i<x.length; i++){
            if(x[i]==1)
                c++;
            else
                c=0;
        }
        System.out.println(c);
    }
    }
