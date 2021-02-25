
public class InitializNumber {

    public InitializNumber(){};

    //Массив проверки на десятичные обычные
    private String[] numberTens = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    //Массив проверки на сотые обычные
    private String[] numberHundred = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    //Массив проверки на сотые Римские
    private String[] romeNum = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    //Массив проверки на сотые Римские
    private String[] romeHundred = {"", "X", "XX", "XXX", "XXXX", "L", "LX", "LXX", "LXXX", "LXXXX", "C"};
    private String[] romeDes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",};

    String resulr = " ";
    int numArr;
    int coun;

    public String initializationDes(String a){

        //Проверка на десятичные
        if (resulr.equals(" ")){
            for (int i = 0; i < numberTens.length; i++) {
                if (a.equals(numberTens[i])) {
                    resulr = numberTens[i];
                    numArr = i;
                }
            }
            if (!resulr.equals(" ")) {
                coun = 1;
            }
        }
        //Проверка на Римские десятичные
        if (resulr.equals(" ")){
            for (int i = 0; i < romeNum.length; i++){
                if (a.equals(romeNum[i])){
                    resulr = romeNum[i];
                    numArr = i;
                }
            }
            if (!resulr.equals(" ")) {
                coun = 2;
            }
        }
        return resulr;
    }

    public String initializationHundred(String a) {

        //Проверка на сотые
        if (resulr.equals(" ")){
            String str = "";
            for (int i = 1; i < numberTens.length; i++) {
                for (int j = 0; j < numberHundred.length; j++) {
                    if (a.equals(numberTens[i] + numberHundred[j])) {
                        resulr = numberTens[i] + numberHundred[j];
                        str = "" + i + j;
                        numArr = Integer.parseInt(str);
                    }
                }
            }
            if (!resulr.equals(" ")){
                coun = 3;
            }
        }
        //Проверка на Римские сотые
        if (resulr.equals(" ")){
            String str = "";
            for (int i = 1; i < romeHundred.length; i++){
                for (int j = 0; j < romeDes.length; j++) {
                    if (a.equals(romeHundred[i] + romeDes[j])) {
                        resulr = romeHundred[i] + romeDes[j];
                        str = "" + i + j;
                        numArr = Integer.parseInt(str);
                    }
                }
            }
            if (!resulr.equals(" ")) {
                coun = 4;
            }
        }
        return resulr;
    }
}
