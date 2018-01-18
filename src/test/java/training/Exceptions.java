package training;

public class Exceptions {
    public static void main(String args[]){
        int num1, num2;

        try{ num1=0;
             num2=62/num1;
            System.out.println(num2);
            System.out.println("this is try block");
        }
        catch(ArithmeticException e){
            System.out.println("This is catch block");
        }
    }
}
