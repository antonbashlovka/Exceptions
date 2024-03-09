package Examples;

public class outOfBounds {

    /**
     * Получает элемент массива. 
     * Показываю разные способы обработки ошибки выхода за пределы массива
     */
    public int takeArrElem(int i){

        int[] ints = new int[10];

        //Вариант 1 - не правильно, т.к. такой же код ошибки можно получить если номер совпадает с значением элемента
        //if (i >= ints.length){return -1;}

        //Вариант 2 - бросить исключение
        if (i >= ints.length){throw new RuntimeException("Выход за пределы массива");}
              
        return ints[i];
    }
    
}
