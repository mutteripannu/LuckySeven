import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;
        System.out.println("Random number: " + randomNumber);
    }
}
