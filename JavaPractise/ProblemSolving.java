import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;
import java.util.HashMap;
//import java.util.HashSet;

public class ProblemSolving {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(2,3,6,9,7,24,35));
        // ArrayList<Integer> a1 = new ArrayList<>();
        // int len = sc.nextInt();
        // int i=1;
        // while(i <= len) {
        //     a1.add(sc.nextInt());
        //        i++;
        // }
        // System.out.println(a1);
        // removeAllPrime(a1);
        // sc.close();

        // int [][] arr2 = {
        //         {1,   2,    1,   2,   1},
        //         {2,   1,    2,   1,   2},
        //         {1,   2,    1,   2,   1},
        //         {2,   1,    2,   1,   2},
        //         {1,   2,    1,   2,   1},
        //     };
        // chessBoard(arr2);

        
        //System.out.println(removeTailingZero("0051309800"));

        // int arr[] = {1,2,3,4};
        // int arr1 [] = {3,1,2,4};
        // findThePrefixCommonArray(arr, arr1);

        // int arr[] = {0,0,1,1,1,2,2,3,3,4};
        // System.out.println(removeDuplicates(arr));

        // int arr[] = {0,0,1,1,1,2,2,3,3,4};
        // int arr[] = {1,2,3};
        // System.out.println(containsDuplicate(arr));

        // int arr[] = {1,2,3};
        // System.out.println(Arrays.toString(twoSum(arr,3)));
        
        int arr[] = {1,0,2,4,3,5};
        //int arr[] = {1,2,3,4,5,0};
        maxChunks(arr);
    }

    //Q1: Given an arrayList, remove all prime numbers
    //int arr1 [] = {2,3,6,9,7,24,35};
    public static ArrayList<Integer> removeAllPrime(ArrayList<Integer> al) {
        for(int i = al.size()-1; i>=0; i--) {
            if(checkIfPrime(al.get(i))) {
                System.out.println(al.get(i));
                al.remove(i);
            }
            System.out.println("Else: " + al.get(i));
        }
        System.out.println(al);
        return al;
    }

    public static boolean checkIfPrime(Integer num) {
        int count = 0;
        for(int j = 1; j<=num; j++) {
            if(num%j == 0) {
                count++;
            }
        }
        if(count == 2) {
            return true;
        } else {
            return false;
        }
        // for (int j=1; j<num;j++) {
        //     if(num%j == 0){
        //         return false;
        //     }
        // }
        // return true;
    }

    //Q2: Given a 2D array which represents a chessboard
    //Find the difference of sum of all white and black spots
    // char [][] arr2 = {
        //         0   1     2    3    4
        //     0 {1,   2,    1,   2,   1},
        //     1 {2,   1,    2,   1,   2},
        //     2 {1,   2,    1,   2,   1},
        //     3 {2,   1,    2,   1,   2},
        //     4 {1,   2,    1,   2,   1},
        // };

    public static void chessBoard(int[][] arr) {
        int sumBlack = 0, sumWhite=0;
        for(int row=0; row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++){
                int sum = row+col;
                if(checkEven(sum)) {
                    sumWhite += arr[row][col];
                } else {
                    sumBlack += arr[row][col];
                }
            }
        }
        System.out.println("Sum of Whites: "+ sumWhite);
        System.out.println("Sum of Blacks: "+ sumBlack);
        System.out.println("Difference : " + Math.abs((sumWhite-sumBlack)));
    }

    public static boolean checkEven(int num) {
        if(num%2 == 0) {
            return true;
        } else return false;
    }

    // Problem Statement: Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.
 
    //     Input: num = "51230100"
    //     Output: "512301"
    //     Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".

    public static String removeTailingZero(String s) {
        //Below code will remove leading zeros using StringBuilder

        // StringBuilder sb = new StringBuilder(s);
        // while (sb.length() > 0 && sb.charAt(0) == '0') {
        //     sb.deleteCharAt(0);
        // }
        // return sb.toString();

        //Below code will remove tailing zeros using String Builder

        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }

    // public static void findThePrefixCommonArray(int[] A, int[] B) {
    //     int[] C = new int[A.length];
    //     HashSet<Integer> set = new HashSet<>();
    //     int count = 0;
    //     for(int i = 0; i < A.length; i++) {
    //         if (set.contains(A[i])) {
    //             count++;
    //             System.out.println("Count after A " + count);
    //         } else {
    //             set.add(A[i]);
    //         }
    //         if (set.contains(B[i])) {
    //             count++;
    //             System.out.println("Count after B " + count);
    //         } else {
    //             set.add(B[i]);
    //         }
    //         System.out.println("HashMap " + set);
    //         System.out.println("Count " + count);
    //         C[i] = count;
    //         System.out.println("Elements in C " + Arrays.toString(C));

    //     }
    //     System.out.println(Arrays.toString(C));
    //}

    //Q: Remove duplicates from Sorted Array
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1)
            return n;
      
        // To store index of next unique element
        int j = 0;
      
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
      
        arr[j++] = arr[n-1];
      
        return j;
    }

    //Contains Duplicate in an array
    //Q1: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public static boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer>  map= new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;

        //using HashSet
        // HashSet<Integer>  hm = new HashSet<>();
        // for(int i = 0; i< nums.length; i++) {
        //     if(hm.contains(nums[i])) {
        //         return true;
        //     } else {
        //         hm.add(nums[i]);
        //     }
        // }
        // return false;
    }

    // Two Sum
    //Q: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            } else {
                map.put(nums[i],i);
            }
        }
        return  new int[]{};
    }

    //769. Max Chunks To Make Sorted
    // Input: arr = [1,0,2,3,4]  [0,2,1,3,4]
    // Output: 4
    // Explanation:
    // We can split into two chunks, such as [1, 0], [2, 3, 4].
    // However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.
    public static void maxChunks(int[] arr) {
        // int max = arr[0]; //setting the first element as max
        // int chunkCount = 0;

        // for(int i = 0; i < arr.length; i++) { //traversing
        //     if (max == i) { //check if the max value and the index matches meaning if 0 is at 0th index we can create that chunk as it is at the required position
        //         chunkCount++;
        //         if(i+1 < arr.length) { //check if there exists next element in the array
        //             max=arr[i+1]; //since we have got the max element as current element we need to to update our max element for next iteration
        //         }
        //     } else if (max < arr[i]) { //we check if our max < current
        //         max = arr[i]; //we set max = current to update our max value
        //         if (max == i) { //we also check after updating our max value does max = current if yes we update the chunk count
        //             chunkCount++;
        //         }
        //     } else { //if max > current
        //         if(i+1 < arr.length && max < arr[i+1]) { //then we check for next element and update our max element for next iteration
        //             max=arr[i+1];
        //         }
        //     }
        // }
        int max = 0;
        int chunkCount = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            if (max == i) chunkCount++;
        }
        System.out.println("Total chunks : " + chunkCount);
    }

    //Q) Find the first non-repeating character from a stream of characters
    


}
