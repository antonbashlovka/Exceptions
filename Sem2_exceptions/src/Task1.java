import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * переписать метод run в правильный код (в метод run2)
 */

public class Task1 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println(
            "Укажите индекс элемента массива, в который хотите записать значение 1"
        );

        try {
            int index = scanner.nextInt();
            arr[index] = 1;
        }catch (IndexOutOfBoundsException e){
            System.err.println("Указан индекс за пределами массива");

        }
    }

    public static void run2() {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int index = 0;

        System.out.println(
            "Укажите индекс элемента массива, в который хотите записать значение 1"
        );

        //можно обойтись if ом 
        if(scanner.hasNextInt()) {
            index = scanner.nextInt();
        }else{
            System.err.println("Указано не число");
            return;
        }

        try {
            index = scanner.nextInt();
            arr[index] = 1;
        }catch (IndexOutOfBoundsException e){
            System.err.println("Указан индекс за пределами массива");
        }catch (InputMismatchException e){
            //как вариант можно добавить больше исключений 
            System.err.println("Указано не число");
        }

    }




}
