public class Null {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "   ";
        if (isNullOrEmpty(str1))
            System.out.println("str1 is null or empty.");
        else
            System.out.println("str1 is not null or empty.");
        if (isNullOrEmpty(str2))
            System.out.println("str2 is null or empty.");
        else
            System.out.println("str2 is not null or empty.");
    }

    public static boolean isNullOrEmpty(String str) {
        if (str != null && !str.trim().isEmpty())
            return false;
        return true;
    }
}