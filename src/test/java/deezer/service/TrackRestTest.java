package deezer.service;

import deezer.model.TrackListModel;
import deezer.rest.TrackRest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class TrackRestTest {
	private TrackListModel trackData = new TrackListModel();
	private TrackRest trackService;
	
	private final String apiUrl="http://api.deezer.com";
	private final String endPoint="/search";
	private final String parameter="?q=";
	private final String value = "The%20Millionaire%20Waltz";

	@Before
	public void setUp() throws IOException {
		trackService = new TrackRest();
	}

	/***
	 * Testing Enpoint
	 */
	@Test
	public void trackOk(){
		trackData = null;
		try {
			trackData = trackService.getTrack(apiUrl ,endPoint ,parameter ,value);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(trackData);
	}
}
