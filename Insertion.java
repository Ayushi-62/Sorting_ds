import java.util.*;
public class Insertion {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println(" enter array size:");
        int n = in.nextInt();
        int t;
        int a[] = new int[n];
        System.out.println(" enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 1; i < n; i++) {
            t = a[i];
            int  j=i;
            while ( j >0 &&a[j-1]>t) {
                   a[j]=a[j-1];
                   j--;
                }
            a[j]=t;

        }
        System.out.println(" array elements after sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        }
    }