public class Main {
    public static void main(String[] args) {
        //Init variable
        int birthMonth = 3;
        //Output asking for birth month
        System.out.println("What is you birth month? (1-12)");
            //If the birth month is over 12, let user know it's out of range.
            if (birthMonth > 12) {
                System.out.println("You incorrect month value: " + birthMonth);
                //If the birth month is under 1, let user know it's out of range.
            } else if (birthMonth < 1) {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            } else {
                //Birth month in range, print result.
                System.out.println("Your birth month is " + birthMonth);
            }
    }
}

