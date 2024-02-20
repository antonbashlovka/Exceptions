package task1;
class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже

        int[] array = new int[10];
        System.out.println(array[11]);
      
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже

        int a = 1;
        int b = 0;

        System.out.println(a/b);
     
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String a = "Hello";

        Double b = Double.parseDouble(a);
       
    }
}