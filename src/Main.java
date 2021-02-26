import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //Простой калькулятор работающий не только с простыми числами, но и с римскими
        //Варианты операций: + - * /
        //Можно вводить числа от 1 до 100
        //Можно вводить римские числа от I до C
        //Памятка:*
        //Десятичные: I II III IV V VI VII VIII IX X
        //Сотые:  X XX XXX XXXX L LX LXX LXXX LXXXX C
        //Тысячные: C CC CCC CD D DC DCC DCCC CM M
        //Десятитысячные: M MM MMM MV V VM VMM VMMM MX X

        SumOfNum sumNumber = new SumOfNum();
        sumNumber.sum();
    }
}
