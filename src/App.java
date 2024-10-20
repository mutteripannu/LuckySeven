import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        int cash = 5;
        Random random = new Random();
        int randomNumber01 = random.nextInt(10)+1;
        int randomNumber02 = random.nextInt(10)+1;
        int randomNumber03 = random.nextInt(10)+1;
        System.out.println("You have " + cash + " euros. One round costs 1 euros.");
        System.out.println("One number seven: You win 3 euros");
        System.out.println("Two number sevens: You win 5 euros.");
        System.err.println("Three number sevens: You win 10 euros!!!");
        System.out.println("Number one: " + randomNumber01);
        System.out.println("Number two: " + randomNumber02);
        System.out.println("Number three: " + randomNumber03);

        if(randomNumber01 == 7 && randomNumber02 == 7 && randomNumber03 == 7){
            System.out.println("You're a winner!!!");
            cash = cash + 10;
            System.out.println("You have " + cash + " euros.");
        }
        else if(randomNumber01 != 7 && randomNumber02 == 7 && randomNumber03 == 7 ||
                 randomNumber01 == 7 && randomNumber02 != 7 && randomNumber03 == 7 ||
                 randomNumber01 == 7 && randomNumber02 == 7 && randomNumber03 != 7) {
            System.out.println("You're a winner!!!");
            cash = cash + 5;
            System.out.println("You have " + cash + " euros.");
        }
        else if(randomNumber01 != 7 && randomNumber02 != 7 && randomNumber03 == 7 ||
                randomNumber01 == 7 && randomNumber02 != 7 && randomNumber03 != 7 ||
                randomNumber01 != 7 && randomNumber02 == 7 && randomNumber03 != 7) {
            System.out.println("You're a winner!!!");
            cash = cash + 3;
            System.out.println("You have " + cash + " euros.");
        }
        else{
            System.out.println("You lost...");
            System.out.println("You have " + cash + " euros.");
        }

    }
}
