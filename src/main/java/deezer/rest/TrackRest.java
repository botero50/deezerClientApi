package deezer.rest;

import com.google.gson.Gson;
import deezer.model.TrackListModel;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;

public class TrackRest {

	/***
	 * This method open the connection and gets the API end point
	 * @param apiUrl
	 * @param endPoint
	 * @param parameter
	 * @param value
	 * @return
	 * @throws IOException
	 */
	public TrackListModel getTrack(String apiUrl,String endPoint,String parameter,String value) throws IOException{
		HttpURLConnection conn = ApiConnection.getHttpConnection(apiUrl + endPoint + parameter + value);
		Reader reader = new InputStreamReader(conn.getInputStream());
		TrackListModel result  = new Gson().fromJson(reader, TrackListModel.class);
		conn.disconnect();
	    return result;
	}
}
