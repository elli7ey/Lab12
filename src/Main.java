import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("C:\\Users\\smirn\\OneDrive\\Desktop\\Java\\Lab12\\Lab12\\src\\input.txt");
            FileOutputStream out = new FileOutputStream("output.txt");

            byte[] buffer = new byte[in.available()];

            int res = in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);

            System.out.println(res);

            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}