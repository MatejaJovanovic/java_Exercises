package BalloonProblem;

import java.util.*;

public class Solution {

    int b_count = 0;
    int a_count = 0;
    int l_count = 0;
    int o_count = 0;
    int n_count = 0;
    int collected_letters = 0;


    //DISCLAIMER: This is the MVP/skateboard solution, it is not optimal it is ugly, but it was a necessary step towards better solutions

    public int solution(String s) {
        List<Character> char_list = convertStringToCharList(s);
        List<Integer> index_remove = new ArrayList<>();

        int rounds_counter = 0;
        int i = 0;
        int old_state = -1;
        while (old_state != rounds_counter) {


            for (char c : char_list) {
                old_state = rounds_counter;
                switch (c) {

                    case 'B': {
                        if (b_count >= 1) {
                            break;
                        } else {
                            b_count = b_count + 1;
                            index_remove.add(i);
                            collected_letters = collected_letters + 1;
                            if (collected_letters == 7) {
                                rounds_counter = rounds_counter + 1;


                            }
                            break;
                        }
                    }
                    case 'A': {
                        if (a_count >= 1) {
                            break;
                        } else {
                            a_count = a_count + 1;
                            index_remove.add(i);
                            collected_letters = collected_letters + 1;
                            if (collected_letters == 7) {
                                rounds_counter = rounds_counter + 1;

                            }
                            break;
                        }
                    }
                    case 'L': {
                        if (l_count >= 2) {
                            break;
                        } else {
                            l_count = l_count + 1;
                            index_remove.add(i);
                            collected_letters = collected_letters + 1;
                            if (collected_letters == 7) {
                                rounds_counter = rounds_counter + 1;

                            }
                            break;
                        }
                    }
                    case 'O': {
                        if (o_count >= 2) {
                            break;
                        } else {
                            o_count = o_count + 1;
                            index_remove.add(i);
                            collected_letters = collected_letters + 1;
                            if (collected_letters == 7) {
                                rounds_counter = rounds_counter + 1;

                            }
                            break;
                        }
                    }
                    case 'N': {
                        if (n_count >= 1) {
                            break;
                        } else {
                            n_count = n_count + 1;
                            index_remove.add(i);
                            collected_letters = collected_letters + 1;
                            if (collected_letters == 7) {
                                rounds_counter = rounds_counter + 1;

                            }
                            break;


                        }
                    }
                    default:
                        continue;

                }

                if (collected_letters == 7) {
                    break;
                }


            }
            i = i + 1;
            if (collected_letters == 7) {
                char_list = removeIndicies(index_remove, char_list);
                reset(index_remove);
            }
        }


        return rounds_counter;
    }

    private void reset(List<Integer> index_remove) {
        index_remove.clear();
        b_count = 0;
        a_count = 0;
        l_count = 0;
        o_count = 0;
        n_count = 0;
        collected_letters = 0;
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

    private List<Character> removeIndicies(List<Integer> indices, List<Character> char_list) {

        for (int i : indices) {
            char_list.remove(i);

        }
        return char_list;
    }
}
