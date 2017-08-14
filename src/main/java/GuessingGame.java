public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("ADMINISTRATOR SETUP\n===================");
        String item = Prompter.getInput("What type of item: ");
        String number = Prompter.getInput(String.format("What is the maximum amount of %s: ", item));
        Jar jar = new Jar(item, Integer.valueOf(number));

        System.out.println("\n\nPLAYER\n===================");
        System.out.println(String.format("How many %s are in the jar? Pick a number between 1 and %d.", item, jar.getMaxItemsInJar()));


        do {

            String guess = Prompter.getInput("Guess: ");
            jar.guess(Integer.valueOf(guess));

            if (jar.isOverMax()) {
                System.out.println(String.format("Your guess must be less than %d", jar.getMaxItemsInJar()));
            } else if(jar.isUnderMin()) {

            } else {
                if (jar.isGuessTooLow()) {
                    System.out.println("Your guess is too low");
                } else if (jar.isGuessToHigh()){
                    System.out.println("Your guess is too high");
                }
            }


        } while(!jar.isHit());


        if (jar.isHit()) {
            System.out.println(String.format("You got it in %d attempts", jar.getGuessCount()));
        }


    }


}