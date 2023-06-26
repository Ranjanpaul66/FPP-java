package Assignment1;

public class Prob2 {

    /**
     * here in total sting length is 24.
     * Here waiving hands emoji has 2 Supplementary Characters and in my name there has 4. Rest of 18 are for normal characters.
     */
    public static void main(String[] args) {
        String santence = "My \uD83D\uDC4B, my name is \"\u09B0\u099E\u099C\u09A8\"";
        System.out.println(santence);
        System.out.println("String Size is: "+santence.length());

    }

}
