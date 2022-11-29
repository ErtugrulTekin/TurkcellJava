package remoteFileLab;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class Main {

	// URL ile uzaktaki bir dosya okundu ve pc'ye içeriği dosya oluşturarak
	// kaydedildi
	public static void main(String[] args) {
		try {
			URL url = new URL("http://example-files.online-convert.com/document/txt/example.txt");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			InputStream inputStream = connection.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			char[] buffer = new char[1024];

			FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
//			StringBuilder builder = new StringBuilder();
			int length = 0;
			while ((length = inputStreamReader.read(buffer)) != -1) {
//				builder.append(Arrays.copyOfRange(buffer, 0, length));
				fileOutputStream.write(new String(Arrays.copyOfRange(buffer, 0, length)).getBytes());
			}
//			System.out.println(builder.toString());
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
