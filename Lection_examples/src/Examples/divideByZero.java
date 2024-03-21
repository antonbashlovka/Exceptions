package Examples;

public class divideByZero{
    
    
    /**
     * Получает частное двух чисел. 
     * Показываю разные способы обработки ошибки деления на 0
     */
    public void divide(int a1, int a2){

        //Вариант 1 - показать код ошибки конкретно не здесь правильно, т.к. такой же код ошибки можно получить если -10/10
        //if (a2 == 0){System.out.println(-1);}
        
        //Вариант 2 - бросить исключение
        if (a2 == 0){
            //throw new ArithmeticException("Divide by zero");
        }else{
            //System.out.println(a1/a2);
        }

        //Вариант 3 - использовать блок try-catch
        
        try{
            System.out.println(a1/a2);
            String test = null;
            System.out.println(test.length());
           
        }catch(ArithmeticException e){
            System.out.println("catch: Divide by zero");
        }catch(NullPointerException e){
            System.out.println("catch: Null given");
        }catch(Exception e){
            System.out.println("catch: Exception"); 
            // Общий класс exception следует вызывать в самом конце блоков catch
            // иначе код не скомпилируется, т.к нет вариантов вызвать другие блоки catch
        }
    }


}