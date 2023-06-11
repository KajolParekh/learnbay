public class pattern {
    public static void printStars(int n) {
        for(int i = 1; i<=n; i++){
            System.out.print("*"+ "  ");
        }
    }

    public static void printSpace(int n){
        for(int i = 1; i<=n; i++){
            System.out.print(" "+ "  ");
        }
    }
    public static void main(String[] args) {
        //int n = 6;
        // p1(n);
        // p2(n);
        // p3(n);
        // p4(n);
        // p5(n);
        // p6(n);
        // p7(n);
        // p8(n);
        // p9(n);
        // p10(n);
        // p11(n);
        // p12(n);
        // p13(n);
        // p14(n);
        // p15(n);
        //p16(n);
        //p17(5);
        printZ(5);

        // >>>>>>>>>>>>>>>> PATTEREN PROBLEMS <<<<<<<<<<<<<<<<<<<<<<
        // 54321
        // 5432
        // 543
        // 54
        // 5
        // int n = 5;
        // for(int i=1;i<=n;i++){  
        //     for(int j=n;j>=i;j--){  
        //         System.out.print(j);  
        //     }  
        //     System.out.println();//new line  
        // }  

        // Q1
        // 12345
        // 12345
        // 12345
        // 12345
        // 12345
        // int n = 5;
        // for(int i=1;i<=n;i++){  
        //     for(int j=1;j<=n;j++){  
        //         System.out.print(j);  
        //     }  
        //     System.out.println();//new line  
        // }  

        // Q2
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // int n = 5;
        // for(int i=1;i<=n;i++){  
        //     for(int j=1;j<=i;j++){  
        //         System.out.print(j);  
        //     }  
        //     System.out.println();//new line  
        // }

        // 12345
        // 1234
        // 123
        // 12
        // 1
        // int n = 5;
        // for(int i=n;i>=1;i--){  
        //     for(int j=1;j<=i;j++){  
        //         System.out.print(j);  
        //     }  
        //     System.out.println();//new line  
        // }


        // *
        // **
        // ***
        // ****
        // *****
        // int n = 5;
        // for(int i = 1 ; i<=n;i++){
        //     for (int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();//new line 
        // }
    }
        // *
        // **
        // ***
        // ****
        // *****
    public static void p1(int n) {
        int nst = 1; // nst -> no of stars to be printed in each row  || irrespective of the value of n my first row will alsways have only 1 stars
        System.out.println("Pattern 1");
        for(int row = 1; row<=n; row++){
            printStars(nst);
            System.out.println();
            nst++;
        }
    }

    /*
         * * * * *  0 5
           * * * *  1 4
             * * *  2 3
               * *  3 2
                 *  4 1
    */ 
    public static void p2(int n) {
        System.out.println("Pattern 2");
        int nst = n;
        int nos = 0;
        for (int row = 1; row <= n; row++){
            printSpace(nos);
            printStars(nst);
            System.out.println();
            nst--;
            nos++;
        }
    }

     /*
                        *                 4 1 
                    *   *   *             3 3
                *   *   *   *  *          2 5
            *   *   *   *   *  *  *       1 7
         *  *   *   *   *   *  *  *  *    0 9
         
         for( every Line){
             -> Print some space 
            -> then immidiately print some stars 
        }
    */
    public static void p3(int n) {
        System.out.println("Pattern 3");
        int nst = 1;
        int nos = n-1;
        for(int row=1; row <=n; row++) {
            printSpace(nos);
            printStars(nst);
            System.out.println();
            nos--;
            nst+=2;
        }

    }

/*
            *                    4 1
         *  *  *                 3 3
      *  *  *  *  *              2 5
   *  *  *  *  *  *  *           1 7
*  *  *  *  *  *  *  *  *        0 9
   *  *  *  *  *  *  *           1 7
      *  *  *  *  *              2 5 
         *  *  *                 3 3
            *                    4 1
*/
    public static void p4(int n) {
        System.out.println("Pattern 4");
        int nst = 1;
        int nos = n-1;
        for(int row =1; row <=(n*2)-1; row ++) {
            printSpace(nos);
            printStars(nst);
            System.out.println();
            if (row < n) {
                nos--;
                nst+=2;
            } else {
                nos++;
                nst-=2;
            }
        }

    }
        // *****
        // ****
        // ***
        // **
        // *
    public static void p5(int n) {
        System.out.println("Pattern 5");
        int nst = n;
        int nos = 1;
        for(int row =1 ; row<=n;row ++) {
            printStars(nst);
            printSpace(nos);
            System.out.println();
            nst--;
            nos++;
        }
    }
        //             *  
        //          *  *  
        //       *  *  *  
        //    *  *  *  *  
        // *  *  *  *  * 
    public static void p6(int n) {
        System.out.println("Pattern 6");
        int nst = 1;
        int nos = n-1;
        for(int row =1 ; row<=n;row ++) {
            printSpace(nos);
            printStars(nst);
            System.out.println();
            nst++;
            nos--;
        }
    }
    //             *  
    //          *  *  
    //       *  *  *  
    //    *  *  *  *  
    // *  *  *  *  *  
    //    *  *  *  *  
    //       *  *  *  
    //          *  *  
    //             *  
    public static void p7(int n) {
        System.out.println("Pattern 7");
        int nst = 1;
        int nos = n-1;
        for(int row =1 ; row<=(n*2)-1;row ++) {
            printSpace(nos);
            printStars(nst);
            System.out.println();
            if(row<n){
                nst++;
                nos--;
            } else {
                nst--;
                nos++;
            }
        }
    }

         
        // *              
        // *  *           
        // *  *  *        
        // *  *  *  *     
        // *  *  *  *  *  
        // *  *  *  *     
        // *  *  *        
        // *  *           
        // * 
    public static void p8(int n) {
        System.out.println("Pattern 8");
        int nst = 1;
        int nos = n-1;
        for(int row =1 ; row<=(n*2)-1;row ++) {
            printStars(nst);
            printSpace(nos);
            System.out.println();
            if(row<n){
                nst++;
                nos--;
            } else {
                nst--;
                nos++;
            }
        }
    }
    // *  *  *  *  *  
    // *  *  *  *  
    // *  *  *  
    // *  *  
    // *  
    // *  *  
    // *  *  *  
    // *  *  *  *  
    // *  *  *  *  *  
    public static void p9(int n){
        System.out.println("Pattern 9");
        int nst = n;
        for(int row =1 ; row<=(n*2)-1;row ++) {
            printStars(nst);
            System.out.println();
            if(row>=n){
                nst++;
            } else {
                nst--;
            }
        } 
    }
    // *  *  *  *  *  
    //     *  *  *  *  
    //        *  *  *  
    //           *  *  
    //              *  
    //           *  *  
    //        *  *  *  
    //     *  *  *  *  
    //  *  *  *  *  *  
    public static void p10(int n){
        System.out.println("Pattern 10");
        int nst = n;
        int nos = 0;
        for(int row =1 ; row<=(n*2)-1;row ++) {
            printSpace(nos);
            printStars(nst);
            System.out.println();
            if(row>=n){
                nst++;
                nos--;
            } else {
                nst--;
                nos++;
            }
        } 
    }
/* 

*  *  *  *  *  *  *  *  *  
    *  *  *  *  *  *  *  
        *  *  *  *  *  
            *  *  *  
              *  
            *  *  *  
        *  *  *  *  *  
    *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  

*/

    public static void p11(int n){
        System.out.println("Pattern 11");
        int nst = (n*2)-1;
        int nos = 0;
        for(int row =1 ; row<=(n*2)-1;row ++) {
            printSpace(nos);
            printStars(nst);
            System.out.println();
            if(row>=n){
                nst+=2;
                nos--;
            } else {
                nst-=2;
                nos++;
            }
        }
    }
/*
    *                          *  
    *  *                    *  *  
    *  *  *              *  *  *  
    *  *  *  *        *  *  *  *  
    *  *  *  *  *  *  *  *  *  *  
 */
    public static void p12(int n) {
        System.out.println("Pattern 12");
        int nst = 1;
        int nos = (n*2)-2;
        for(int row =1 ; row<=n;row ++) {
            printStars(nst);
            printSpace(nos);
            printStars(nst);
            System.out.println();
            nst++;
            nos-=2;
        }
    }
/*
    *  *  *  *  *  *  *  *  *  *  
    *  *  *  *        *  *  *  *  
    *  *  *              *  *  *  
    *  *                    *  *  
    *                          *  
 */
    public static void p13(int n) {
        System.out.println("Pattern 13");
        int nst = n;
        int nos = 0;
        for(int row =1 ; row<=n;row ++) {
            printStars(nst);
            printSpace(nos);
            printStars(nst);
            System.out.println();
            nst--;
            nos+=2;
        }
    }
/*
 
    *                          *  
    *  *                    *  *  
    *  *  *              *  *  *  
    *  *  *  *        *  *  *  *  
    *  *  *  *  *  *  *  *  *  *  
    *  *  *  *        *  *  *  *  
    *  *  *              *  *  *  
    *  *                    *  *  
    *                          * 
 */
    public static void p14(int n){
        System.out.println("Pattern 14");
        int nst = 1;
        int nos = (n*2)-2;
        for(int row =1 ; row<=(n*2)-1;row ++) {
            printStars(nst);
            printSpace(nos);
            printStars(nst);
            System.out.println();
            if (row < n){
                nst++;
                nos-=2;
            } else {
                nst--;
                nos+=2;
            }
            
        }

    }
/*
 
        *  *  *  *  *  *  *  *  *  *  
        *  *  *  *        *  *  *  *  
        *  *  *              *  *  *  
        *  *                    *  *  
        *                          *  
        *                          *  
        *  *                    *  *  
        *  *  *              *  *  *  
        *  *  *  *        *  *  *  *  
        *  *  *  *  *  *  *  *  *  *  

 */
    public static void p15(int n){
        System.out.println("Pattern 15");
        int nst = n;
        int nos = 0;
        for(int row =1 ; row<=(n*2);row ++) {
            printStars(nst);
            printSpace(nos);
            printStars(nst);
            System.out.println();
            if (row < n){
                nst--;
                nos+=2;
            } else if (row == n){
                continue;
            }else {
                nst++;
                nos-=2;
            }
            
        }

    }
/*
        6 6 6 6 6 6 6 6 6 6 6 
        6 5 5 5 5 5 5 5 5 5 6 
        6 5 4 4 4 4 4 4 4 5 6 
        6 5 4 3 3 3 3 3 4 5 6 
        6 5 4 3 2 2 2 3 4 5 6 
        6 5 4 3 2 1 2 3 4 5 6 
        6 5 4 3 2 2 2 3 4 5 6 
        6 5 4 3 3 3 3 3 4 5 6 
        6 5 4 4 4 4 4 4 4 5 6 
        6 5 5 5 5 5 5 5 5 5 6 
        6 6 6 6 6 6 6 6 6 6 6 
 */
    public static void p16(int n) {
        System.out.println("Pattern 16");
        //determines the boundary size of the array  
        int size = 2 * n - 1;  
        //inner loop  
        for(int i = 1; i <= size; i++)  
        {  
        //outer loop      
        for(int j = 1; j <= size; j++)  
        {  
        //calculates and prints the values for pattern  
        System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");  
        }  
        System.out.println();  
        }  
    }

    public static void p17(int n){
        System.out.println("Pattern 17");
        //int size = (n*2)-1;
        for(int i = 1; i<=2*n; i++){
            for(int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            //System.out.print(i + " ");
            System.out.println();
        }
        // for(int outer = 0; outer < 3; outer++){
        //     System.out.println("The outer index is: " + outer);
        //     for(int inner = 0; inner < 4; inner++){
        //         System.out.println("\tThe inner index is: " + inner);
        //     }
        // }
    }

    // *  *  *  *  *  
    //          *
    //       *
    //    *
    // *  *  *  *  * 
    public static void printZ(int n) {
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                printStars(n);
                System.out.println();
            } else {
                printSpace(n-row);
                System.out.print("*");
                System.out.println();
            }
        }
    }
    
}
