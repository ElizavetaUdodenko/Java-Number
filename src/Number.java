public class Number {
    public static void main(String[] args) {

        String s1 = "min value of number = " , s2 = "max value of number = " ;
        System.out.println(s1 + "(byte) " + Byte.MIN_VALUE);
        System.out.println(s2 + "(byte) " + Byte.MAX_VALUE);
        System.out.println(s1 + "(short) " + Short.MIN_VALUE);
        System.out.println(s2 + "(short) " + Short.MAX_VALUE);
        System.out.println(s1 + "(int) " + Integer.MIN_VALUE);
        System.out.println(s2 + "(int) " + Integer.MAX_VALUE);
        System.out.println(s1 + "(long) " + Long.MIN_VALUE);
        System.out.println(s2 + "(long) " + Long.MAX_VALUE);
        System.out.println(s1 + "(float) " + (-Float.MAX_VALUE));
        System.out.println(s2 + "(float) " + Float.MAX_VALUE);
        System.out.println(s1 + "(double) " + (-Double.MAX_VALUE));
        System.out.println(s2 + "(double) " + Double.MAX_VALUE);

    }
}
