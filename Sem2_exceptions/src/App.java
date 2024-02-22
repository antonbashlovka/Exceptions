

public class App {
    public static void main(String[] args) throws Exception {
       
        //---------Task1--------------
        //Task1.run();
        //Task1.run2();


        //---------Task2----------------

        String[][] arr1 = new String[][]{
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"}
        };

        String[][] arr2 = new String[][]{
            {"1", "1"},
            {"1", "1", "1", "j", "1"},
            {"1", "1"},
            {"1", "1"},
            {"1", "1"}
        };

        System.out.println(Task2.sum2d2(arr2));

    }
}
