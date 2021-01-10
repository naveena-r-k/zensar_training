package dec10.dec11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5 {

	public static void main(String args[]) throws IOException {
        char bit;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        do {
            bit = (char) console.read();
            System.out.print(bit);
        } while (bit != '\'');
    }
}
