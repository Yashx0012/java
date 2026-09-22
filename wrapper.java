public class wrapper{
    public static void main(String[] args){
        int pInt = 50;
        double pDouble = 99.99;

        Integer wInt = pInt;
        Double  wDouble = pDouble;

        int backtoint = wInt;

        System.out.println("Wrapped Integer object: " + wInt);
        System.out.println("Unboxed primitive int: " + backtoint);

        String str = "1234";
        int parsedValue =Integer.parseInt(str);
        System.out.println("Parsed String to int: " + parsedValue);

        double highprecision  = 105.8;
        int lowprecision = (int)highprecision;
        System.out.println("Casted double to int: " + lowprecision);
    }
}