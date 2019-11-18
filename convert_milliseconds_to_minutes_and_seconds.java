public class Milliseconds {
    public static void main(String[] args) {
        long milliseconds = 1000000;
        long minutes = (milliseconds / 1000) / 60;
        long seconds = (milliseconds / 1000) % 60;
        System.out.format("%d Milliseconds = %d minutes and %d seconds.", milliseconds, minutes, seconds);
    }
}