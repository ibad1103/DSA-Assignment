import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            }
            if (!st.isEmpty() && st.peek() == arr[i]) {
                if (i == n - 1 || arr[i + 1] != arr[i]) st.pop();
            }
        }

        int[] res = new int[st.size()];
        int m = res.length;
        for (int i = m - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5, 6};
        
        int[] result = remove(arr);
        System.out.print("Array after removing consecutive duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
