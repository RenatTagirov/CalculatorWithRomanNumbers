
public class InitializNumber {

    public InitializNumber(){};

    //Массив проверки на десятичные обычные
    private final String[] numberTen = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    //Массив проверки на сотые обычные
    private final String[] numberHundred = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    //Массив проверки на сотые Римские
    private final String[] romeTen = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    //Массив проверки на сотые Римские
    private final String[] romeHundred = {"", "X", "XX", "XXX", "XXXX", "L", "LX", "LXX", "LXXX", "LXXXX", "C"};
    private final String[] romeThousand = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",};

    String resulr = " ";
    int numOperation;
    int countOperation;

    public void initializationDes(String a){

        //Проверка на десятичные
        if (resulr.equals(" ")){
            for (int i = 0; i < numberTen.length; i++) {
                if (a.equals(numberTen[i])) {
                    resulr = numberTen[i];
                    numOperation = i;
                }
            }
            if (!resulr.equals(" ")) {
                countOperation = 1;
            }
        }
        //Проверка на Римские десятичные
        if (resulr.equals(" ")){
            for (int i = 0; i < romeTen.length; i++){
                if (a.equals(romeTen[i])){
                    resulr = romeTen[i];
                    numOperation = i;
                }
            }
            if (!resulr.equals(" ")) {
                countOperation = 2;
            }
        }
    }

    public void initializationHundred(String a) {

        //Проверка на сотые
        if (resulr.equals(" ")){
            String str = "";
            for (int i = 1; i < numberTen.length; i++) {
                for (int j = 0; j < numberHundred.length; j++) {
                    if (a.equals(numberTen[i] + numberHundred[j])) {
                        resulr = numberTen[i] + numberHundred[j];
                        str = "" + i + j;
                        numOperation = Integer.parseInt(str);
                    }
                }
            }
            if (!resulr.equals(" ")){
                countOperation = 3;
            }
        }
        //Проверка на Римские сотые
        if (resulr.equals(" ")){
            String str = "";
            for (int i = 1; i < romeHundred.length; i++){
                for (int j = 0; j < romeThousand.length; j++) {
                    if (a.equals(romeHundred[i] + romeThousand[j])) {
                        resulr = romeHundred[i] + romeThousand[j];
                        str = "" + i + j;
                        numOperation = Integer.parseInt(str);
                    }
                }
            }
            if (!resulr.equals(" ")) {
                countOperation = 4;
            }
        }
    }
}
