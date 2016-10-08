package Main;

import Handler.Handler;

public class Main {

    public static void main(String[] args) {
        int[] firstSeq = {3, 4, 6, 81, 99};
        int[] secondSeq = {1, 2, 7, 8};
        int[] result = Handler.makeNewIncreasingSequence(firstSeq, secondSeq);
        Handler.printSeq(result);
    }
}
