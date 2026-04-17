public class Main {
    public static void main(String[] args) {
        int I = 1;
        int J = 60;
        System.out.println("I=" + I + " " + "J=" + J);

        while (J != 0) {
                I += 3;
                J -= 5;
                System.out.println("I=" + I + " " + "J=" + J);
        }
    }
}
