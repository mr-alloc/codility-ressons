package prefixsums.countdiv;

public class CountDiv {

    public static int solution(int A, int B, int K) {
        int result = (B / K) - (A / K);
        if (A % K == 0) {
            result++;
        }

        return result;
    }
}
