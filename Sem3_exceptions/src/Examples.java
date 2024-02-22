public class Examples {

    
    //проброс исключений по стеку 
    //рекомендация - лучше обработать исключения там же где и бросать.
    public static void a(){
        String info = "важное инфо";
        try {
            b();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " " + info);
        }
    
    }

    public static void b() throws Exception{
       c();
    }
    
    public static void c() throws Exception{

        throw new Exception("Ошибка в программе, чтобы исправить, воспользуйтесь... ");

     }
}
