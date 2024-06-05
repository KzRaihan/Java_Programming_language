public class All_variabel {
    public static void main(String[] args) {
        byte b = 127; // range (-128 to 127)
        short s = 32767; // range (-32768 to 32767)
        int i = 2147483647; // range (-2147483648 to 2147483647)
        long l = 9223372036854775807L; // range (-9223372036854775808 to 9223372036854775807)
        float f = 3.4028235E38f; // range (1.4E-45 to 3.4028235E38)
        double d = 1.7976931348623157E308d; // range (4.9E-324 to 1.7976931348623157E308)
        char c = 'K'; // range (0 to 65535)

        System.out.println("b : " + b);
        System.out.println("s: " + s);
        System.out.println("i: " + i);
        System.out.println("l: " + l);
        System.out.println("f: " + f);
        System.out.println("d: " + d);
        System.out.println("c: " + c);
    }
    
}
