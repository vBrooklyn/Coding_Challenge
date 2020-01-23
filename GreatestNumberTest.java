import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GreatestNumberTest {

    @Test
    public void testSingleGreatestNumber() {
        GreatestNumber gNumber = new GreatestNumber();
        List<Integer> expected = Arrays.asList(8);
        assertArrayEquals(expected.toArray(), gNumber.getMostRepeatingNumbers(new int[] {8, 100, 5, -100, 7, 2, 8, 9, 6, 9, 8}).toArray());
    }

    @Test
    public void testAllSameValues() {
        GreatestNumber gNumber = new GreatestNumber();
        List<Integer> expected = Arrays.asList(0);
        assertArrayEquals(expected.toArray(), gNumber.getMostRepeatingNumbers(new int[] {0, 0, 0, 0, 0, 0, 0}).toArray());
    }

    @Test
    public void testMultipleGreatestNumbers() {
        GreatestNumber gNumber = new GreatestNumber();
        List<Integer> expected = Arrays.asList(1, 2);
        assertArrayEquals(expected.toArray(), gNumber.getMostRepeatingNumbers(new int[] {1, 1, 1, 1, 2, 2, 2, 2, 3, 3}).toArray());
    }

    @Test
    public void testNoneRepeatingValues() {
        GreatestNumber gNumber = new GreatestNumber();
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertArrayEquals(expected.toArray(), gNumber.getMostRepeatingNumbers(new int[] {1, 2, 3, 4}).toArray());
    }

    @Test
    public void testEmptyArray() {
        GreatestNumber gNumber = new GreatestNumber();
        List<Integer> expected = Arrays.asList();
        assertArrayEquals(expected.toArray(), gNumber.getMostRepeatingNumbers(new int[] {}).toArray());
    }
}