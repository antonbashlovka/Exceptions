/*
 * Напишите программу, которая вычисляет значение выражения intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
 * Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
 * Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.
 */


package homework_task2;

import java.util.Arrays;

public class Expr {
    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        if (d != 0){

            if (Arrays.binarySearch(intArray, 8) > -1){
                double result = intArray[8]/d;
                System.out.println("intArray[8] / d = " + intArray[8] + " / 1 = " + result);
                return result;

            }else{
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
                return Float.NaN;
            }

        }else{

            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Float.NaN;
        
        }




        /*

            

        }else{
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
        }*/

    }
}
