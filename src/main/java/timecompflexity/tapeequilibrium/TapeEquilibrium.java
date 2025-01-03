package timecompflexity.tapeequilibrium;

public class TapeEquilibrium {
    /**
     * @see <a href="https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/">Tape Equilibrium</a>
     */
    public static int solution(int [] A) {

        int N = A.length;
        int totalSum = 0;
        int minDiff = Integer.MAX_VALUE;
        int leftSum = 0;

        // 전체 합 계산
        for(int num : A) {
            totalSum += num;
        }

        // 각 분할점에서의 차이 계산
        for(int P = 1; P < N; P++) {
            leftSum += A[P-1];
            int rightSum = totalSum - leftSum;
            int diff = Math.abs(leftSum - rightSum);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
