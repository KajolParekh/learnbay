import java.util.Arrays;
import java.util.HashSet;

public class HashSetPrac {
    public static void main(String[] args) {
        //printUniqueElements();
        int[] arr1 = new int[]{1,2,2,3,5};
        //System.out.println(doesTargetPairExists(arr1, 4));
        //findPair(arr1,4);
        findNoOfPair(arr1,4);
    }

    //Q1: Given 2 arrays print all the common elements : Time complexity is O(N^2)
    public static void printUniqueElements() {
        int[] arr1 = new int[]{2,3,5,4,3,2,8};
        int[] arr2 = new int[]{1,2,7,5,8,3,2};

        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));

        HashSet<Integer> hs = new HashSet<>();
        
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr2.length; j++) {
        //         if (arr1[i] == arr2[j]) {
        //             // add common elements
        //             hs.add(arr1[i]);
        //             break;
        //         }
        //     }
        // }
        // System.out.println("Common elements in both the  arrays are : " + hs);
        for (int element : arr1) hs.add(element);
        for (int ele : arr2) {
            if (hs.contains(ele)) {
                System.out.print(ele + " ");
                hs.remove(ele);
            }
        }
        //first find all unique elements of arr1 using HashSet 
        //Second loop all elements of arr2 in hs if found print and then remove it from set so that we dont print it twice

    }

    //Q2: Given a target find if a pair exist whose sum is equal to the target  ==>>>> The time complexity of the above solution is O(n) and requires O(n) extra space
    public static boolean doesTargetPairExists(int[] arr, int target) {
        HashSet<Integer> hs = new HashSet<>();
        //check if target - element is present in hs i.e 10 - 1 = 9 present in hs if yes return true, else add ele in hs
        for(int ele: arr) {
            if (hs.contains(target - ele)) {
                return true;
            } else hs.add(ele);
        }
        return false;
    }

    //Q3: Find a pair with the given sum in an array
    public static void findPair(int[] arr, int target) {
        HashSet<Integer> hs = new HashSet<>();
        for(int ele: arr) {
            if (hs.contains(target - ele)) {
                System.out.println("Pair found " + (target - ele) + " " + ele);
            } else hs.add(ele);
        }
    }
    //Q4: Find a pair with the given sum in an array
    public static void findNoOfPair(int[] arr, int target) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int ele: arr) {
            if (hs.contains(target - ele)) {
                count++;
            } else hs.add(ele);
        }
        System.out.println("No of Pair found : " + count);
    }


}
