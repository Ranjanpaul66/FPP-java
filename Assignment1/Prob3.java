package Assignment1;

public class Prob3 {

    public static void main(String[] args) {
        int randomNumber =  RandomNumbers .getRandomInt(0,2000000000);

        System.out.println("Random no is: "+ randomNumber);

        if (randomNumber <= Byte.MAX_VALUE && randomNumber >= Byte.MIN_VALUE) {
            System.out.println("Preferred data type: byte");
        }  if (randomNumber <= Short.MAX_VALUE && randomNumber >= Short.MIN_VALUE) {
            System.out.println("Preferred data type: short");
        }  if (randomNumber <= Integer.MAX_VALUE && randomNumber >= Integer.MIN_VALUE) {
            System.out.println("Preferred data type: int");
        } if (randomNumber <= Long.MAX_VALUE && randomNumber >= Long.MIN_VALUE) {
            System.out.println("Preferred data type: long");
        }
    }

}
