package BalloonProblem;
import java.util.*;
import java.io.*;

public class Solution4 {

    public int solution()  {
        int iterations=0;
        int div;



        HashMap<Character, Integer> inputWordChars= new     HashMap<Character, Integer>();
        HashMap<Character, Integer> charCount= new     HashMap<Character, Integer>();
        List<Integer> divList= new ArrayList<Integer>();
        List<Character> divListChar= new ArrayList<Character>();
        // String inputText="BALLOOOOOasdksaldkaskldsaNNNNNBALLOON BALLOON BALLOON, BALLOON.,BALLOON,BALLOON,BALLOONBALLOONBALLBALLOONOON";
        //  String inputWord="as";

        //  inputWordChars=traverseString(inputWord,inputWordChars);

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\jovanovicm\\IdeaProjects\\ExceptionsPractice\\src\\BalloonProblem\\Input.txt"));
           // reader=null;
            if(reader==null){
                throw  new RuntimeException("Problem creating buffered reader");
            }

            final String firstLine = reader.readLine();
            if(firstLine == null){
                throw  new RuntimeException("First line of document is null");
            }
            if(firstLine.isEmpty()){
                throw  new RuntimeException("First line of document is empty");
            }
            if(firstLine.isBlank()){
                throw  new RuntimeException("First line of document is Blank");
            }
            inputWordChars=traverseString(firstLine,inputWordChars);

            int row=1;
            String line = reader.readLine();
            while (line!=null) {

                System.out.println(line);
                if(line == null){
                    throw  new RuntimeException("Line "+row+" of the document is null");
                }
                if(line.isEmpty()){
                    throw  new RuntimeException("Line "+row+" of the document is empty");
                }
                if(line.isBlank()){
                    throw  new RuntimeException("Line "+row+" of the document is Blank");
                }
                charCount=traverseString(line,charCount);

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
                        System.out.println("Missing character "+ k + " in the text");

                        iterations= 0;
                    }

                }

                System.out.println("List of divisions" + divList);
                System.out.println("List of respective characters" +divListChar );
                if(divList.isEmpty()){
                    throw  new RuntimeException("List of divisions is empty");
                }
                Collections.sort(divList);

                System.out.println("------------------------------------------------");
                System.out.println("List of divisions after sorting " + divList);
                iterations=divList.get(0);
                System.out.println("Number of iterations for line " + row + " is "+ iterations);
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::");
                row++;
                divList.clear();
                divListChar.clear();
                line = reader.readLine();
                charCount.clear();

            }
            reader.close();
        } catch (IOException e) {

            System.out.println("Exception");
            e.printStackTrace();
        }
        catch (RuntimeException e){
            System.out.println("Runtime exception");
            System.out.println(e.getMessage());
          //  e.printStackTrace();
        }


        return iterations;
    }

    static HashMap<Character, Integer> traverseString(String str,HashMap<Character, Integer> hashmap)
    {

        try {
            char[] strArray = str.toCharArray();
            char c;
            // Traverse the string
            for (int i = 0; i < strArray.length; i++) {

                c= str.charAt(i);
                if (hashmap.containsKey(c)) {   hashmap.put(c,hashmap.get(c)+1);    }
                else {  hashmap.put(c,1); }
            }
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }


        return hashmap;
    }
}
