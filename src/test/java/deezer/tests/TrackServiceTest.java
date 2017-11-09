package deezer.tests;

import deezer.model.TrackListModel;
import deezer.rest.TrackRest;
import deezer.service.TrackService;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import deezer.rest.TrackRest;
public class TrackServiceTest {

    private TrackListModel trackData;
    private TrackService trackService;

    private final String apiUrl="http://api.deezer.com";
    private final String endPoint="/search";
    private final String parameter="?q=";
    private final String value = "The%20Millionaire%20Waltz";
    private TrackRest trackRest;

    /***
     * This method open the connection and gets the API end point
     * @throws IOException
     */
    @Before
    public void setUp() throws IOException {
        trackService = new TrackService();
        trackRest = new TrackRest();
        trackData = new TrackListModel();
        //init request api client
        initRequestAPIClient();
    }

    private void initRequestAPIClient(){
        try {
            trackData = trackRest.getTrack(apiUrl ,endPoint ,parameter ,value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        org.junit.Assert.assertNotNull(trackData);
    }

    /***
     * This test case is getting the total of the The Millionaire Waltz albums and testing
     */
    @Test
    public void testingTotalNumberOfAlbumns() {
        Assert.assertEquals(trackService.getTotalAlbums(trackData), 7);
    }

    /***
     * This test case is getting the total of the The Millionaire Waltz albums and testing if the
     * object is correctly loaded
     */
    @Test
    public void testingIfTheObjectIsLoaded() {
        Assert.assertNotNull(trackService.getListOfAlbums(trackData));
    }
    
    /***
     * This test case is getting the total of the Covered albums by another artists
     */
    @Test
    public void testingTotalOfCoverAlbums() {
        Assert.assertEquals(4, trackService.getTotalCoverAlbums(trackData, "Queen"));
    }

    /***
     * This test case is getting the total of the Original albums by the artist
     */
    @Test
    public void testingTotalOfOriginalAlbums() {
    	
        Assert.assertEquals(3, trackService.getTotalOriginalAlbums(trackData, "Queen"));
    }
}
