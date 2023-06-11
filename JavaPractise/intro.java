public class intro {
    int age = 12;
    String name = "Kajol";
    boolean isAdult = true;
    public static void main(String [] args) {
        // System.out.println("Hello World");
        // int marks = 65;
        // if (marks > 90) {
        //     System.out.println("Grade : A");
        // } else if (marks > 70 && marks <= 90){
        //     System.out.println("Grade : B");
        // } else if (marks > 50 && marks <= 70){
        //     System.out.println("Grade : C");
        // } else {
        //     System.out.println("Grade : D");
        // }
        // System.out.println("a : " + a);
        // System.out.println("b : " + b);

        //int a1 [] = {1,2,3,4,5};
        //int arr[] = {10, 30, 20, 14, 50, 12, 14};
        //int arr1 [] = {10,30,30,10};
        //p1(arr);
        //p2(arr);
        //p3(arr);
        //p4(arr);
        //p5(arr);
        //p6(arr1);
        //p7(arr1);
        //System.out.println(p7(arr1));
        //reverse(arr);
        //reverse1(a1);
        //multiDimen();
        // char [][] arr = {
        //     {'a', 'b', 'c', 'd'},
        //     {'e', 'f', 'g', 'h'},
        //     {'i', 'j', 'k', 'l'},
        //     {'m', 'n', 'o', 'p'},
        // };
        // char [][] arr2 = {
        //     {'a', 'b', 'c', 'd', 'f'},
        //     {'e'},
        //     {'i', 'j', 'k'},
        //     {'m', 'n', 'o', 'p'},
        // };
        //rowWise(arr);
        //colWise1(arr2);
        //spiralCol(arr);
        //spiralRow(arr);
        
        intro s1 = new intro();
        s1.age = 21;
        s1.name = "Kjo";
        System.out.println("s1 : Name : " + s1.name);
        System.out.println("s1 : Age : " + s1.age);

        intro s2 = new intro();
        s2.age = 31;
        s2.name = "Kj";
        System.out.println("s2 : Name : " + s2.name);
        System.out.println("s2 : Age : " + s2.age);  

        //swap
        intro temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("Swap: s1 : Name : " + s1.name);
        System.out.println("Swap: s1 : Age : " + s1.age);

        System.out.println("Swap: s2 : Name : " + s2.name);
        System.out.println("Swap: s2 : Age : " + s2.age);  


    }
    
    //Q1: Print all elements
    public static void p1(int[] args) {
        for(int i = 0; i<args.length; i++) {
            System.out.println(args[i]);
        }
    }

    //Q2: Print all elements in reverse order
    public static void p2(int[] args) {
        for(int i = args.length-1; i<args.length; i--) {
            System.out.println(args[i]);
        }
    }

    //Q3: Print minimum
    public static void p3(int[] args) {
        //int min = args[0];
        int min = Integer.MAX_VALUE; //this will help in over coming run time error
        for (int i = 1; i<args.length; i++) {
            // if (min > args[i]) {
            //     min = args[i];
            // }
            min = Math.min(args[i],min);
        }
        System.out.println("Minimum element in the array is " + min);
        //System.out.println("Maximum element in the array is " + args[args.length-1]);
    }
    //Q4 : Print maximum
    public static void p4(int[] args) {
        //int max = args[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i<args.length; i++) {
            // if (max < args[i]) {
            //     max = args[i];
            // }
            max = Math.max(args[i],max);
        }
        System.out.println("Maximum element in the array is " + max);
    }

    //Q5: Given and array and a target element, print the frequency of the target element
    public static void p5(int[] args) {
        int k = 14;
        int count = 0;
        for (int i = 0; i<args.length; i++) {
            if (args[i] == k) {
                count+=1;
            }
        }
        System.out.println("The target element " + k + " appers " + count + " times");
    }

    //Q6: Check if array is Palindrome
    //int arr1 [] = {10,30,30,10};
    public static void p6(int [] args) {
        boolean isPalindrome = true;
        int n = args.length;
        for (int i=0; i<=n/2 && n!=0; i++) {
            if (args[i] != args[n-i-1]) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("The given array is Palindrome ");
        } else {
            System.out.println("The given array is not a Palindrome ");
        }
    }

    //Q7 Palindrome using return type boolean instead of void
    public static boolean p7(int [] args) {
        int start = 0;
        int size = args.length;
        while (start < size) {
            if (args[start] != args[size-1]) return false;
            start++;
            size--;
        }
        return true;
    }

    //Q8 printing array in reverse all the elements in the array 
    public static void reverse(int arr[]){
        // reverse all the elements in the array 
        for(int i=arr.length-1; i>=0 && i<=arr.length; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    //Q9 reversing the  elements in the array 
    public static void reverse1(int arr[]){
        // reverse all the elements in the array
        int temp;
        int start = 0, end =  arr.length-1;
        while(start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void multiDimen(){
        int a1[][] = new int [5][5];
        a1[0] = new int[4];
        a1[1] = new int[4];
        a1[2] = new int[4];
        a1[3] = new int[4];
        a1[4] = new int[4];
        //a1[2] = new int[6];
        for(int i=1; i<a1.length; i++) {
            System.out.println(a1[i] + " ");
        }
        for(int a[]: a1) {
            for(int j = 1; j<a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }

    public static void rowWise(char[][] arr) {
        for(int row = 0; row<arr.length; row++) {
            for(int col=0; col< arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void colWise(char[][] arr) {
        for(int col = 0; col<arr[0].length; col++) {
            for(int row=0; row< arr.length; row++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void colWise1(char[][] arr) {
        //This does not work
        //int row=0, col=0;
        // while(col < arr[row].length){
        //     while(row<arr.length && row < arr[col].length) {
        //         // if (row < arr[col].length) {
        //         //     System.out.println(arr[row][col] + " ");
        //         // }
        //         System.out.println(arr[row][col] + " ");
        //         row++;
        //     }
        //     System.out.println(("Row: "+ row));
        //     row =0;
        //     col++;
        //     System.out.println();
        // }
        // System.out.println();


        int maxLength = 0;
        for(int i = 0; i < arr.length; i++){
            maxLength = arr[i].length > maxLength ? arr[i].length : maxLength;
        }

        for(int i = 0; i < maxLength; i++){
            for(int j = 0; j < arr.length; j++){
                if(i < arr[j].length){
                    System.out.print(arr[j][i]+ " ");
                }
            }
            System.out.println();
        }

        // char [][] arr2 = {
           //      0   1     2    3    4
        //     0 {'a', 'b', 'c', 'd', 'f'},
        //     1 {'e'},
        //     2 {'i', 'j', 'k'},
        //     3 {'m', 'n', 'o', 'p'},
        // };

    }

    public static void spiralCol(char[][] args) {
        // char [][] arr2 = {
        //         0   1     2    3   
        //     0 {'a', 'b', 'c', 'd'},
        //     1 {'e', 'f', 'g', 'h'},
        //     2 {'i', 'j', 'k', 'l'},
        //     3 {'m', 'n', 'o', 'p'},
        // };

        // expected output
        // a e i m 
        // n j f b 
        // c g k o 
        // p l h d 

        int col = 0, row = 0;
        boolean increment = true;
        for(; col < args[row].length;) {
            for(; 0 <= row && row < args.length;) {
                System.out.print(args[row][col]+ " ");
                if (increment) {
                    row++;
                } else row--;
            }
            boolean ans = evaluate(row);
            if (ans) {
                row = args.length - 1;
                increment = false;
            } else {
                row = 0;
                increment = true;
            }
            col++;
            System.out.println();
        }
        
    }

    public static boolean evaluate(int x) {
        if (x == 0 || x%2 == 0) return true;
        return false;
    }

    public static void spiralRow(char[][] args) {
        // char [][] arr2 = {
        //         0   1     2    3   
        //     0 {'a', 'b', 'c', 'd'},
        //     1 {'e', 'f', 'g', 'h'},
        //     2 {'i', 'j', 'k', 'l'},
        //     3 {'m', 'n', 'o', 'p'},
        // };
        
        // expected output
        // a b c d 
        // h g f e 
        // i j k l 
        // p o n m 

        int col = 0;
        boolean increment = true;
        for(int row = 0; row < args.length;) {
            for(; 0 <= col && col < args[row].length;) {
                System.out.print(args[row][col]+ " ");
                if (increment) {
                    col++;
                } else col--;
            }
            row++;
            boolean ans = evaluate(col);
            if (ans) {
                col = args[row].length - 1;
                increment = false;
            } else {
                col = 0;
                increment = true;
            }
            System.out.println();
        }
        
    }
}