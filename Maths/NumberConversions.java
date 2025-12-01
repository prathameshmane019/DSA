public class NumberConversions {

    public static void main(String[] args) {
        // int decimalNumber = 25;
        
        String binaryString = "11001";
        int decimalFromBinary = Integer.parseInt(binaryString, 2);
        // String binaryNumber = Integer.toBinaryString(decimalNumber);
        String octalNumber = Integer.toOctalString(decimalFromBinary);
        // String hexadecimalNumber = Integer.toHexString(decimalNumber).toUpperCase();

        // System.out.println("Decimal: " + decimalNumber);
        // System.out.println("Binary: " + binaryNumber);
        System.out.println("Octal: " + octalNumber);
        // System.out.println("Hexadecimal: " + hexadecimalNumber);

        // System.out.println("Decimal from binary " + binaryString + ": " + decimalFromBinary);

        // String octalString = "31";
        // int decimalFromOctal = Integer.parseInt(octalString, 8);
        // System.out.println("Decimal from octal " + octalString + ": " + decimalFromOctal);

        // String hexString = "19";
        // int decimalFromHex = Integer.parseInt(hexString, 16);
        // System.out.println("Decimal from hexadecimal " + hexString + ": " + decimalFromHex);
    }
}
