
import java.util.*;

public class BinarySearchRec {

    public static void main(String[] args) {

        BinarySearchRec obj= new BinarySearchRec();
        Scanner in = new Scanner(System.in);

        System.out.println(" enter array size:");
        int n = in.nextInt();

        System.out.println(" enter no to be found:");
        int x = in.nextInt();

        int a[] = new int[n];

        System.out.println(" enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();

        int l=0;
        int h=n-1;

        int index;
        index = obj.BinarySearchf(a,l,h,x);

        if(index!=-1)
            System.out.println("no.  found at index:"+index);
        else
            System.out.println("no. not found");

    }
    int  BinarySearchf(int a[],int l,int h,int x ){


            if(l>h)
                return -1;

            int mid= l+(h-l)/2;

            if(x==a[mid])
                return mid;
            else if(x>a[mid])
                return BinarySearchf(a,mid+1, h,x );

            else
                return BinarySearchf(a,l,mid+1,x );


    }
}