public class sortingPrac {
    public static void main(String[] args) {
        int arr1[] = new int[]{6,1,4,3,2,5};
        display(arr1);
        insertionSort(arr1);
        display(arr1);
        // BubbleSort(arr1);
        // display(arr1);
    }
    // public static void BubbleSort(int arr[]) {
    //     for(int i = 0; i < arr.length; i++) {
    //         //compare and swap loop
    //         while(arr[i] < arr[i+1] && i+1 < arr.length) {
    //             swap(arr, arr[i], arr[i+1]);
    //         }
    //     }
    // }
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void display(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // public static void selectionSort(int arr[]) {
    //     for(int i = 1; i < arr.length; i++) {
    //         int pointer = arr[i];
    //         int j = i-1;
    //         while ( j>=0 && arr[j] > pointer) {
    //             arr[j+1]=arr[j];
    //             j-=1;
    //         }

    //     }
    // }

    public static void insertionSort(int arr[]) {
        //we start with index = 1 as first element is considered sorted
        for(int i = 1; i < arr.length; i++) { //this loop moves forward
            for (int j = i-1; j>=0; j--) { // this loop moves backward for comparison
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                } else break; //if i is greater than j than we break out of the loop
            }
        }
    }
}
