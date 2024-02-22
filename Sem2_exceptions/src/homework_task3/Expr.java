package homework_task3;

public class Expr {
    public static double expr(int a, int b) {
        // Введите свое решение ниже

        //Double d = Double.parseDouble(null)
        printSum(a,b);
        
        if ( b != 0 ){
            double result = (double)a/(double)b;

            return result;
        }else{
            return 0;
        }

    }
       
    public static void printSum(int a, int b) {
    // Введите свое решение ниже

        System.out.println(a+b);
       
    }
}
