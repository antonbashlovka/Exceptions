package homework_task1;

/**
 * Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
 *  Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
 * Если преобразование не удалось, программа выдаёт сообщение об ошибке
 * Your input is not a float number. Please, try again.
 * и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.*/

public class IsFloat {
    public static float isFloat(String input) {
        // Введите свое решение ниже        

        try {
            float result = Float.parseFloat(input);
            return result;

        } catch (NumberFormatException e) {

            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
            
        }
        

        
        
    }
    
}
