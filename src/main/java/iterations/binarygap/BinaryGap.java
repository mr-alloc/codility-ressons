package iterations.binarygap;

public class BinaryGap {

    public static int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;
        while (N > 0) {
            if ((N & 1) == 0) {
                if (counting) {
                    currentGap++;
                }
            } else {
                counting = true;
                if (currentGap > maxGap) {
                    maxGap = currentGap;
                }
                currentGap = 0;
            }
            N >>= 1;
        }
        return maxGap;
    }

    //2147483647
    //6050404201
    //20509390111
}
