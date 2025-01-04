package countingelements.missinginteger;

import java.util.Arrays;

public class MissingInteger {

    /**
     * @see <a href="https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/">Missing Integer</a>
     * <ul>
     *     <li>N개의 정수를 가지는 배열 A가 주어진다. A 에서 존재하지 않는 가장 작은 양의정수를 반환하라.</li>
     *     <li>예를 들어 [1, 3, 6, 4, 1, 2]가 주어지면 5를 반환 해야한다.</li>
     *     <li>A = [1, 2, 3]은 4를, A = [-1, -3]은 1을 반환 해야한다.</li>
     *     <li>N은 [1..100,00] 범위이다.</li>
     *     <li>A의 요소의 범위는 [-1,000,000..1,000,000]이다.</li>
     * </ul>
     */
    public static int solution(int[] A) {
        Arrays.sort(A);
        int current = 0;
        for (int a : A) {
            int expected = current +1;

            if (a <= 0) {
                continue;
            }

            //전과 값이 같은경우 스킵, 1증과된 경우 current도 증가
            if (current == a) {
                continue;
            }

            if (expected == a) {
                current++;
            }
        }

        return current == 0 ? 1 : ++current;
    }

    public static int best(int [] A) {

        int N = A.length;
        boolean[] seen = new boolean[N + 1];

        // 양수의 등장 여부 체크
        for (int num : A) {
            if (num > 0 && num <= N) {
                seen[num] = true;
            }
        }

        // 가장 작은 양수 찾기
        for (int i = 1; i <= N; i++) {
            if (!seen[i]) {
                return i;
            }
        }

        // N까지 모든 숫자가 존재하는 경우
        return N + 1;
    }
}
