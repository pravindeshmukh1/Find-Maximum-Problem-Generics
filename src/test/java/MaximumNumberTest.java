import com.bridgelabz.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;


public class MaximumNumberTest {

    // Integer Number
    @Test
    public void givenFirstNumber_ifMaximumNumber_shouldReturnSameNo() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNum = maximumNumber.findMaxValue(400, 100, 200);
        Assert.assertEquals(400, maxNum);
    }
}
