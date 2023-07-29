import java.util.Arrays;
import java.util.Stack;

public class StacksPrac {
    public static void main(String[] args) {
        // Stack <Integer> st = new Stack<>();
        // st.add(10);
        // st.add(20);
        // st.add(30);
        // System.out.println(st.size());
        
        //System.out.println(hasredundantBrackets("(a+((b+c)))"));
        //System.out.println(hasBalancedBrackets("{[]}"));
        //minAddForBalancedStr("(a)+b)((d");

         //int arr1 [] = {2,5,9,3,1,12,6,8,7};
         //int arr1 [] = {11,9,8,7,6,5,4,3,2,1,10};
         //nextGreaterOnLeft(arr1);
         //int arr1 [] = {3,10,4,2,1,2,6,1,7,2,9};
         //nextGreaterOnRight(arr1);
         //nextGreaterIndexOnLeft(arr1);

         decToBin(8);
    }
// >>>>>>>>>>>>>>>>>>>>>> Redundant Brackets  <<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Q1: Expression contains redundant bracket or not
    //to find in the given expression if or not the parenthesis are in use (a+(b+c)) ==> Valid, ((a+b)) ==> Invalid as start and end brackets have no use.
     
    //The steps are as follows :
        // Define a stack, for keeping track of all characters except for closing brackets.
        // Iterate through the string and whenever we encounter an opening bracket or an operator/operands/characters( { ‘(’, ‘+’, ‘-’, ‘*’, ‘/’, 'a', 'b' } ) we will push the current character to the stack.
        // Whenever we encounter ‘)’ in the string
            //if we find an opening bracket at the peak element we return false ==> impying redundant brackets
            //else we will pop characters from the stack until we pop an opening bracket { ‘(‘ }  from the stack

    public static boolean hasredundantBrackets(String s) {
        Stack <Character> st = new Stack<>();
        for(int i=0; i< s.length(); i++) {
            if(!st.isEmpty() && s.charAt(i) == ')') {
                if ( '(' == st.peek() ) return false;
                else {
                    while (!st.isEmpty() && st.peek() != '(') {
                            st.pop();
                    }
                    st.pop();
                }
                
            } else st.add(s.charAt(i));
        }
        return true;
    }

// >>>>>>>>>>>>>>>>>>>>>> Balanced Paranthesis  <<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Q2: A string will have different types of parenthesis, figure out if there exists invalid bracket

    //Case 1 : (a+{[b+c]}) , output : true
    //Case 2 : (a+{[b+c]}}) , output : false
    public static boolean hasBalancedBrackets(String s) {
        // Stack <Character> st = new Stack<>();
        // for(int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        //         st.add(s.charAt(i));
        //     } else {
        //         if(!st.isEmpty()) {
        //             switch (s.charAt(i)) {
        //                 case ')':
        //                     if(st.peek() != '(') return false;
        //                     else st.pop();
        //                     break;
        //                 case '}':
        //                     if(st.peek() != '{') return false;
        //                     else st.pop();
        //                     break;
        //                 case ']':
        //                     if(st.peek() != '[') return false;
        //                     else st.pop();
        //                     break;
        //                 default:
        //                     break;
        //             }
        //         }
        //     }
        // }
        // return true;
        Stack<Character> st = new Stack<>();
        //if only one element in a string of parenthesis will be invalid
        if (s.length() == 1) return false;
        for(int i = 0; i < s.length(); i++) {
            if(!st.isEmpty()) {
                switch (s.charAt(i)) {
                        case ')':
                            if(st.peek() != '(') return false;
                            else st.pop();
                            break;
                        case '}':
                            if(st.peek() != '{') return false;
                            else st.pop();
                            break;
                        case ']':
                            if(st.peek() != '[') return false;
                            else st.pop();
                            break;
                        default:
                            st.add(s.charAt(i));
                            break;
                    }
                } else {
                    st.add(s.charAt(i));
                }
        }
        if (st.size() > 0) {
            return false;
        } else return true;
    }

