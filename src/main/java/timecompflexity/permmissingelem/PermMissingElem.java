package timecompflexity.permmissingelem;

import java.util.Arrays;

public class PermMissingElem {

    /**
     * @see <a href="https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/">Perm Missing Elem</a>
     */
    public static int solution(int [] A) {
        Arrays.sort(A);
        int essential = 1;
        if (A.length == 0) {
            return essential;
        }
        //first is missing
        if (A[0] != essential) {
            return essential;
        }
        int next = essential +1;
        for (int i = essential;i < A.length;i++) {
            if (next != A[i]) {
                return next;
            }
            next++;
        }
        return next;
    }
}
