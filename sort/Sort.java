package sort;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[] {9, 12, 5, -18, 32, 38, 1, -4, 10, 0};
//        bubbleSort(arr);
//        selectSort(arr);
//        insertionSort(arr);

        for (int mas: arr) {
            System.out.println(mas);
        }
    }


    static int[] bubbleSort(int[] arr){
        for (int i = arr.length -1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]){
                    int buf = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buf;
                }
            }
        }
        return arr;
    }


    static int[] selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int buff = arr[i];
            arr[i] = arr[min];
            arr[min] = buff;
        }
         return arr;
    }

    static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int num = i - 1;
            while(num >= 0){
                if (value < arr[num]){
                    arr[num + 1] = arr[num];
                }
                else {
                    break;
                }
                num--;
            }
            arr[num + 1] = value;
        }
        return arr;
    }
}
