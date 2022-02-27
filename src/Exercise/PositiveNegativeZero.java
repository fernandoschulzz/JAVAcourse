package Exercise;

import java.awt.color.ICC_ColorSpace;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-8);
        checkNumber(0);
    }

    public static void checkNumber(int  number) {
        if(number > 0) {
            System.out.println("positive");
        }
        else if(number < 0) {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }
}
