package arrays;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        int result = 0;
        for (int i = 0;i < A.length;i++) {
            result ^= A[i];
        }
        return result;
    }
}
