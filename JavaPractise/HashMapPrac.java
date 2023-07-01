import java.util.HashMap;

public class HashMapPrac {
    public static void main(String[] args) {
        // int[] a1 = new int[]{1,2,2,3,4,5,6,4,5,3};
        // int[] a2 = new int[]{4,5,2,1,4,3,2,2};
        // printAllCommonEle(a1,a2);

        int[] x = new int[]{1,2,3,4,2,3};
        int[] y = new int[]{2,4,6,8,4,6};
        findUniquePair(x,y);
    }

    //Q1: Given 2 arrays print all common numbers
    public static void printAllCommonEle(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int ele : arr1) {
            if (hm.containsKey(ele)) {
                hm.put(ele, hm.get(ele)+1);
            } else {
                hm.put(ele, 1);
            }
        }
        for(int ele: arr2) {
            if(hm.containsKey(ele) && hm.get(ele) > 0) {
                System.out.print(ele+""+ele);
                hm.put(ele, hm.get(ele)-1);
            }
        }
    }

    //Q2: Given x and y points on a cartisian plane. find total no of unique points
    public static void findUniquePair(int[] arr1, int[] arr2) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i<arr1.length; i++) {
            String keys = Integer.toString(arr1[i]) + Integer.toString(arr2[i]);
            if(hm.containsKey(keys)) {
                hm.put(keys, hm.get(keys) + 1);
            } else {
                hm.put(Integer.toString(arr1[i]) + Integer.toString(arr2[i]), 1);
            }
        }
        System.out.println(hm);
        int count = 0;
        for(String key: hm.keySet()){
            if(hm.get(key) < 2) {
                System.out.println(key.toCharArray());
                count++;
            }
        }
        System.out.println("Total unique pairs: " + count);


    }
}
