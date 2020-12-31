package Service;

import Controleur.Calculator;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {
    private MathOperation objMathOperation;

    @BeforeEach
    public void setUp(){
        objMathOperation = new MathOperation();
        System.out.println("initialiser l'instance de calculatrice");

    }

    @Test
    void ShoulSumTwoNumbers() {
        //given
        long result = objMathOperation.sum(4,5);
        // then
        Assertions.assertEquals(6, result);

    }

  @Test
    public void ShouldSoubstractTwoNumbers() {
        // given
        long result = objMathOperation.soubstraction(3,5);
        //then;
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void ShouldMiltiplyTwoNumbers() {
        // given
        long result = objMathOperation.multiplication(3,2);
        // Then
        Assertions.assertEquals(6 , result);
    }

    @Test
    public void ShouldDivideTwoNumbers() {
         // Given
        long result = objMathOperation.divide(10,5);
        //Then
        Assertions.assertEquals(2, result);

    }

}