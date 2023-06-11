import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;

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

        int [][] arr2 = {
                {1,   2,    1,   2,   1},
                {2,   1,    2,   1,   2},
                {1,   2,    1,   2,   1},
                {2,   1,    2,   1,   2},
                {1,   2,    1,   2,   1},
            };
        chessBoard(arr2);
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
}
