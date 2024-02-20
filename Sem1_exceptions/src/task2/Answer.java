package task2;

public class Answer {

    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже

        int length_a = a.length;
        int length_b = b.length;

        if (length_a == length_b){
            
            int[] c = new int[length_a];

            for (int i = 0; i < c.length; i++){
                c[i] = a[i] - b[i];
            }

            return c;
        }else{
            int[] c = new int[1];

            return c;
        }

    }
    
}
