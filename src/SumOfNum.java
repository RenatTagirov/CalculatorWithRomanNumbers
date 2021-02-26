import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNum {
    public void sum() throws IOException {

        InitializNumber i1 = new InitializNumber();
        InitializNumber i2 = new InitializNumber();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число, математическую операцию и второе число: ");
        String number1 = reader.readLine();
        String operation = reader.readLine();
        String number2 = reader.readLine();

        if(number1.length() == 1 || number1.charAt(0) == 'X'){
            i1.initializationDes(number1);
        }
        if (number1.length() > 1){
            i1.initializationHundred(number1);
        }
        if(number2.length() == 1 || number2.charAt(0) == 'X'){
            i2.initializationDes(number2);
        }
        if (number2.length() > 1){
            i2.initializationHundred(number2);
        }

        if ((i1.numOperation != 0 && i1.numOperation > 0 && i1.numOperation <=100) &&
                (i2.numOperation != 0 && i2.numOperation > 0 && i2.numOperation <=100) &&
                (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))){
            if ((i1.countOperation == 1 || i1.countOperation == 3) && (i2.countOperation == 1 || i2.countOperation == 3)){
                if (operation.equals("+")){
                    System.out.println(Add.toAdd(i1.numOperation, i2.numOperation));
                }else  if (operation.equals("-")){
                    System.out.println(Subtract.toSubtract(i1.numOperation, i2.numOperation));
                }else if (operation.equals("*")){
                    System.out.println(Multiply.toMultiply(i1.numOperation, i2.numOperation));
                }else System.out.println(Divide.toDivide(i1.numOperation, i2.numOperation));
            }
            else if ((i1.countOperation == 2 || i1.countOperation ==4 ) && (i2.countOperation == 2 || i2.countOperation == 4)){
                if (operation.equals("+")){
                    RomeResult.Result(Add.toAdd(i1.numOperation, i2.numOperation));
                }else  if (operation.equals("-")){
                    RomeResult.Result(Subtract.toSubtract(i1.numOperation, i2.numOperation));
                }else if (operation.equals("*")){
                    RomeResult.Result(Multiply.toMultiply(i1.numOperation, i2.numOperation));
                }else RomeResult.Result(Divide.toDivide(i1.numOperation, i2.numOperation));
            }else System.out.println("Нельзя провести операцию между Римским и Обычным числом!");
        }else System.out.println("Вы ввели неправилтное значение!" +
                " Вводимое значение должно быть от 0 до 100 или от I до C, " +
                "а так же операция должна быть одна из: + - * /");


    }
}
