//import java.util.Scanner;
import java.util.HashMap;
import java.util.*;

public class stringPrac {
    public static void main(String[] args) {
        //String str = "abacabas";
        //palindromeStr(str);

        // Scanner sc = new Scanner(System.in);
        // String s1 = sc.next();
        // convertStrToInt(s1);
        // sc.close();

        String s1 = "SSSADFFESQ";
        modifyStr(s1);

        // String s2 = "SeAsAw";
        // convertUpLow(s2);
    }
    
    
    // Q1 >> print the substrings in the string that are palindrome
    // str = 'abacaba'

    public static void palindromeStr(String str) {
        //boolean isPalindrome = true;
        int start ,end;

        for(start=0; start< str.length(); start++) {
            for (end = start; end < str.length(); end++) {
                boolean isPalindrome = checkIfPalindrome(str, start, end);
                if (isPalindrome) {
                    printSubStr(str, start, end);
                    System.out.println();
                }
            }
        }
    }
    public static boolean checkIfPalindrome(String str, int start, int end) {
        int i = start, j = end;
        while (i<=j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++ ; j--;
            }
        }
        return true;
    }
    public static void printSubStr(String str, int start, int end) {
        
        while (start<=end) {
            System.out.print(str.charAt(start));
            start++;
        }
    }

    //Q2: Convert string to integer without using any in-built functions
    //Approach: The idea is to use the ASCII value of the digits from 0 to 9 start from 48 – 57. Therefore, to change the numeric character to an integer subtract 48 from the ASCII value of the character will give the corresponding digit for the given character. 
    public static void convertStrToInt(String str) {
        System.out.println(str.getClass());
        int ans = 0;
        int size = str.length();

        for(int i = 0; i< size; i++) {
            ans = ans * 10 + ((int)(str.charAt(i)) - 48);
        }
        System.out.println(ans);
    }

    //Q3: Modify String : Remove duplicates and count consecutive same character
    public static void modifyStr(String str) {
        int n = str.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int count = 1;
            while(i+1 < n && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            map.put(str.charAt(i), count);
            //System.out.print(map.get(str.charAt(i)));
              
        }
        // for(Map.Entry m : map.entrySet()){    
        //     System.out.print(m.getKey());
        //     System.out.print(m.getValue());
        // }
    }

    //Q4: convert to uppercase/lowercase
    // lower case ‘a’ has ASCII value 97 and upper case ‘A’ has ASCII value 65.
    // the difference between lowercase ASCII and upper case ASCII is 32.
    public static void convertUpLow(String str) {
         int n = str.length();
        //without stringBuilder
        // System.out.println((int)('a'));
        // System.out.println((int)('A'));
        // for(int i =0 ; i<n; i++) {
        //     if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        //         System.out.print((char) ((int) str.charAt(i) - 32));
        //     } else {
        //         System.out.print((char) ((int) str.charAt(i) + 32));
        //     }
        // }

        //with stringbuilder
        StringBuilder sb = new StringBuilder();
        System.out.println(str);
        for(int i=0 ; i<n; i++) {
            Character ch;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                int upperLen = str.charAt(i) - 'A';
                ch = (char) ((int) 'a' + upperLen);
                sb.append(ch);
            } else {
                int lowerLen = str.charAt(i) - 'a';
                ch = (char) ((int) 'A' + lowerLen);
                sb.append(ch);
            }
            
        }
        System.out.println(sb.toString());
    }
}
