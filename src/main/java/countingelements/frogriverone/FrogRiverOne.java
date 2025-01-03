package countingelements.frogriverone;

public class FrogRiverOne {

    /**
     * @see <a href="https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/">Frog River One</a>
     * <ol>
     *     <li>개구리는 강의 반대편 방향에 있는 목적 위치(X+1)로. 하지만 물에 닿지않고 떨어지는 나뭇잎을 밟고 위치까지 가야한다.</li>
     *     <li>A 정수배열은 각 인덱스 마다 시간의 초를 의미하고 값은 해당 초에 떨어지는 나뭇잎을 말한다.</li>
     *     <li>나뭇잎은 같은자리에 떨어질수 있으며, 개구리가 위치 X까지 갈 수 있는 최소 시간을 구한다.</li>
     *     <li>만약 개구리가 모든 시간을 기다려도 건널수 없다면 -1을 반환한다.</li>
     * </ol>
     */
    public static int solution(int X, int[] A) {
        int [] leaves = new int [X +1];
        int totalCount = 0;

        for(int second = 0;second < A.length;second++) {
            int position = A[second];
            if (leaves[position] == 0) {
                leaves[position] = A[second];
                totalCount++;
            }

            if (totalCount == X) {
                return second;
            }
        }

        return -1;
    }
}
