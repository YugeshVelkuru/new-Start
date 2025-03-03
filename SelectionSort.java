import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,7,9,10,67,89,78,65,43,32};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
