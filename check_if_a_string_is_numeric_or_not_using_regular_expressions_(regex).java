public class Numeric {
    public static void main(String[] args) {
        String string = "-1234.15";
        boolean numeric = true;
        numeric = string.matches("-?\\d+(\\.\\d+)?");
        if (numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
    }
}