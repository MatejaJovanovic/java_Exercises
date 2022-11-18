package BalloonProblem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {

    static Solution4 solution4;

    @BeforeAll
    static void beforeAll() {

        //init testing conditionals
        solution4 = new Solution4();
        //init mocks if any
    }

    @DisplayName("When empty string is passed to the method it returns false")
    @Test
    public void whenEmptyInputThenReturnFalse() {

        boolean result = solution4.isValidString("");
        assertFalse(result);
    }

    @DisplayName("When String is passed to the method it returns a frequency hashmap")
    @Test
    public void whenStringInputReturnHashmap(){
        String input = "asasasasas";
        HashMap<Character, Integer> result = solution4.traverseString(input);
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a',5);
        expected.put('s',5);
        assertEquals(expected,result);
    }

    @DisplayName("When null is passed to the method it returns an empty hashmap")
    @Test
    public void whenNullInputReturnEmpty(){
        String input = "";
        HashMap<Character, Integer> result = solution4.traverseString(input);
        assertTrue(result.isEmpty());
    }
    @DisplayName("When empty string is passed to the method it returns an empty hashmap")
    @Test
    public void whenEmptyInputReturnEmpty(){
        String input = "";
        HashMap<Character, Integer> result = solution4.traverseString(input);
        assertTrue(result.isEmpty());
    }
    @DisplayName("When string is passed to the method it returns true")
    @Test
    public void whenStringInputReturnTrue(){
      boolean result= solution4.isValidString("fdsfsdjfhdsfjk");
      assertTrue(result);
    }
    @DisplayName("When null is passed to the method it returns false")
    @Test
    public void whenNullInputReturnFalse(){
        boolean result= solution4.isValidString(null);
        assertFalse(result);
    }

    @DisplayName("When empty string is passed to the method it returns false")
    @Test
    public void whenEmptyInputReturnFalse(){
        boolean result= solution4.isValidString("");
        assertFalse(result);
    }

    @DisplayName("When blank string is passed to the method it returns false")
    @Test
    public void whenBlankInputReturnFalse(){
        boolean result= solution4.isValidString("  ");
        assertFalse(result);
    }
   @DisplayName("When frequency hashmaps are passed method returns the maximum number of iterations")
   @Test
   public void whenFrequencyHashmapReturnNumberOfIterations() throws EmptyListException {
      HashMap<Character, Integer> inputWordChars = new HashMap<>();
      HashMap<Character, Integer> charCount = new HashMap<>();
      List<Integer>  divList=new ArrayList<Integer>();
      List<Character> divChar=new ArrayList<Character>();
      inputWordChars.put('a',1);
      inputWordChars.put('s',1);
      charCount.put('a',5);
      charCount.put('s',5);

      int result_iterations = solution4.rowComparison(inputWordChars,charCount,divList,divChar);
      assertEquals(5,result_iterations);
   }
//This needs a remake
//  @Test
//   public void whenValidInputFileReturnTotalNumberOfIterations {
//       String fileLocation = "C:\\Users\\jovanovicm\\IdeaProjects\\ExceptionsPractice\\src\\BalloonProblem\\Input.txt";

//       fileReadWrite file = Mockito.mock(fileReadWrite.class);
//       try {
//           Mockito.when(file.creatingReader(fileLocation)).thenReturn( new BufferedReader(new FileReader(fileLocation)) );
//       } catch (FileNotFoundException e) {
//           throw new RuntimeException(e);
//       } catch (CreatingBufferedReaderException e) {
//           throw new RuntimeException(e);
//       }


//
//   }
}