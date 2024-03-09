package Examples;

public class divideByZero{
    
    
    /**
     * Получает частное двух чисел. 
     * Показываю разные способы обработки ошибки деления на 0
     */
    public int divide(int a1, int a2){

        //Вариант 1 - не правильно, т.к. такой же код ошибки можно получить если -10/10
        //if (a2 == 0){return -1;}
        
        //Вариант 2 - бросить исключение
        if (a2 == 0){throw new RuntimeException("Divide by zero");}


        return a1/a2;
    }


}