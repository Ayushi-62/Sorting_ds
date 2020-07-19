import java.util.Scanner;

public class Merge {
    int a[];
    int t[];
    int l;


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println(" enter array size:");
        int n = in.nextInt();

        int arr[] = new int[n];


        System.out.println(" enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Merge ms = new Merge();
        ms.sort(arr);

        System.out.println(" array elements after sorting:");
        // for (int i = 0; i < arr.length; i++) {
        //   System.out.print(arr[i] + " ");
        //}
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }


    public void sort(int arr[]) {
        this.a = arr;
        this.l = arr.length;
        this.t = new int[l];
        divide(0, l - 1);
    }

    public void divide(int l, int h) {

        if (l < h) {
            int mid = (l + h) / 2;

            divide(l, mid);
            divide(mid + 1, h);
            merges(l, mid, h);
        }
    }

    public void merges(int l, int mid, int h) {

        for (int i = l; i <= h; i++) {
            t[i] = a[i];
        }

        int i = l;
        int j = mid + 1;
        int k = l;

        while (i <= mid && j <= h) {

            if (t[i] <= t[j]) {
                a[k] = t[i];
                i++;
            } else {
                a[k] = t[j];
                j++;
            }

            k++;

        }

        if(i>mid) {

            while (j <= h) {
                a[k] = t[j];
                k++;
                j++;
            }
        }
        else {
            while (i <= mid) {
                a[k] = t[i];
                k++;
                i++;
            }
        }


    }
}