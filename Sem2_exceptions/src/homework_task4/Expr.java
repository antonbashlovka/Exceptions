package homework_task4;

public class Expr {
    public static String expr(char a) throws Exception {
        // Введите свое решение ниже

        if (a == ' '){
            throw new Exception("Пустая строка введена.");
        }
       
        return "Your input was - " + a;
    }
    
}
