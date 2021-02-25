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
        int sumResult = 0;

        String resultOperation1 = "", resultOperation2 = "";
        int numOperation1 = 0, numOperation2 = 0;
        int countOperation1 = 0, countOperation2 = 0;

        if (number1.length() == 1 || number1.charAt(0) != 'X'){
            i1.initializationDes(number1);
            numOperation1 = i1.numArr;
            countOperation1 = i1.coun;
        }
        if (number1.length() > 1 ){
            i1.initializationHundred(number1);
            numOperation1 = i1.numArr;
            countOperation1 = i1.coun;
        }

        if (number2.length() == 1 || number2.charAt(0) != 'X'){
            i2.initializationDes(number2);
            numOperation2 = i2.numArr;
            countOperation2 = i2.coun;
        }
        if (number2.length() > 1 || number2.charAt(0) == 'X'){
            i2.initializationHundred(number2);
            numOperation2 = i2.numArr;
            countOperation2 = i2.coun;
        }



        if((numOperation1 != 0 && numOperation1 > 0 && numOperation1 <= 100) &&
                (numOperation2 !=0 && numOperation2 > 0 && numOperation2 <= 100)&&
                (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))){
            if(((countOperation1 == 1 || countOperation1 == 3) && (countOperation2 == 1 || countOperation2 == 3)) ||
                    ((countOperation1 == 2 || countOperation1 == 4) && (countOperation2 == 2 || countOperation2 == 4))){
                if(operation.equals("+")){
                    sumResult = Add.toAdd(numOperation1, numOperation2);
                }else if(operation.equals("-")){
                    sumResult = Subtract.toSubtract(numOperation1, numOperation2);
                }else if(operation.equals("*")){
                    sumResult = Multiply.toMultiply(numOperation1, numOperation2);
                }else if(operation.equals("/")){
                    sumResult = Divide.toDivide(numOperation1, numOperation2);
                }
            }
            else {
                System.out.println("Вы не можете складывать обычные цифры с римскими");
            }
        }else {
            System.out.println("Число может быть от 1 до 100 или от I до C, а так же вы должны ввести одну из 4 операций: +-*/");
        }

        System.out.println(sumResult);
    }
}
