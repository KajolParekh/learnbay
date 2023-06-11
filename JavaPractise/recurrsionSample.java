public class recurrsionSample {
    public static void main(String[] args) {
        int num1 = 5;
        int sum = sumOfNum(num1);
        System.out.println("Sum of natural numbers " + sum);
        
        int fact = factorialSample(num1);
        System.out.println("Factorial of " + num1 + " is " + fact);

        int prim = primeSample(10);
        System.out.println("Count of Prime between 1 to 10 is " + prim);

        //int arr[] = {10, 20, 30, 40, 50};
        //arrPrint(arr, 0);
        //arrPrintReverse(arr, 0);
        findPath(3);

    }

    //Q1: Sum of n natural number using recurrsion
    public static int sumOfNum(int num) {
        if (num == 0) {
            return num;
        } else {
            return num + sumOfNum(num-1) ;
        }
    }

    //Q2: Find factorial of n
    public static int factorialSample(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorialSample(num-1) ;
        }
        
    }

    //Q3: Count total no of primes
    public static int primeSample(int n) {
        if (n == 1) {
            return 1;
        } else {
            int count = primeSample(n-1);
            if(isPrime(n)) {
                return count + 1;
            } else {
                return count;
            }
        }
    }

    public static boolean isPrime(int num) {
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
    }


    //Q4: Given an array and starting index,Using recurrsion print all the elements of an array
    public static void arrPrint(int arr[], int idx) {
        // if (idx < arr.length) {
        //     System.out.println(arr[idx]);
        //     idx++;
        //     arrPrint(arr, idx);
        // }
        if (idx == arr.length) return;
        System.out.println(arr[idx]);
        arrPrint(arr, idx+1);
    }

    //Q5: Given an array and starting index,Using recurrsion print all the elements of an array in reverse order
    public static void arrPrintReverse(int arr[], int idx) {
        
        if (idx == arr.length) return;
        arrPrint(arr, idx + 1);
        System.out.println(arr[idx]);
        
    }
    // public static void displayArrRev(int[] arr, int idx) {
    //     if (idx == arr.length) return;
    //     displayArrRev(arr, idx + 1);
    //     System.out.println(arr[idx]);
    //   }

    //Q6: Given n no of stairs and you being at 0th position, print the paths if taken 1 jump and 2 jumps (Dual Recurrsion)

    //Q7: Multiple recurrsion, Given n no of stairs and from any stairs you can take upto kth jump. Find total number of path

    public static int findPath(int s) {
        if(s <= 0) {
            System.out.println("Path not Found");
            return 0;
        }
        System.out.print("J"+s);
        findPath(s-1);
        System.out.println();
        return s;



    }

}
// Move the first disk from A to C
// Move the first disk from A to B
// Move the first disk from C to B
// Move the first disk from A to C
// Move the first disk from B to A
// Move the first disk from B to C
// Move the first disk from A to C