public class Main {
    public static void main(String[] args){
        try{
            int result = Factorial.getFactorial(6);
            System.out.println(result); // факториал числа 6 равен 720
        }
        catch(FactorialException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}