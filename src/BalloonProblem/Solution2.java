package BalloonProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {

    int b_count = 0;
    int a_count = 0;
    int l_count = 0;
    int o_count = 0;
    int n_count = 0;
    int iterations=0;

    public int solution(String inputString) {
        List<Character> char_list = convertStringToCharList(inputString);
        for (char c : char_list) {

            switch (c) {

                case 'B': {
                        b_count = b_count + 1;
                    break;
                }

                 case 'A': {
                    a_count = a_count + 1;
                     break;
                }

                case 'L': {
                l_count = l_count + 1;
                    break;
                }

                case'O':{
                 o_count = o_count + 1;
                    break;
                }
                 case'N': {
                     n_count = n_count + 1;
                     break;
                 }

                 default:
                 continue;


}
        }
        //Just some prints to check whats happening (and debugging)
        System.out.println("B :"+ b_count);
        System.out.println("A :"+a_count);
        System.out.println("L :"+l_count);
        System.out.println("O :"+o_count);
        System.out.println("N :"+n_count);

        //Alternative non-iterative way
        int iterations_division= iterations_calc_divison();
        System.out.println("Second way:"+ iterations_division);

        //Iterative way
        iterations = iterations_calc();


        return iterations;
    }

        private List<Character> convertStringToCharList(String str) {

        // Create an empty List of character
        List<Character> chars = new ArrayList<>();

        // For each character in the String
        // add it to the List
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }

        // return the List
        return chars;
    }


    //iterable solution
    private int iterations_calc(){
        iterations=0;
        while(true){
       if (b_count/1>0 && a_count>0 && l_count>1 &&o_count>1 &&n_count>0){
           iterations++;
           b_count--;
           a_count--;
           l_count=l_count-2;
           o_count=o_count-2;
           n_count--;
       }
        else{
            break;
       }
        }
         return iterations;
    }
//dividing the counters of character that occur multiple times, adding them to the list and taking the minimum element as the
// maximum number of occurances of all balloon characters
    private int iterations_calc_divison(){
      int o_div = o_count/2;
      int l_div= l_count/2;

      List<Integer> occurances_list = new ArrayList<>();
      occurances_list.addAll(Arrays.asList(o_div,l_div,b_count,a_count,n_count));

      Collections.sort(occurances_list);
      System.out.println(occurances_list);
      int iterations=occurances_list.get(0);
        return iterations;
    }
}
