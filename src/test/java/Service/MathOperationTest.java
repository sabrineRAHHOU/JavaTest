package Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {
    int result = 0;

    @Test
    void ShoulAddTwoNumbers() {
        //given
        MathOperation mathOperation = new MathOperation();
        // when
         result = mathOperation.somme(2,3);
        // then
        Assertions.assertEquals(5,0);

    }

    @Test
    public void ShouldSoustractTwoNumbers() {
        // given
        MathOperation mathOperation = new MathOperation();
        //when
        result = mathOperation.soustraction(2,3);
        //then
        Assertions.assertEquals(1,0);
    }

    @Test
    public void ShouldMiltiplyTwoNumbers() {
        // given
        MathOperation mathOperation = new MathOperation();
        //when
        result = mathOperation.soustraction(2,3);
        //then
        Assertions.assertEquals(6,0);
    }

    @Test
    public void ShouldDivideTwoNumbers() {
        // given
        MathOperation mathOperation = new MathOperation();
        //when
        result = mathOperation.soustraction(6,3);
        //then
        Assertions.assertEquals(2,0);
    }

}