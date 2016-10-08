/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */

import Handler.Handler;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class JUnitTests {
    @Test
    public void MakeIncreasingSequence_twoSequence_IncreasingSequenceReturned() {
        int[] firstSeq = {3, 4, 6, 81, 99};
        int[] secondSeq = {1, 2, 7, 8};
        int[] actual;
        int[] expected  = {1,2,3, 4, 6,7,8,81,99};
        actual = Handler.makeNewIncreasingSequence(firstSeq,secondSeq);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void MakeIncreasingSequence_EmptySequence_EmptySequenceReturned() {
        int[] firstSeq = {};
        int[] secondSeq = {};
        int[] actual;
        int[] expected  = {};
        actual = Handler.makeNewIncreasingSequence(firstSeq,secondSeq);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void MakeIncreasingSequence_null_nullReturned() {
        int[] firstSeq = null;
        int[] secondSeq = null;
        int[] actual;
        int[] expected  = null;
        actual = Handler.makeNewIncreasingSequence(firstSeq,secondSeq);
        assertArrayEquals(expected, actual);
    }
}
