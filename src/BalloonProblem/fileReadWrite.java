package BalloonProblem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class fileReadWrite {

public BufferedReader  creatingReader(String locationPath) throws FileNotFoundException, CreatingBufferedReaderException {


    BufferedReader reader = new BufferedReader(new FileReader(locationPath));

    if (reader == null) {
        throw new CreatingBufferedReaderException("Problem creating buffered reader");
    }

return reader;
}
}
