public class Type_conversion {
    public static void main(String[] args) {
        
        byte b;

        int i = 257;

        double d = 323.142;

        b = (byte) i;
       
        System.out.println("Conversion int to Byte: " + i + " " + b);
        i = (int)d;
        System.out.println("Conversion double to int: " + d + " " + i);
        b = (byte) d;
        
        System.out.println("Conversion double to byte: " + d + " " + b);
       

    }
}
