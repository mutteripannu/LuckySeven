import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int cash = 0;
        String playAgain = "";
        Random random = new Random();
        System.out.println("***********************");
        System.out.println("Welcome to LUCKY SEVEN!");
        System.out.println("************************");
        System.out.println("One round costs 1 euro.");
        System.out.println("One number seven: You win 3 euros");
        System.out.println("Two number sevens: You win 5 euros.");
        System.err.println("Three number sevens: You win 10 euros!");
        System.out.println("Insert sum you wish to play with.");
        cash = in.nextInt();
        System.out.println("Okay, you are starting with " + cash + " euros. Let's play!");
  do{    
        int randomNumber01 = random.nextInt(10)+1;
        int randomNumber02 = random.nextInt(10)+1;
        int randomNumber03 = random.nextInt(10)+1;  

        cash = cash -1;
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

        System.out.println("Play Again? (Y/N)");
        playAgain = in.next();
        
    } while (playAgain.equalsIgnoreCase("y"));
    //still missing check if player has any money left
    }
}
