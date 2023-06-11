import java.util.Arrays;
public class fibo {
    public static void main(String[] args) {
        //iterative
        // int n1=0,n2=1,n3,c=0,fib=10;
        // while(c<fib) {
        //     System.out.println(n1);
        //     n3 = n1+n2;
        //     n1 = n2;
        //     n2 = n3;
        //     c+=1;
        // }

        // int size = 5;
        // int val = -1;
        // int[] ar1 = new int[size];
        // Arrays.setAll(ar1, i -> val);
        
        // System.out.println(fiboDP(size,ar1));

        int [] ar2 = new int[10];
        fiboDPBU(10,ar2);
    }
    //reccursive ---> this uses callstack memory (Recursion uses more memory compared to iteration because every time the recursive function is called, the function call is stored in stack.)
    public static int fiboRec(int n) {
        if(n<=1) return n;
        int f1 = fiboRec(n-1);
        int f2 = fiboRec(n-2);
        return f1+f2;
    }

    //using DP --> Memoization (Top-Down approach). It can be applied when there is overlapping sub problem
    //we store the already computed values in array, Initially we set it as -1 to imply we have not computed it and as we computed it we update the value
    public static int fiboDP(int n, int [] arr) {
        System.out.println(Arrays.toString(arr));
        if (n<=1) {
            return arr[n]=n;
        } else if(arr[n-1] != -1) {
            return arr[n-1];
        } else {
            int f1 = fiboDP(n-1, arr);
            int f2 = fiboDP(n-2, arr);
            return arr[n] = f1+f2;
        }
    }

    //using DP --> Tabulation (Bottom-Up approach)
    //In fibo type of problems i already know my base case values and the dependency to compute the values is not there, that is when tabulation can be applied.
    public static void fiboDPBU(int n, int []arr) {
        arr[0]= 0;
        arr[1]=1;
        for(int i =2; i<n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
