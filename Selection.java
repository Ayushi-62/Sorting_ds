import java.util.Scanner;

public class Selection {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println(" enter array size:");
        int n = in.nextInt();

        int a[] = new int[n];
        System.out.println(" enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int min,t=0;

        for (int i = 0; i < n; i++) {

            min=i;
            for (int j = i+1; j < a.length; j++) {

                if (a[j] < a[min]) {
                    min = j;
                }
            }
                t = a[i];
                a[i] = a[min];
                a[min] = t;


        }
        System.out.println(" array elements after sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
