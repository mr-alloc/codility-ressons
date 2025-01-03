import countingelements.frogriverone.FrogRiverOne;
import countingelements.permcheck.PermCheck;
import timecompflexity.permmissingelem.PermMissingElem;
import timecompflexity.tapeequilibrium.TapeEquilibrium;

public class Main {
    public static void main(String[] args) {

        int solution = PermCheck.solution(new int[]{4, 1, 3, 2});
        System.out.println(solution);
    }
}
