import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task1 {
    public void rwLine(Path pathRead, Path pathWrite) throws IOException{
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = Files.newBufferedReader(pathRead);
            out = Files.newBufferedWriter(pathWrite);
            out.write(in.readLine());
        }finally{

        }
    }
}
