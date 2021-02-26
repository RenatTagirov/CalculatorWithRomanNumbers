public class RomeResult {
    private static final String[] romeDes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private static final String[] romeHundred = {"", "X", "XX", "XXX", "XXXX", "L", "LX", "LXX", "LXXX", "LXXXX", "C"};
    private static final String[] rometTousand = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M"};
    private static final String[] rometTenTousand = {"", "M", "MM", "MMM", "MV", "V", "VM", "VMM", "VMMM", "MX", "X"};

    static String result = "";

    public static void Result(int num){

        if (num <= 9) {
            result = romeDes[num];
            System.out.println(result);
        }
        else if (num < 100){
            result = romeHundred[num / 10] + romeDes[num % 10];
            System.out.println(result);
        }
        else if (num < 1000){
            result = rometTousand[num / 100] + romeHundred[num / 10 % 10] + romeDes[num % 10];
            System.out.println(result);
        }
        else if (num <= 10000){
            result = rometTenTousand[num / 1000] + rometTousand[num / 100 % 10] + romeHundred[num / 10 % 10] + romeDes[num % 10];
            System.out.println(result);
        }
    }
}
