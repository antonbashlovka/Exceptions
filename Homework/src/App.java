import java.util.Scanner;

import Classes.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;

public class App {
    public static void main(String[] args) throws Exception {

        /*Напишите приложение, которое будет запрашивать у пользователя следующие данные в указанном порядке, разделенные пробелом:
        Фамилия Имя Отчество датарождения номертелефона пол

        Форматы данных:
        фамилия, имя, отчество - строки
        датарождения - строка формата dd.mm.yyyy
        номертелефона - целое беззнаковое число без форматирования
        пол - символ латиницей f или m.

        Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

        Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

        Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

        <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
        Yadrennaya Zarina Nasrulovna 15.12.2000 89552212128 f

        Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

        Не забудьте закрыть соединение с файлом.

        При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате: Фамилия Имя Отчество датарождения-dd.mm.yyyy номертелефона пол:f или m");

        String[] split = new String[6];

        for (int i = 0; scanner.hasNext(); i++  ){
            try {
                split[i] = scanner.next();
            }catch(RuntimeException e){
                System.out.println("Превышено количество данных: " + e.getClass().getSimpleName() );
                e.printStackTrace();
            }
        }
        

     



        String fn = split[0] + ".txt";

        FileWriter fw = null;

        File f = new File(fn);     

        Person Person = new Person(split[0], split[1], split[2], split[3], split[4], split[5]);
        
        try {
  
            if(f.exists() && !f.isDirectory()) {
                fw = new FileWriter(fn, true);
                fw.write("\n" + Person.toString());
            }else{
                fw = new FileWriter(fn);
                fw.write(Person.toString());
            }

            fw.flush();

        }catch(IOException e){
            System.out.println("Файл не прочитан по причине: " + e.getClass().getSimpleName() );
            e.printStackTrace();
        }

    }
}
