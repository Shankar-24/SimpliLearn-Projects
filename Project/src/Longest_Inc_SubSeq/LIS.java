package Longest_Inc_SubSeq;

import java.util.Scanner;

class LIS {
   
    static int lis(int arr[], int n)
    {
        int temp[]=new int[n];
        int i,j,max=0;
 
        for(i=0;i<n;i++)
        {
            temp[i]=1;
        }
        for(i=1;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if (arr[i]>arr[j] && temp[i]<(temp[j]+1))
                {
                    temp[i]=temp[j]+1;
                }
            }
        }   
        for (i=0;i<n;i++)
        {
            if (max<temp[i])
            {
                max=temp[i];
            }
        }
        return max;
    }
 
    public static void main(String args[])
    {
    	int n;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter no. of elements in the sequence");
    	n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Length of LIS is " + lis(arr, n));
        sc.close();
    }
}