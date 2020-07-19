//worst case: O(n^2)
import java.util.*;
public class Quick {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println(" enter array size:");
        int n = in.nextInt();

        int arr[] = new int[n];


       System.out.println(" enter array elements:");
       for (int i = 0; i < n; i++) {
           arr[i] = in.nextInt();
       }

       int l=0;
       int h=n-1;

       Quick qs = new Quick();
       qs.quicksort(arr,l,h);

        System.out.println(" array elements after sorting:");
    //for (int i = 0; i < n; i++) {
    //  System.out.print(arr[i] + " ");
    //}
        for (int i :arr) {
        System.out.println(i + " ");
        }

  }


 public void quicksort(int arr[],int l,int h) {

        if(l<h) {
            int v = partition( arr, l, h);
            quicksort(arr, l, v - 1);
            quicksort(arr, v + 1, h);
        }
 }

  public int partition(int arr[],int l,int h){
        int start= l;
        int end =h;
        int pivot= arr[l];

        while(start<end){
            while(arr[start]<=pivot && start<h)
                start++;

            while(arr[end]>pivot)
                end--;

            if(start<end)
              swap(arr,start,end);

        }

     //   swap(arr,arr[l],arr[end])
        arr[l]=arr[end];
       arr[end]=pivot;
        return end;
    }

   public void swap(int[] arr,int start,int end){
        int t=arr[start];
        arr[start]=arr[end];
        arr[end]=t;

    }
}