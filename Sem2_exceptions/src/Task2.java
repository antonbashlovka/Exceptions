public class Task2 {
    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static int sum2d2(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                int val = (isInteger(arr[i][j])) ? Integer.parseInt(arr[i][j]) : 0; 
                sum += val;
            }
        }
        return sum;
    }

    public static boolean isInteger(String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            System.err.println("Указано не число");
            return false;
        }
    }
}
