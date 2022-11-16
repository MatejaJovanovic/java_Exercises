package BalloonProblem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.io.*;

public class Solution3 {

public int solution()  {
    int iterations;
    int div;

    HashMap<Character, Integer> inputWordChars= new     HashMap<Character, Integer>();
    HashMap<Character, Integer> charCount= new     HashMap<Character, Integer>();
    List<Integer> divList= new ArrayList<Integer>();
    List<Character> divListChar= new ArrayList<Character>();
    String inputText="BALLOOOOOasdksaldkaskldsaNNNNNBALLOON BALLOON BALLOON, BALLOON.,BALLOON,BALLOON,BALLOONBALLOONBALLBALLOONOON";
    String inputWord="BBBAAAAAALOOOOOOON";

    inputWordChars=traverseString(inputWord,inputWordChars);
    charCount=traverseString(inputText,charCount);


    System.out.println("Character count of the input word "+inputWordChars);
    System.out.println("Character count of the input text "+charCount);


    for (char k:inputWordChars.keySet()) {

        if(charCount.get(k)!=null){
            System.out.println("Present character " + k);
            div=charCount.get(k)/inputWordChars.get(k);
            if(div<1){ System.out.println("Not enough character " + k);

                divList.add(div);
                divListChar.add(k);
                break;}
            else{
            divList.add(div);
            divListChar.add(k);
            }

        }
        else {
            System.out.println("Missing character "+k+ " in the text");

            return 0;
        }

    }
    System.out.println("List of divisions" + divList);
    System.out.println("List of respective characters" +divListChar );

    Collections.sort(divList);

    System.out.println("------------------------------------------------");
    System.out.println("List of divisions after sorting " + divList);
    iterations=divList.get(0);

    return iterations;
}

    static HashMap<Character, Integer> traverseString(String str,HashMap<Character, Integer> hashmap)
    {

        char[] strArray = str.toCharArray();
        char c;
        // Traverse the string
        for (int i = 0; i < strArray.length; i++) {

            c= str.charAt(i);
            if (hashmap.containsKey(c)) {   hashmap.put(c,hashmap.get(c)+1);    }
            else {  hashmap.put(c,1); }
        }
        return hashmap;
    }
}
