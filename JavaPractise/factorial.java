public class factorial {
    //int storage [];
    static int findfactorial(int num) {
        if (num == 1 || num ==2) {
            return 1;
        } else {
            return num * findfactorial(num-1);
        }
    }
    public static void main(String [] args) {
        System.out.println(findfactorial(5));
    } 
}
