package countingelements.maxcounters;

public class MaxCounters {

    /**
     * @see <a href="https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/">Max Counters</a>
     * <ul>
     *     <li>N개의 카운터가 주어진다. 0으로 세팅되며, 거기엔 두개의 기능이있다.</li>
     *     <li>
     *         <ul>
     *             <li>increase(X) - 카운터 X는 1증가한다.</li>
     *             <li>max counter - 모든 카운터들은 어떤 카운터의 최대값으로 설정된다.</li>
     *         </ul>
     *     </li>
     *     <li>M개의 정수를 가지며 버이있지 않은 배열 A가 있다. 이배열은 연속적인 작업을 나타낸다.</li>
     *     <li>
     *         <ul>
     *             <li>만약 1 <= X <= N 즉, A[K] = X인 경우 K작업은 increase(X)한다.</li>
     *             <li>만약 A[K] = N인 경우 K작업은 max counter이다.</li>
     *         </ul>
     *     </li>
     * </ul>
     */
    public int[] solution(int N, int[] A) {
        int [] result = new int [N];
        int M = A.length;

        if (outOfRange(N) || outOfRange(M)) {
            return result;
        }


        for (int k = 0;k < A.length;k++) {
            int current = A[k];
            //increase
            int max = 0;
            if (current == N) {
            } else {
                result[A[k]]++;
                for (int j = 0;j < result.length;j++) {
                }
            }
        }


        return result;
    }

    public boolean outOfRange(int num) {
        return num < 1 || 100_000 < num;
    }
}
