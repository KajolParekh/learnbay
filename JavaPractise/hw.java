import java.util.*;
public class hw {
    public static void main(String[] args) {
        // int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        // secondLarge(arr);

        // int[] arr1 = new int[] {3,6,7,4,8,5,4,6,9,4,6,0};
        // findOccurrence(arr1);

        //int[] arr2 = new int[] {2,3,1,3,4,0,5,2};
        //findPeak(arr2);

        // int[] arr3 = new int[] {2,3,1,3,4,0,1,8};
        // findPeakCircular(arr3);
        //addArray();

        // int[] arr3 = new int[] {1,2,3};
        // System.out.println(sumOfElements(arr3,0));

        // int[] arr3 = new int[] {1,2,3};
        // System.out.println(productOfElements(arr3,0));
        
        //printIncrease(5);
        //printDecrease(5);
        //printDecreaseIncrease(5);

        //printDigit(765);
        //printReverseDigit(765);

        //invertedNum(21453);










        //Q1: PRIME NUMBER - Print all prime till n  >>>>>>>>>>>>>>>>>
        // int n = 33;
        // int count = 0;
        // for(int j=2;j<=n;j++){
		// 	count=0;
		// 	for(int i=1;i<=j;i++){
		// 		if(j%i==0){
		// 			count++;        
		// 		}
		// 	}
		// 	if(count==2)
		// 	System.out.print(j+"  ");     
		// }

        //Q2: Print nth fibo number
        // int n1=0,n2=1,n3,c=1,fib=6;
        // while(c<=fib) {
        //     n3 = n1+n2;
        //     n1 = n2;
        //     n2 = n3;
        //     c+=1;
        // }
        // System.out.println(n1);

        //Q3:  Given n print all n fibo numbers
        // int n1=0,n2=1,n3,c=0,fib=10;
        // while(c<fib) {
        //     n3 = n1+n2;
        //     n1 = n2;
        //     n2 = n3;
        //     c+=1;
        //     System.out.println(n1);
        // }

        //Q4: Count the digits of the number >>> 12345 = 5 , 001 = 1
        
        //SOLUTION: 1
        // String x = "00650";
        // x = x.replaceAll("^0+", "");
        // //System.out.println(Integer.toString(x,10));
        // System.out.println(x);
        // System.out.println(x.length());

        //SOLUTION:2
        // int n = 986700;
        // int remainder = n;
        // int count = 0;
        // while (n > 0) {
        //     remainder = n % 10;
        //     n = n/10;
        //     System.out.println("remainder: " + remainder);
        //     count++;
        //     System.out.println("Count: " + count);
        // }
        // System.out.println("Count: " + count);


        //Q5: Given a number reverse it
        // int x = 1101;
        // int rev = 0;
        // int lastDigit;
        // while (x > 0){
        //     lastDigit = x % 10;
        //     x = x/10;
        //     rev = rev * 10 + lastDigit;
        // }
        // System.out.println(rev);

        //Q6: Given a number and int k , rotate the number by k num = 12345 k = 1 ==> 51234
        // int num = 12345;
        // int k = -2;
        // String newNum = Integer.toString(num);
        // int len = newNum.length();
        // if (k > 0){
        //     newNum = newNum.substring(len-k) + newNum.substring(0,len-k);
        //     System.out.println(newNum);
        // } else {
        //     k = Math.abs(k);
        //     newNum = newNum.substring(k) + newNum.substring(0,k);
        //     System.out.println(Integer.parseInt(newNum));
        // }
        int num = 12345;
        int k = 2;
        int temp = num;
        int count = 0;
        while(temp > 0) {
            temp = temp / 10;
            count++;
        }
        
        int div = 1;
        int mul = 1;
        for(int i = 1; i <= count; i++){
            if (i <= k) {
                div*=10;
            } else {
                mul*=10;
            }
        }
        int r = num % div;
        num = num / div;
        int inv = num + r*mul;
        System.out.println(inv);

        //Q7: Find GCD between two numbers
        // int n1 = 81 ; 
        // int n2 = 153;
        //int gcd = 1;
        //soln 1
        // for (int i=1; i<=n1 && i<=n2; i++) {
        //     if (n1 % i ==0 && n2 %i == 0) {
        //         gcd = i;
        //     }
        // }
        // System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
       
        //soln 2
        // while (n1 != n2) {
        //     if (n1 > n2) {
        //         n1-=n2;
        //     } else {
        //         n2-=n1;
        //     }
        // }
        // System.out.println("GCD: " + n1);


        //Q8: Find lcm : We can also use GCD to find the LCM of two numbers using the following formula: LCM = (n1 * n2) / GCD
        // int n1 = 72 ; 
        // int n2 = 120;
        // int gcd = 1;
        // for (int i=1; i<=n1 && i<=n2; i++) {
        //     if (n1 % i == 0 && n2 % i == 0) {
        //         gcd = i;
        //     }
        // }
        // System.out.println("GCD: " + gcd);
        // int lcm = (n1 * n2) / gcd;
        // System.out.println("LCM: " + lcm);

        
    }
    

//         Reverse an array 
//  https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

//  Rotate an array

//  https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article



// Inverse an array
// // wil explain the question 
// In this problem you are given a number n, representing the size of array a, followed by n numbers, representing elements of array a.

// You are required to calculate the inverse of array a. Since input and output are already managed, your only work is to code a function that will return the user a new array with inverted values.

// It is important to mention to you that constraints on the values of input array, is that the values should be between 0 and n (length of input array), with no repetition so that value at each index is unique. It is because when you are inverting the array there are no 2 different values for one index and also leaving one or more index null.

// Example: Suppose, value 2 is present at index 3 in the input array so in our result array, at index 2 the value should be 3.

//     0  1  2  3  4  5
// // {4, 5, 1, 0, 2, 3}; (0-> n-1) wh n -> arr.length; no no missing  


//     0  1  2  3  4  5 idexes 
//     3  2  4  5  0  1  ->  Inversed Array

    
    public static void invertedNum(int n) {

        int i = 0;
        int ogidx = 1; //og idx
        while(n > 0) {
            int ognum = n % 10;
            int newIdx = ognum;
            int newNum = ogidx;
            i = i + ((int)Math.pow(10,newIdx - 1) * newNum);
            n = n / 10;
            ogidx++;
        }
        System.out.println(i);
    }



//Strings
/* 
  Q1: Given a string that represnts time in 12 hour format , convert it to 24 hour format
  Q2: Given an array , find 2nd largest , 2nd smallest, 3rd largest , 3rd smallest
  Q3: Given an array and target value, find the index of the last occurrence
  Q4: Given an array, find all the peak elements
        Peak elements are those whose immediate left and right elements are smaller
  Q5:  For the first and last element of the array
        move circular
        move linear
    
  Q6: Given two arrays both representing a number , 
  q1) Given two arrays both represening a number -> Find sum of two Arrays 

        a1 -> [ 1 2  3 4 ] -> 
        a2 -> [ 5 6  7 8 ]
        ans ->[ 6 9  1 2 ]   Note: You have to return an array 
        1234 + 5678 = 

        Note:-> You are not allowed to conver the array into integer

   q2) Similar to the above do the subtraction , Here also u will have to return an ans as an array 
*/

