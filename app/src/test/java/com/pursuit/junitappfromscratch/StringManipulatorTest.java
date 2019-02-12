package com.pursuit.junitappfromscratch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringManipulatorTest {
    private StringManipulator stringManipulator;
    @Before
    public void setUp() throws Exception{
        stringManipulator = StringManipulator.getInstance();

    }
    @Test
    public void checkIslessThan10(){
        String testString = "pursuit";

        boolean result = stringManipulator.isLessThan10(testString);
        Assert.assertTrue(testString, result);

    }
    @Test
    public void checkIsNotLessThan10(){
        String testString = "StringManipulator";

        boolean result = stringManipulator.isLessThan10(testString);
        Assert.assertFalse(testString, result);
    }

  /*  @Test
    public void checkZipperWords(String word1, String word2){
        String word1= "apple";
        String word2 = "orange";
        String result = stringManipulator.zipperWords(word1, word1);
        Assert.assertEquals();


    }
*/
  @Test
  public void checkisOddLength(){
      String testString = "happy";
      boolean result = stringManipulator.isOddLength(testString);

      Assert.assertTrue(testString, result);
  }
  @Test
  public void checkisEvenLength(){
      String testString = "ball";
      boolean result = stringManipulator.isOddLength(testString);

      Assert.assertFalse(testString, result);
  }
  @Test
  public void checkDeconstructedWord(){
      String testString = "BABY";
      String result = stringManipulator.deconstructedWord(testString);

      Assert.assertEquals("BBY A", result);
  }
  @Test
  public void checkWordSum(){
      int expected = 7;
      int result = stringManipulator.wordSum("hello", "hi");

      Assert.assertEquals(expected, result);
  }

    @After
    public void tearDown() throws Exception{
        stringManipulator = StringManipulator.getInstance();
    }

}
