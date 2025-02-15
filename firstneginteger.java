import java.util.*;

class Compute {
    public long[] printFirstNegativeInteger(long A[], int N, int K) {
        long[] res = new long[N - K + 1];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < K; i++) { 
            if (A[i] < 0) {
                q.add(i); 
            }
        }

        for (int i = 0; i <= N - K; i++) {
            if (!q.isEmpty()) {
                res[i] = A[q.peek()];
            } else {
                res[i] = 0;
            }

            if (!q.isEmpty() && q.peek() == i) {
                q.poll();
            }

            if (i + K < N && A[i + K] < 0) {
                q.add(i + K);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Compute obj = new Compute();
        long[] A = {12, -7, -8, 15, 16, 28};
        int N = A.length, K = 3;

        long[] result = obj.printFirstNegativeInteger(A, N, K);
        System.out.println("First negative integers in each window:");
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
