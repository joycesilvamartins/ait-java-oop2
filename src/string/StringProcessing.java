package string;

public class StringProcessing {

    public static void main(String[] args) {
   hamlet();
        //ifPoem();
        //compareStrings();   
        //System.out.println(usingStrings());
        //System.out.println(usingSB());
        //interning();
    }

    public static void hamlet() {
        StringBuilder sb = new StringBuilder();

        // the monologue from Hamlet(given)
        sb.append("To be, or not to be--that is the question: \n");
        sb.append("Whether 'tis nobler in the mind to suffer \n");
        sb.append("The slings and arrows of outrageous fortune \n");
        sb.append("Or to take arms against a sea of troubles \n");
        sb.append("And by opposing end them. To die, to sleep--\n");
        sb.append("No more--and by a sleep to say we end \n");
        sb.append("The heartache, and the thousand natural shocks \n");
        //sb.append("That flesh is heir to.\n");
        sb.append("That flesh is air to.\n");

        //1a
        int indexOfLastFullStop = sb.lastIndexOf(".");
        //sb.setCharAt(indexOfLastFullStop, '!');
        sb.replace(indexOfLastFullStop,indexOfLastFullStop+1, "!");
        System.out.println("(a)\n" + sb);
        //1b
        int indexOfAir = sb.indexOf("air");
        sb.replace(indexOfAir, indexOfAir + "air".length(), "heir");
        System.out.println("(b)\n" + sb);
        //1c
        int whereToStart = sb.indexOf("The slings and arrows of outrageous fortune");
        int whereToEnd = whereToStart + "The slings and arrows of outrageous fortune".length();
        String thirdLine = sb.substring(whereToStart, whereToEnd);
        System.out.println("(c)\n" + thirdLine);

    }

    public static void ifPoem() {

        StringBuilder sb = new StringBuilder();

        // the poem (given)
        sb.append("If you can keep your head when all about you \n");
        sb.append("Are losing theirs and blaming it on you;\n");
        sb.append("If you can trust yourself when all men doubt you,\n");
        sb.append("But make allowance for their doubting too;\n");
        sb.append("If you can wait and not be tired by waiting,\n");
        sb.append("Or, being lied about, don't deal in lies,\n");
        sb.append("Or, being hated, don't give way to hating,\n");
        sb.append("And yet don't look too good, nor talk too wise;\n");

        //2a
        sb.insert(0, "1.");

        sb.insert(sb.indexOf("Are losing theirs and blaming it on you"), "2.");

        sb.insert(sb.indexOf("If you can trust yourself when all men doubt you"), "3.");

        int indexOfFourthLine = sb.indexOf("But make allowance for their doubting too;");
        sb.insert(indexOfFourthLine, "4.");

        int indexOfFifthLine = sb.indexOf("If you can wait and not be tired by waiting", indexOfFourthLine);
        sb.insert(indexOfFifthLine, "5.");

        int indexOfSixthLine = sb.indexOf("Or, being lied about", sb.indexOf("5."));
        sb.insert(indexOfSixthLine, "6.");

        sb.insert(sb.indexOf("Or, being hated", sb.indexOf("6.")), "7.");

        sb.insert(sb.indexOf("And yet don't look too good", sb.indexOf("7.")), "8.");

        System.out.println(sb);

        //2b
        System.out.println("The 10th character is " + sb.charAt(10));

        //2c
        // replace (fromIndex, toIndex, whatToReplaceWith)
        sb.replace(sb.indexOf("trust"), // e.g. 40
                sb.indexOf("trust") + "trust".length(), //      45
                "TRUST");
        System.out.println(sb);

        //2d
        while (sb.indexOf("don't") != -1) {
            sb.replace(sb.indexOf("don't"),
                    sb.indexOf("don't") + "don't".length(),
                    "do not");
        }

    }

    public static void compareStrings() {
        String name = "alan";                   // 'a' is ASCII 97
        int result = "sean".compareTo(name);    // 's' is ASCII 115
        System.out.println(result);             // 115-97 == 18

        System.out.println("jack".compareTo("paul"));// -6
        System.out.println("tom".compareTo("tim"));// 6
        System.out.println("tom".compareTo("tom"));// 0
    }

    public static String usingStrings() {
        // 1 == "The numbers are: "
        // 2 == "0"
        // 3 == "The numbers are: 0"
        // 4 == "1"
        // 5 == "The numbers are: 01"
        // 6 == "2"
        // 7 == "The numbers are: 012"
        // 8 == "3"
        // 9 == "The numbers are: 0123"
        // 10 == "4"
        // 11 == "The numbers are: 01234"
        // 12 == "5"
        // 13 == "The numbers are: 012345"   

        String s = "The numbers are: ";
        for (int i = 0; i <= 5; i++) {
            s += i; // s = s + i;
//            s += Integer.toString(i);
//            s += String.valueOf(i);
        }
        return s;
    }

    public static String usingSB() {
        // 2 objects in this method:
        //  the String literal "The numbers are: " and
        //  the StringBuilder
        StringBuilder sb = new StringBuilder("The numbers are: ");
        for (int i = 0; i <= 5; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void interning() {

        String a = "abc";
        String b = "abc";
        System.out.println(a == b);//point in the same object  - true

        String c = new String("abc");
        String d = new String("abc");
        System.out.println(c == d);//false

        String e = new String("abc").intern();
        String f = new String("abc").intern();
        System.out.println(e == f);//true

        System.out.println(e == a);//true
    }

}
