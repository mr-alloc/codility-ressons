package prefixsums.passingcars;

public class PassingCars {

    /**
     * @see <a href="https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/">Passing Cars</a>
     * <p>N개의 정수를 가지며 비어있지 않은 배열 A가 주어진다. A 배열의 연속적인 요소는 길위의 연속적인 차들을 나타낸다.</p>
     * <p>A 배열은 0 과/또는 1만 포함 한다.</p>
     * <ul>
     *     <li>0은 동쪽을 여행하는 차를 나타낸다.</li>
     *     <li>1은 서쪽을 여행하는 차를 나타낸다.</li>
     * </ul>
     * <p>목표는 통과하는 차들의 개수를 세는것이다. 차들(P, Q)은 한쌍을 말하며, 0 <= P < Q < N 인 경우, P가 동쪽으로 여행할 때고, Q는 서쪽으로 여행할 때 이다. </p>
     * <p>통과하는 차들의 개수를 반환하라.</p>
     * <p>예를 들어 A 배열이 아래와 같다.</p>
     * <pre>
     * {@code
     * A[0] = 0
     * A[1] = 1
     * A[2] = 0
     * A[3] = 1
     * A[4] = 1
     * }
     * </pre>
     * <p>5개의 통과하는 차들의 쌍이다: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).</p>
     * <p>통과하는 차량 쌍의 수가 1,000,000,000개를 초과하면 -1를 반환해야 한다.</p>
     * <ul>
     *     <li>N 1..100,000 내의 정수이다.</li>
     *     <li>A의 요소는 0 또는 1이다.</li>
     * </ul>
     */
    public static int solution(int [] A) {
        int eastCars = 0;
        int passingCars = 0;

        for (int car : A) {
            if (car == 0) {
                eastCars++;
            } else if (car == 1) {
                passingCars += eastCars;
                if (passingCars > 1_000_000_000) {
                    return -1;
                }
            }
        }

        return passingCars;
    }
}
