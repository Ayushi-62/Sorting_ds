//o(log n)---->worst case

import java.util.*;

    public class BinarySearch {

        public static void main(String[] args) {

            BinarySearch obj= new BinarySearch();
            Scanner in = new Scanner(System.in);

            System.out.println(" enter array size:");
            int n = in.nextInt();

            System.out.println(" enter no to be found:");
            int x = in.nextInt();

            int a[] = new int[n];

            System.out.println(" enter array elements:");
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();

            int index;
            index = obj.BinarySearchf(a,n,x);

            if(index!=-1)
                System.out.println("no.  found at index:"+index);
            else
                System.out.println("no. not found");

        }
            int  BinarySearchf(int a[],int n,int x ){

                int  l=0;
                int h=n-1;
                while(l<=h){

                    int mid= l+(h-l)/2;

                    if(x==a[mid])
                        return mid;
                    else if(x>a[mid])
                            l=1+mid;
                    else
                            h=mid+1;
                }
                return -1;

            }
    }