    //Q : Minimum addition to make a string balanced.
    public static void minAddForBalancedStr(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.size() == 0 && (s.charAt(i) == '(' || s.charAt(i) == ')')) {
                st.add(s.charAt(i));
            } else {
                if ((s.charAt(i) == '(' && st.peek() == ')') || (s.charAt(i) == ')' && st.peek() == '(')) {
                    st.pop();
                } else {
                    if ((s.charAt(i) == '(' || s.charAt(i) == ')')) st.add(s.charAt(i));
                } 
            }
        }
        System.out.println("Minimum addition required to make a string balanced is " + st.size());
    }

// >>>>>>>>>>>>>>>>>>>>>> Next Greater Elemet using Stacks <<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //Q3
    //Input          2   5   9   0   1   12  6   8   7
    //final answer:  -1  -1  -1  9   9  -1  12  12   8
    //steps:
        // Using a (for)loop to iterate over the string
        //using a loop until stack is empty and current character is either greater than or equal to the peak charachter
        //once out of the loop, check if the stack is empty, if yes then it means there is no greater element than the current element hence print -1
        //else we print the peak element
        //add the element in the stack
    //time complexity: O(N)
    //space complexity: O(N)
    public static void nextGreaterOnLeft(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i< arr.length ; i++) {
            while(st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.size() == 0 ) {
                System.out.print("-1" + " ");
            } else {
                System.out.print(st.peek() + " ");
            }
            st.add(arr[i]);
            // if (!st.empty()) {
            //     while(st.size() > 0 && arr[i] >= st.peek()) {
            //         st.pop();
            //     }

            //     if (st.size() == 0 ) {
            //         System.out.print("-1" + " ");
            //     } else {
            //         System.out.print(st.peek() + " ");
            //     }
            //     st.add(arr[i]);
            // } else {
            //     System.out.print("-1" + " ");
            //     st.add(arr[i]);
            // }
        }
    }
    
    //Input          2   5   9   0   1   12  6   8   7
    public static void nextGreaterOnRight(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int ans [] = new int[arr.length];
        ans[arr.length - 1] = -1;
        st.add(arr[arr.length -1]);
        for (int i = arr.length - 2 ; i > -1 ; i--) {
            while(st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.size() == 0 ) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.add(arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
    //Q: Find the index of the greatest element on the left
    //11,9,8,7,6,5,4,3,2,1,10
     public static void nextGreaterIndexOnLeft(int[] arr) {
        int ans [] = new int[arr.length];
        ans[0] = -1;
        int temp = 0; //will store the index of the highest element
        for (int i = 1 ; i < arr.length ; i++) {
            if(arr[i] > arr[i-1]) {
                if (arr[i] < arr[temp]) {
                    ans[i] = temp;
                } else {
                    ans[i] = -1;
                }
                if(arr[i] > arr[temp]) temp = i;
            } else {
                ans[i] = i-1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

// >>>>>>>>>>>>>>>>>>>>>      Largest Rectangle in Histogram      <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
    // input is [2, 1, 5, 6, 2, 3]
    // loop through the length of heights
    // find the width from the current height on the left and right
        //find smaller height than current on left and right

    public static void areaOfRectInHisto(int[] arr) {
        //int ans [] = new int[arr.length];
        // for (int i = 0 ; i < arr.length ; i++) {
        //     int sl = 1 ; int sr = 1;
        //     if (i > -1 && arr[i] <= arr[i-1]) sl++;
        //     if (i > -1 && arr[i] <= arr[i+1]) sr++;

        // }
        
    }
// >>>>>>>>>>>>>>>>>>>>>      Decimal to Binary using stacks      <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Auxiliary Space: O(log2N)
    //Time Complexity: O(log2N)
    public static void decToBin(int a) {
        //divide and store the remainder in stacks until the number is 
        Stack <Integer> st = new Stack<>();
        while (a > 0) {
            int r = a % 2;
            st.add(r);
            a = a / 2;
        }
        while(!st.empty()) System.out.print(st.pop());
    }

}
