import java.util.*;

public class AddOne {
    public static List<Integer> addOne(int[] arr) {
        int num = 1;
        List<Integer> result = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int summation = arr[i] + num;
            result.add(summation % 10);
            num = summation / 10;
        }

        if (num > 0) {
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addOne(new int[]{1, 2, 3}));  
        System.out.println(addOne(new int[]{9, 9}));     
        System.out.println(addOne(new int[]{0}));        
        System.out.println(addOne(new int[]{1, 0, 0, 0})); 
    }
}