    //Q2: Given an array , find 2nd largest , 2nd smallest, 3rd largest , 3rd smallest
    public static void secondLarge(int [] arr) {
        System.out.println(Arrays.toString(arr));
        for(int i=0; i< arr.length;i++) {
            int temp =0;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Second Largest: " + arr[arr.length-2]);
        System.out.println("Third Largest: " + arr[arr.length-3]);

        System.out.println("Second Smallest: " + arr[1]);
        System.out.println("Third Smallest: " + arr[2]);

    }

    //Q3: Given an array and target value, find the index of the last occurrence
    public static void findOccurrence(int [] arr) {
        int targetValue = 4;
        int lastOcc = 0; //will hold the index
        int start =0;
        while(start < arr.length) {
            if(arr[start] == targetValue) {
                lastOcc = start;
            }
            start++;
        }
        System.out.println("Index of last occurence of target value is : " + lastOcc);
    }
    // Q4: Given an array, find all the peak elements ===> linear
    // Peak elements are those whose immediate left and right elements are smaller
    //{2,3,1,3,4,0,5,2}
    public static void findPeak(int[] arr) {
        int i=1;
        while(i+1 < arr.length && i-1 >=0 && i-1 < arr.length) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                System.out.println("Peak Element: " + arr[i]);
            }
            i++;
        }
        
    }
    // Q5: Given an array, find all the peak elements ===> circular
    // Peak elements are those whose immediate left and right elements are smaller
    //{2,3,1,3,4,0,1,8}
    public static void findPeakCircular(int[] arr) {
        int i=0;
        while(i < arr.length) {
            if(i==0) {
                if(arr[arr.length-1] < arr[i] && arr[i] > arr[i+1]) {
                    System.out.println("IF >> Peak Element: " + arr[i]);
                }
            } else if (i == arr.length-1) {
                if(arr[arr.length-1 - i] < arr[i] && arr[i] > arr[i - 1]) {
                    System.out.println("Else If>> Peak Element: " + arr[i]);
                }
            } else {
                if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                    System.out.println("Else >> Peak Element: " + arr[i]);
                }
            }
            i++;
        }
        
    }

    //Q6-A
    public static void addArray() {
        int[] a1 = {1,2,3};
        int[] a2 = {5,6,7,8,1};
        int len = Math.max(a1.length, a2.length);
        int[] ans = new int[len];
        System.out.println("Max Length : " + len);

        int n1 = addElements(a1);
        int n2= addElements(a2);

        int finalAns=0;
        System.out.println("N1  : " + n1);
        System.out.println("N2  : " + n2);
        
        finalAns = n1+n2;
        System.out.println("FinalAns  : " + finalAns);
        System.out.println("Size  : " + len);
        for(int i = len-1; i >= 0; i--) {
            int remainder = finalAns % 10;
            ans[i] = remainder;
            finalAns = finalAns / 10;
        }
        System.out.println("final Array: " + Arrays.toString(ans));

    }
    public static int addElements(int [] arr) {
        int num=0;
        for(int i=0; i < arr.length;i++) {
            num = num * 10 + (arr[i]);
        }
        return num;
    }

    //Q7: Print digits of a number from left to right i.e 768 -> 7 \n 6 \n 8
    public static void printDigit(int n) {

        int count = 0;
        int temp = n;
        while(temp > 0) {
            temp = temp / 10;
            count++;
        }
        int divider = (int)Math.pow(10, count - 1);

        while(n != 0) {
            int quotient = n/divider;
            System.out.println(quotient);
            n = n % divider;
            divider = divider/10;
        }
        
    }
    //Q8: Print digits of a number in a reverse order that is right to left . 765 ==> 5 \n 6 \n 7
    public static void printReverseDigit(int n) {
        while(n > 0) {
            int r = n % 10;
            System.out.println(r);
            n = n / 10;
        }
        
    }





    //RECURRSION
    //Q1: Find the sum of all the elements in array 
    public static int sumOfElements(int[] arr, int idx) {
        if (idx == arr.length) return 0;
        return sumOfElements(arr,idx+1) + arr[idx];
    }

    //Q2: Find product of all the elements in  the array 
    public static int productOfElements(int[] arr, int idx) {
        if (idx == arr.length) return 1;
        return productOfElements(arr,idx+1) * arr[idx];
    }

    //Q3: Incresing And Decreasing
    public static int printIncrease(int n) {
        if(n == 0) return 0;
        printIncrease(n-1);
        System.out.println(n);
        return 0;
    }
    public static int printDecrease(int n) {
        if(n == 0) return 0;
        System.out.println(n);
        printDecrease(n-1);
        return 0;
    }
    public static int printDecreaseIncrease(int n) {
        if(n == 0) return 0;
        System.out.println(n);
        printDecreaseIncrease(n-1);
        System.out.println(n);
        return 0;
    }
}
