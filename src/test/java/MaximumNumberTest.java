import com.bridgelabz.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MaximumNumberTest {

    // Integer Number
    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSameNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNum = maximumNumber.findMaxIntegerValue(400, 100, 200);
        Assert.assertEquals(400, maxNum);
    }

    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSecondNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNum = maximumNumber.findMaxIntegerValue(100, 400, 200);
        Assert.assertEquals(400, maxNum);
    }

    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnThirdNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNum = maximumNumber.findMaxIntegerValue(100, 200, 400);
        Assert.assertEquals(400, maxNum);
    }
    // Float Number
    @Test
    public void givenThreeFloatNumber_findMaximumNumber_shouldReturnSameNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Float maxFloatValue= maximumNumber.findMaxFloatValue(40.40f, 10.10f, 20.20f);
        System.out.println(maxFloatValue);
        Assert.assertEquals((Float)40.40f, maxFloatValue);
    }

}
