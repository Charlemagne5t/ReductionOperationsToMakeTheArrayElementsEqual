import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void reductionOperationsTest1() {
        int[] nums = {5, 1, 3};
        int expected = 3;
        int actual = new Solution().reductionOperations(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reductionOperationsTest2() {
        int[] nums = {1, 1, 1};
        int expected = 0;
        int actual = new Solution().reductionOperations(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reductionOperationsTest3() {
        int[] nums = {1, 1, 2, 2, 3};
        int expected = 4;
        int actual = new Solution().reductionOperations(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void reductionOperationsTest4() {
        int[] nums = {7,9,10,8,6,4,1,5,2,3};
        int expected = 45;
        int actual = new Solution().reductionOperations(nums);

        Assert.assertEquals(expected, actual);
    }
}
