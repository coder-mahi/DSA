import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,-2,49,33,100,55};
        InsertionSort obj = new InsertionSort();
        obj.sort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
