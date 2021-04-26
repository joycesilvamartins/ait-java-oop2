package exercises;

public class StringEx {
    
    public static void main(String[] args) {
        hamlet();
        
    }

    private static void hamlet() {
        
        StringBuilder sb = new StringBuilder();
        //(from Hamlet, spoken by Hamlet)
        sb.append("To be, or not to be, that is the question:\n");
        sb.append("Whether 'tis nobler in the mind to suffer\n");
        sb.append("The slings and arrows of outrageous fortune,\n");
        sb.append("Or to take arms against a sea of troubles\n");
        sb.append("And by opposing end them. To die—to sleep,\n");
        sb.append("No more; and by a sleep to say we end\n");
        sb.append("The heart-ache and the thousand natural shocks\n");
        //sb.append("That flesh is heir to: 'tis a consummation.\n");
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
        
    }
    
}
