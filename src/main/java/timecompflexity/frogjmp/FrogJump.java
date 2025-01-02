package timecompflexity.frogjmp;

public class FrogJump {
    /**
     * @see <a href="https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/">Frog Jump</a>
     */
    public static int solution(int X, int Y, int D) {
        int target = Y - X;
        int jumps = target / D;
        int mod = target % D;

        if (mod > 0) {
            jumps++;
        }

        return jumps;
    }
}
