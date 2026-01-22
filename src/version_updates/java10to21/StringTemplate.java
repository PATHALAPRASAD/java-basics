package version_updates.java10to21;

import javax.print.DocFlavor;

public class StringTemplate {
    static void main() {
        int i = 2;
        int j = 3;
        System.out.println(i + " + " + j + " = " + (i + j));
//        System.out.println(STR."\{i} + \{j} = \{i + j}");
        // currently I am using jdk 25.0.2 (STR feature removed, i tried to work with jdk 21, but i couldn't find STR in jdk 21 also)
    }
}
