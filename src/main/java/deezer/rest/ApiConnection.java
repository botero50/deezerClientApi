package deezer.rest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiConnection {
	
	/***
	 * This method opens the connection configuring it as JSON
	 * @param Url
	 * @return
	 * @throws IOException
	 */
	public static HttpURLConnection getHttpConnection(String Url ) throws IOException {
		URL url = new URL(Url);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		return conn;
	}
}
