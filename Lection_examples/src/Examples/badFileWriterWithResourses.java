package Examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class badFileWriterWithResourses {
    public void badFileWriter(){
        try (// это и есть ресурсы в блоке try-with-resourses, они закрываются автоматически
            FileReader reader = new FileReader("src/Examples/testfile.txt");  
            FileWriter writer = new FileWriter("src/Examples/testwrite.txt");
        ){
            while(reader.ready()){
                writer.write(reader.read());
            }
            
        } catch (IOException e) {
            System.out.println("Файл не прочитан по причине: " + e.getClass().getSimpleName() );
        }
    }
}
