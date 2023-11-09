public class Module01 {
    public static void main(String[] args) {
        //System.out.println(checkString("Questa è una stringa"));
        String string = "Questa è una stringa";
        System.out.println(checkStringTern(string));
    }

    /*private static String checkString(String value) {
        String result;
        if (value.length() >= 10) {
            result = "Lunghezza maggiore o uguale di 10";
        } else {
            result = "Lunghezza minore di 10";
        }
        return result;
    }*/
    static String checkStringTern(String value) {
       return value.length() >= 10?
                "Lunghezza maggiore o uguale di 10":
                "Lunghezza minore di 10";
    }
}