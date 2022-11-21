import BalloonProblem.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
       //System.out.println("Hello world!");
       //Solution2 s = new Solution2();
       //int num =0;
       //num = s.solution("BALLO");
       //System.out.println("Number of iterations is:" + num);
        String fileLocation ="C:\\Users\\jovanovicm\\IdeaProjects\\ExceptionsPractice\\src\\BalloonProblem\\Input.txt";
        int num=0;

            Solution4 s = new Solution4();
           // s.setFileLocation("C:\\Users\\jovanovicm\\IdeaProjects\\ExceptionsPractice\\src\\BalloonProblem\\Input.txt");
           fileReadWrite file= new fileReadWrite();
        BufferedReader reader;
        try {
             reader= file.creatingReader(fileLocation);
             num = s.solution("jkh",reader);
        } catch (FileNotFoundException e) {
            System.out.println("file not foud");
        } catch (CreatingBufferedReaderException e) {
            System.out.println("problem creating buffered reader");
        }


        System.out.println("Number of total possible iterations is: " + num);

    }
}
//BALLOOOOOasdksaldkaskldsaNNNNNBALLOON BALLOON BALLOON, BALLOON.,BALLOON,BALLOON,BALLOONBALLOONBALLBALLOONOON