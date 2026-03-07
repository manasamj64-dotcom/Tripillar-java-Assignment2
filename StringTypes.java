package assignments.module4;

public class StringTypes {
        public static void main(String[] args) {

            String s = "Hello";
            s = s + " World";

            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");

            StringBuffer sbf = new StringBuffer("Hello");
            sbf.append(" World");

            System.out.println("String: " + s);
            System.out.println("StringBuilder: " + sb);
            System.out.println("StringBuffer: " + sbf);
        }
    }

