package countingelements.permcheck;

public class PermCheck {

    /**
     * <a href="https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/">Perm Check</a>
     * <ol>
     *     <li>배열 A는 N개의 정수로 구성되어 있다.</li>
     *     <li>A 순열은 1에서 N까지 한번만 각 요소를 포함하는 수열이다.</li>
     *     <li>예를들어 A = [4, 1, 3 ,2]는 순열이지만 [4, 1, 3]는 2가 없기 때문에 순열이 아니다.</li>
     *     <li>A가 순열인지 아닌지 확인하는게 목표이다. 순열이라면 1을, 아니라면 0을 반환한다.</li>
     * </ol>
     */
    public static int solution(int[] A) {
        int [] checks = new int [A.length];
        int concreteCount = 0;

        for (int i = 0;i < A.length;i++) {
            int index = A[i] -1;
            if (index >= A.length) {
                return 0;
            }

            if (checks[index] == 0) {
                checks[index] = 1;
                concreteCount++;
            }
        }

        if (A.length != concreteCount) {
            return 0;
        }
        return 1;
    }
}
