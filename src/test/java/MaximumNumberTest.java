import com.bridgelabz.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;


public class MaximumNumberTest {

    // Integer Number
    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSameNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNum = maximumNumber.findMaxValue(400, 100, 200);
        Assert.assertEquals(400, maxNum);
    }

    @Test
    public void givenThreeIntegerNumber_findMaximumNumber_shouldReturnSecondNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNum = maximumNumber.findMaxValue(100, 400, 200);
        Assert.assertEquals(400, maxNum);
    }
    
}
