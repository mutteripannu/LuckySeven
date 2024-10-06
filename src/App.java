import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int randomNumber01 = random.nextInt(10)+1;
        int randomNumber02 = random.nextInt(10)+1;
        int randomNumber03 = random.nextInt(10)+1;
        System.out.println("Random number: " + randomNumber01);
        System.out.println("Random number: " + randomNumber02);
        System.out.println("Random number: " + randomNumber03);

        if(randomNumber01 == 7 || randomNumber02 == 7 || randomNumber03 == 7){
            System.out.println("You're a winner!!!");
        }
        else{
            System.out.println("You lost...");
        }
    }
}
