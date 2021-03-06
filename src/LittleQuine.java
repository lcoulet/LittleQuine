/*
 * Public domain, use at your own risk
 */


/**
 * A Quine is a computer program that akes no input and outputs a copy of its
 * source code
 *
 * @author Loic.Coulet
 */
public class LittleQuine {

    public static void main(String[] args) {
        String s = "/*\n"
                + " * Public domain, use at your own risk\n"
                + " */\n"
                + "\n"
                + "\n"
                + "/**\n"
                + " * A Quine is a computer program that akes no input and outputs a copy of its\n"
                + " * source code\n"
                + " *\n"
                + " * @author Loic.Coulet\n"
                + " */\n"
                + "public class LittleQuine {\n"
                + "\n"
                + "    public static void main(String[] args) {\n"
                + "        String s = \"GO\";\n"
                + "        String s2 = (\"\\\"\" + s.replace(\"\\\\\", \"\\\\\\\\\").replace(\"\\\"\", \"\\\\\\\"\") + \"\\\"\").replace(\"\\n\", \"\\\\n\\\"\\r\\n                + \\\"\");\n"
                + "        System.out.println(s.replace(\"\\\"GO\\\"\", s2));\n"
                + "    }\n"
                + "\n"
                + "}";
        String s2 = ("\"" + s.replace("\\", "\\\\").replace("\"", "\\\"") + "\"").replace("\n", "\\n\"\r\n                + \"");
        System.out.println(s.replace("\"GO\"", s2));
    }

}
