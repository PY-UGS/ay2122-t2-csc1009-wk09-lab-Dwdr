import java.util.Random;
public class RandomCharacter {
    Random r = new Random();
    private char c;

    public char getRandomLowerCaseLetter() {
        c = (char) (r.nextInt(26) + 'a');
        return c;
    }

    public char getRandomUpperCaseLetter() {
        c = (char) (r.nextInt(26) + 'A');
        return c;
    }

    public char getRandomDigitCharacter() {
        c = (char) (r.nextInt(10) + '0');
        return c;
    }
    public char getRandomCharacter(){
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ?/.,";
        c = alphabet.charAt(r.nextInt(alphabet.length()));
        return c;
    }
    public static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
    public int getPrime(){
        int n;
        n = r.nextInt(1000)+1;
        if (isPrime(n)) {
            System.out.print("["+n + " is a prime number"+"]. ");
        } else {
            System.out.print("["+n + " is not a prime number"+"]. ");
        }
        return n;
    }
    public static void main(String[] args) {
        RandomCharacter test = new RandomCharacter();

        System.out.println("Lower Case Letters: ");
        for (int i = 0; i<15; i++){
            System.out.print(test.getRandomLowerCaseLetter() + " ");
        }
        System.out.println("");

        System.out.println("\nUpper Case Letters: ");
        for (int i = 0; i<15; i++){
            System.out.print(test.getRandomUpperCaseLetter() + " ");
        }
        System.out.println("");

        System.out.println("\nDigit Characters: ");
        for (int i = 0; i<15; i++){
            System.out.print(test.getRandomDigitCharacter() + " ");
        }
        System.out.println("");

        System.out.println("\nRandom Characters: ");
        for (int i = 0; i<15; i++){
            System.out.print(test.getRandomCharacter() + " ");
        }
        System.out.println("");

        System.out.println("\nPrime Numbers Check: ");
        for (int i = 0; i<15; i++){
            test.getPrime();
            //System.out.print(test.getPrimse() + " ");
        }
        System.out.println("");
    }
}
