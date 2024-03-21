package Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class badFileReaderOurException {
    
    public void readBadFile() throws ourException{
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

        }catch(IOException e){
            throw new ourException("файлик не прочитан по причине " + e.getMessage());
            
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
