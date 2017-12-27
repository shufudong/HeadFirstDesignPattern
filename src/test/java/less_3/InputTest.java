package less_3;

import less_3.inputStream.LowerCaseInputStream;

import java.io.*;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-26 2:13
 */
public class InputTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while (((c = in.read())) >= 0) {
                System.out.println((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
