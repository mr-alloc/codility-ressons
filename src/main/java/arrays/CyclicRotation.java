package arrays;

import java.util.Arrays;

public class CyclicRotation {

    public static int [] solution(int[] A, int K) {
        if (A.length == K) {
            return A;
        }
        K = K % A.length;

        System.out.println("input = " + Arrays.toString(A) + " K = " + K);
        int cursor = A.length - K;
        int [] result = new int [A.length];

        for (int i = 0;i < result.length;i++) {
            if (i < K) {
                int currentCursor = i + cursor;
                result[i] = A[currentCursor];
                System.out.println("result[i] = " + result[i] + " currentCursor = " + currentCursor);
            } else {
                result[i] = A[cursor - (A.length - i)];
                System.out.println("result[i] = " + result[i]);
            }
        }


        return result;
    }
}
