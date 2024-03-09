import Examples.divideByZero;
import Examples.outOfBounds;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Деление на 0
        divideByZero div = new divideByZero();
        System.out.println(div.divide(20, 10));


        // 2. Выход за пределы массива
        outOfBounds out = new outOfBounds();
        System.out.println(out.takeArrElem(10));


    }
}
