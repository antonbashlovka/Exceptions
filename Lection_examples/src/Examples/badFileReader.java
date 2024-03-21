package Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class badFileReader {
    
    public void readBadFile(){
        FileReader test = null;
        try {
            test = new FileReader("src/Examples/testfile.txt");
            BufferedReader fr = new BufferedReader(test);
            String line;
            StringBuilder result = new StringBuilder();

            while((line = fr.readLine()) != null) {
                result.append(line);
                result.append('\n');
            }

            System.out.println(result);

        }catch(RuntimeException | IOException e){
            System.out.println("Файл не прочитан по причине: " + e.getClass().getSimpleName() );
        }finally{
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла");
                }
            }
        }
    }
}
