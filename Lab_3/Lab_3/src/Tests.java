import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

public class Tests {
    @Test
    public void Test() {
        double[] mass = {2, 1, 4, 6, 0, -1, 44, 2, 2};
        double[] expected = {-1, 0, 1, 2, 2, 2, 4, 6, 44};

        MergeSort m = new MergeSort(mass);
        m.MergeSorting();
        Arrays.equals(expected, m.ReturnArr());
    }

}
