import Examples.divideByZero;
import Examples.outOfBounds;
import Examples.badFileReader;
import Examples.badFileReaderWithResourses;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Деление на 0
        divideByZero div = new divideByZero();
        //div.divide(20, 10);


        // 2. Выход за пределы массива
        outOfBounds out = new outOfBounds();
        //System.out.println(out.takeArrElem(10));

        //3. Работа с файлом
        badFileReader file = new badFileReader();
        file.readBadFile();

        //4. Try with resourses
        //badFileReaderWithResourses myfile = new badFileReaderWithResourses();
        //myfile.readBadFile();


    }
}
