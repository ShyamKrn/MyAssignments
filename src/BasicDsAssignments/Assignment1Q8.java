package BasicDsAssignments;
import java.util.Scanner;
class BubbleSort{
    public int[] bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort obj=new BubbleSort();
        int arr1[]=obj.bubbleSort(arr);
        for(int i=0;i< arr1.length-1;i++)
        {
            System.out.print(arr1[i]+" ");
        }

    }
}


