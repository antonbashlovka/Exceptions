package Examples;

import java.io.FileReader;
import java.io.IOException;

public class badFileReaderWithResourses {
        public void readBadFile(){

        try(FileReader test = new FileReader("src/Examples/testfile.txt")){
            test.read();
        }catch(RuntimeException | IOException e){
            System.out.println("Файл не прочитан по причине: " + e.getClass().getSimpleName() );
        }
    }
    
}
