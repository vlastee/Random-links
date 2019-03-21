import java.io.IOException;
import java.net.MalformedURLException;


public class Main {
	public static void main(String[] args) throws MalformedURLException, IOException {
		Runnable Program = new Interface();
		Thread t1 = new Thread(Program);
		t1.start();
	}
}
