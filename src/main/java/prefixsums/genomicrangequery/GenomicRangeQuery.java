package prefixsums.genomicrangequery;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class GenomicRangeQuery {

    /**
     * <p>DNA 순서는 A, C, G 그리고 T로 구성된 문자열로 표현될 수 있으며, 이는 연속적인 뉴클레오티드유형에 해당한다.
     * 각 nucleotide 는 <i>impact factor</i>를 갖고 있으며, 이는 정수이다.</p>
     * <p>A, C, G 그리고 T 유형의 뉴클레오티드들은 각각 1, 2, 3 그리고 4의 <i>impact factor</i>를 갖고 있다.</p>
     * <p>당신은 다음의 형식의 몇몇 쿼리에 답을할것이다: 주어진 DNA 순서의 특정 부분에 포함된 뉴클레오티드의 최소 impact factor가 무엇인가?</p>
     * <br/>
     * <p>DNA 순서는 N개 의 문자들로 구성된 문자열 S = S[0]S[1]...S[N-1]으로 주어진다. M개의 쿼리들이 있고, 이는 비어있지 않은 P 와 Q 배열 들이며, 각각 M개의 정수로 구성되어있다.</p>
     * <p>K번째 쿼리(0 ≤ K < M)에서는 P[K]와 Q[K] 위치(포함) 사이의 DNA 시퀀스에 포함된 뉴클레오티드의 최소 영향 인자를 찾아야 한다</p>
     * A: 1, C: 2, G: 3, T: 4
     *
     */
    public static int[] solution(String S, int[] P, int[] Q) {
        //Implemented Solutions
        int N = S.length();
        int M = P.length;
        int [] result = new int[M];

        int [] prefixA = new int[N +1];
        int [] prefixC = new int[N +1];
        int [] prefixG = new int[N +1];

        for (int i = 0;i < N;i++) {
            prefixA[i +1] = prefixA[i];
            prefixC[i +1] = prefixC[i];
            prefixG[i +1] = prefixG[i];

            char nucleotide = S.charAt(i);
            if (nucleotide == 'A') {
                prefixA[i +1]++;
            } else if (nucleotide == 'C') {
                prefixC[i +1]++;
            } else if (nucleotide == 'G') {
                prefixG[i +1]++;
            }
        }

        for (int k = 0;k < P.length;k++) {
            int start = P[k];
            int end = Q[k] +1;

            if (prefixA[end] - prefixA[start] > 0) {
                result[k] = 1;
            } else if (prefixC[end] - prefixC[start] > 0) {
                result[k] = 2;
            } else if (prefixG[end] - prefixG[start] > 0) {
                result[k] = 3;
            } else {
                result[k] = 4;
            }
        }

        return result;
    }
}
