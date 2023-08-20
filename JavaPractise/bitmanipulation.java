
public class bitmanipulation {
    public static void main(String[] args) {
        
        //System.out.println(setKbit(10,2));
        //findKbit(37,3);
       // System.out.println(clearKbit(5,2));
       //System.out.println(toggleKbit(5,1));
       
    //    String a = "CheRrY";
    //    System.out.println(toggleCase(a.toCharArray()));

    //countSet(125);

    //int arr[] = {4, 1, 2, 9, 1, 4, 2};
    int arr[] = {4,3,4,3,4,3,7,5,6,5,6,5,6};
    notRepeated(arr);

    //System.out.println(getFirstSetBit(18));
    //getFirstSetBitLeft(0);
    //System.out.println(isPowOftwo(5));

    }
    
    
    
    
    
    //>>>>>>>>>>>>      Setting a bit      <<<<<<<<<<<<<
    // Since we all know that performing bitwise OR of any bit with a set bit results in a set bit, i.e.
    // Any bit <bitwise OR> Set bit = Set bit
    // which means,
    // 0 | 1 = 1
    // 1 | 1 = 1
    //So for setting a bit, performing a bitwise OR of the number with a set bit is the best idea.


    //Q1. How to Set a bit in the number?
    // If we want to set a bit at nth position in the number ‘num’, it can be done using the ‘OR’ operator( | ).
    // First, we left shift 1(001) to n position via (1<<n) ==> (001 << 1) = (010)
    // Then, use the “OR” operator to set the bit at that position. “OR” operator is used because it will set the bit even if the bit is unset previously in the binary representation of the number ‘num’.

    //Q1-A) Set the K-th bit of a given number.         
    //( Time Complexity: O(1) ... Auxiliary Space: O(1)    )
    public static int setKbit(int num, int pos) {
        return num |= (1 << pos);
    }

// >>>>>>>>>>>>>>>         Finding a bit        <<<<<<<<<<<<<<<<
    //Q2) - Find value of k-th bit in binary representation
    /* 
     1) Right shift the number (k-1) times, so that the kth bit comes at the right (Least Significant Bit).
      We can do this by n >> (k-1). For example for number 37(100101) and k = 3, ( 37 >> (3-1) ) will be equal to 9(1001).
     2) Then just check the last bit is set or not. We can easily do this by checking if number is odd or even.
    */
    public static void findKbit(long n , long k) {
        System.out.println((n >> (k-1)) % 2);
    }

// >>>>>>>>>>>>>>     Clearing a bit      <<<<<<<<<<<<<
/* 
    How to unset/clear a bit at n’th position in the number 
    Suppose we want to unset a bit at nth position in number ‘num’ then we have to do this with the help of “AND” (&) operator.
    First, we left shift ‘1’ to n position via (1<<n) then we use bitwise NOT operator ‘~’ to unset this shifted ‘1’.
    Now after clearing this left shifted ‘1’ i.e making it to ‘0’ we will ‘AND'(&) with the number ‘num’ that will unset bit at nth position.
*/
    //Q3) Program to clear K-th bit of a number N
    public static int clearKbit(int n, int k) {
        return n &= ~(1 << (k-1));
    }
// >>>>>>>>>>>>>>     Toggling a bit      <<<<<<<<<<<<<
/* 
    Toggling means to turn bit ‘on'(1) if it was ‘off'(0) and to turn ‘off'(0) if it was ‘on'(1) previously. 
    We will be using the ‘XOR’ operator here which is this ‘^’. 
    The reason behind the ‘XOR’ operator is because of its properties. 
    If two bits are different then the ‘XOR’ operator returns a set bit(1) else it returns an unset bit(0).
*/
    //Q4) Toggling k-th bit of a number

    public static int toggleKbit(int n, int k) {
        return n ^= (1 << (k-1));
    }
/*
    Below are simple steps to find the value of k-th bit 
        1) Left shift given number 1 by k-1 to create 
             a number that has only set bit as k-th bit.
                     temp = 1 << (k-1)
        2) Return bitwise XOR of temp and n.  Since temp
            has only k-th bit set, doing XOR would toggle 
            only this bit.
 */

    public static String toggleCase(char[] a) {
        for (int i=0; i<a.length; i++) { 
        
            // Bitwise XOR with 32 
            //the binary representation of lowercase and uppercase letters are nearly identical, with only 1 bit of difference.
            a[i]^=32; 
        } 
        return new String(a);
    }

// >>>>>>>>>>>>   Bitwise operations <<<<<<<<<<<<<
    //Q : Count set bits - to count the number of bits set to 1 (set bits) of an integer.
    // Approach : Our while loop iterates until n = 0, dividing by 2 each time via the AND operator. On pass 1, 125 becomes 62, and count increases by 1. On the second pass, 62 becomes 31, and the count increases to 2. This continues until n becomes 0 and the count is then returned.
    public static void countSet(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        System.out.println("Count : "+ count);
    }

    //Q) Bitwise XOR: Single Number - Find the element in an array that is not repeated.
    /* 
     This solution relies on the following logic:

        If we take XOR of zero and some bit, it will return that bit: a ^ 0 = a
        If we take XOR of two same bits, it will return 0: a ^ a = 0
        For n numbers, the below math can be applied: a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b
        For example,

        1 ^ 5 ^ 1 = (0) ^ 5 =5
        Therefore, we can XOR all bits together to find the unique number.
    */
    public static void notRepeated(int[] a) {
        int x = 0;
        for (int n : a) x ^= n;
        System.out.println(x);
    }

    //Q) Bitwise Left Shift: Get First Set Bit  - Given an integer, find the position of the first set-bit (1) from the right.
   
    /*
     The logic of this solution relies on a combination of left shifting and the AND operation.
    Essentially, we first check if the rightmost significant bit is the set bet using bit & 1. If not, we keep shifting left and checking until we find the bit that makes our AND operation yield 1.
    The number of shifts is tracked by our pointer, k. Once we do find the set bit, we return k as our answer.
     */
    public static int getFirstSetBit(int n) {
        if (n == 0) return 0;
        int k = 1;
        while(true) {
            if ((n & (1 >> (k-1))) == 0) {
                k++;
            } else return k;
        }
    }

    //Q) Find the first set bit using right shifting
    public static void getFirstSetBitLeft(int n) {
        if (n == 0) {
            System.out.println("Pos: 0");
        } else {
            //setting position variable
            int k = 1;
            // m variable is used to check the set bit
            int m = 1;

            //Loop until number & bit == 0 (i.e we have not found the set bit (1) yet)
            while((n & m) == 0) {
                // Perform left shift to find the set bit
                m = m << 1;
                k++;
            }
            System.out.println("Pos: "+k);
        }
    }
    //Q) To check if a given number is a power of 2
    //To check if a given number is a power of 2, we can use the bit manipulation technique. 
    //If the & operation between the given number n and given number minus one n-1 gives us 0, it is a power of 2. Otherwise, it is not.
    public static boolean isPowOftwo(int a) {
        // if (a == 0) return false;
        // if ((a & (a-1)) == 0) {
        //     return true;
        // } else return false;

        return (a == 0) ? false : ((a & (a-1)) == 0) ? true : false;
        
    }


}
