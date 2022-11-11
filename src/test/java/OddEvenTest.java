import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddEvenTest {
    //    В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
//    если число нечетное, и “Even”, если число четное.
//    Test Data:
//            -345 →  “Odd”
//            0 →  “Even”
//            222222 →  “Even”

    //Positive testing Happy path
    // if(start <= end)
    //return array


    @Test
    public void test1_HappyPath() {
        //AAA
        //arrange

        String expectedResult = "Odd";

        //act

        String actualResult = new OddEven().oddEven(-345);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test2_HappyPath() {
        //AAA
        //arrange

        String expectedResult = "Even";

        //act

        String actualResult = new OddEven().oddEven(0);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test3_HappyPath() {
        //AAA
        //arrange

        String expectedResult = "Even";

        //act

        String actualResult = new OddEven().oddEven(222222);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
    }

}

