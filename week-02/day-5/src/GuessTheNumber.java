import java.util.*;


public class GuessTheNumber {
    public static int lives = 5;
    public static void main(String[] args) {
        int interval = 0;
        int value = 0;
        int lives = 4;

        interval = infoReq();
        value = randomGen(interval);
        System.out.println("Give me your guesses.");
        while (lives >= 0) {
            eval(guess(), value, lives);
            lives -=1;
        }
        if (lives == -1){
            System.out.println("Game over!");
        }
    }

    static int infoReq () {
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 0 and the interval you give me. You have 5 lives.");
        int interval = 0;
        interval = sc.nextInt();
        return interval;
    }

    static int randomGen (int interval) {
        Random r = new Random();
        int val = r.nextInt(interval + 1);
        return val;
    }

    static int guess () {
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        return guess;
    }

    static void eval (int guess, int val, int lives) {
        if (guess > val) {
            System.out.println("Too high, you have " + lives + " live(s) left.");
        } else if (guess < val){
            System.out.println("Too low, you have " + lives + " live(s) left.");
        } else {
            System.out.println("Congratulations. You won!");
        }
    }
}
