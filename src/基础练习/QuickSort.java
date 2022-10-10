package 基础练习;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 5, 8, 3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int a,int b){
        int start = a;
        int end = b;

        if (start>=end){
            return;
        }

        // 基准数
        int temp = arr[start];
        while (start<end){
            while (start<end&&arr[end]>temp){
                end--;
            }
            if (start<end) {
                arr[start] = arr[end];
                start++;
            }
            while (start<end&&arr[start]<temp){
                start++;
            }
            if (start<end){
                arr[end] = arr[start];
                end--;
            }
        }
        arr[start] = temp;
        sort(arr,a,start-1);
        sort(arr,start+1,b);
    }
}
