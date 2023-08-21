public class Main {

    public static void main(String[] args) {

        Zumbi bub = new Zumbi();
        Zumbi worm_eye = new Zumbi();

        bub.vida = 10;
        worm_eye.vida = 15;

        System.out.println("Vida do bub: " + bub.vida);
        System.out.println("Vida do Worm Eye: " + worm_eye.vida);
        System.out.println("");

        bub = worm_eye;

        System.out.println("Vida do bub: " + bub.vida);
        System.out.println("Vida do Worm Eye: " + worm_eye.vida);

    }
}