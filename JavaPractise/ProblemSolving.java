import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;

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
}
