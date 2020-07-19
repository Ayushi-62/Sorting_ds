import java.util.*;
public class Bubble {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println(" enter array size:");
        int n = in.nextInt();

        int a[] = new int[n];
        System.out.println(" enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int t;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;

                }
            }
        }
        System.out.println(" array elements after sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
