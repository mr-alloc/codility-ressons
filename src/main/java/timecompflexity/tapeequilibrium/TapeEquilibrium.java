package timecompflexity.tapeequilibrium;

public class TapeEquilibrium {
    /**
     * @see <a href="https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/">Tape Equilibrium</a>
     */
    public static int solution(int[] A) {
        int smallestDifference = 100_000;


        for (int i = 1;i < A.length;i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0;j < A.length;j++) {
                if (j < i) {
                    leftSum += A[j];
                } else {
                    rightSum += A[j];
                }
            }
            int difference = Math.abs(leftSum - rightSum);
            if (difference < smallestDifference) {
                smallestDifference = difference;
            }
        }

        return smallestDifference;
    }
}
