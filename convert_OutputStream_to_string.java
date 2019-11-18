import java.io.*;

public class OutputStreamString {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        String line = "Hello there!";
        stream.write(line.getBytes());
        String finalString = new String(stream.toByteArray());
        System.out.println(finalString);
    }
}