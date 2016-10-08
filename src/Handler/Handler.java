package Handler;

/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */
public class Handler {
    public static int[] makeNewIncreasingSequence(int[] firstSeq, int[] secondSeq){
        if (firstSeq == null || secondSeq == null) return  null;
        int[] newSequence = new int[firstSeq.length + secondSeq.length];
        int i = 0, j = 0;
        for (int z = 0; z <= firstSeq.length + secondSeq.length - 1; z++){
            if (i >= firstSeq.length){
                newSequence[z] = secondSeq[j];
                j++;
                continue;
            }
            if (j >= secondSeq.length){
                newSequence[z] = firstSeq[i];
                i++;
                continue;
            }
            if (firstSeq[i] >= secondSeq[j]) {
                newSequence[z] = secondSeq[j];
                j++;
            }
            else {
                newSequence[z] = firstSeq[i];
                i++;
            }
        }

        return newSequence;
    }
    public static void printSeq(int[] seq) {
        for (int i : seq){
            System.out.print(" " + seq[i]);
        }
    }
}
