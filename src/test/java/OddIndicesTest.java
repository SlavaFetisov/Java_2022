import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {
    //    Написать алгоритм OddIndices, который принимает массив целых чисел,
//    и возвращает массив значений нечетных индексов
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}
    //Positive testing Happy path
    // if(start <= end)
    //return array

    //start < end
    @Test
    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //arrange
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        //act

        int[] actualResult = new OddIndices().oddIndices(array);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
    }
}
