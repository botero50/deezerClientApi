package deezer.tests;

import deezer.model.AlbumModel;
import deezer.model.ArtistModel;
import deezer.model.TrackListModel;
import deezer.model.TrackModel;
import deezer.service.TrackService;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrackServiceUnitTest {

    private TrackListModel trackData;
    private TrackService trackService;
    private TrackModel trackModel;
    private AlbumModel albumModel;
    private ArtistModel artistModel;
    private List<TrackModel> data;

    @Before
    public void setUp() throws IOException {
        trackService = new TrackService();
        trackData = new TrackListModel();
        //init local data
        initArtistModel();
        initAlbumModel();
        initTrackModel();
        initListTrackModel();
        initObjectListModel();
    }

    private void initObjectListModel() {
        trackData.setData(data);
    }

    private void initListTrackModel() {
        data = new ArrayList<TrackModel>();
        data.add(trackModel);
    }
    
    /***
     * Mocking data
     */
    private void initTrackModel() {
        trackModel = new TrackModel();
        trackModel.setId("1");
        trackModel.setDuration("10");
        trackModel.setExplicit_lyrics(true);
        trackModel.setLink("www.Deezer.com");
        trackModel.setPreview("Preview");
        trackModel.setRank("1");
        trackModel.setAlbum(albumModel);
        trackModel.setArtist(artistModel);
    }

    private void initAlbumModel() {
        albumModel = new AlbumModel();
        albumModel.setId(10L);
    }

    private void initArtistModel() {
        artistModel = new ArtistModel();
        artistModel.setId(15L);
        artistModel.setName("Queen");
    }

    /***
     * This test case is getting the total of the The Millionaire Waltz albums and testing
     */
    @Test
    public void testingTotalNumberOfAlbumns() {
        Assert.assertEquals(trackService.getTotalAlbums(trackData), 1);
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
        Assert.assertEquals(0, trackService.getTotalCoverAlbums(trackData, "Queen"));
    }
    
    /***
     * This test case is getting the total of the Original albums by the artist
     */
    @Test
    public void testingTotalOfOriginalAlbums() {
        Assert.assertEquals(1, trackService.getTotalOriginalAlbums(trackData, "Queen"));
    }


}

