import BalloonProblem.Solution;
import BalloonProblem.Solution2;
import BalloonProblem.Solution3;
import BalloonProblem.Solution4;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
       //System.out.println("Hello world!");
       //Solution2 s = new Solution2();
       //int num =0;
       //num = s.solution("BALLO");
       //System.out.println("Number of iterations is:" + num);

        int num=0;

            Solution4 s = new Solution4();
            s.setFileLocation("C:\\Users\\jovanovicm\\IdeaProjects\\ExceptionsPractice\\src\\BalloonProblem\\Input.txt");
            num = s.solution("jkh");


        System.out.println("Number of total possible iterations is: " + num);

    }
}
//BALLOOOOOasdksaldkaskldsaNNNNNBALLOON BALLOON BALLOON, BALLOON.,BALLOON,BALLOON,BALLOONBALLOONBALLBALLOONOON