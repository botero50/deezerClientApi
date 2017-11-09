package deezer.service;

import deezer.model.AlbumModel;
import deezer.model.ArtistModel;
import deezer.model.TrackListModel;
import deezer.model.TrackModel;

import java.util.ArrayList;
import java.util.List;

public class TrackService {

	/***
	 * This method gets all the total searched albums on the API
	 * @param tracks
	 * @return
	 */
    public int getTotalSearchItems(TrackListModel tracks) {
        return tracks.getData().size();
    }

    /***
     * This method gets all a string list of all the albums
     * @param tracks
     * @return
     */
   public List<AlbumModel> getListOfAlbums(TrackListModel tracks) {
       List<AlbumModel> albumModels = new ArrayList<AlbumModel>();
       for (TrackModel track:tracks.getData()) {
           albumModels.add(track.getAlbum());
       }
       return albumModels;
   }

   /***
    * This method gets the total covered albums on the API for the searched artist
    * @param tracks
    * @param artist
    * @return
    */
    public int getTotalCoverAlbums(TrackListModel tracks, String artist) {
        List<ArtistModel> artistModel = new ArrayList<ArtistModel>();
        for(TrackModel track: tracks.getData()){
        	if (!track.getArtist().getName().equalsIgnoreCase(artist))
            {
        		artistModel.add(track.getArtist());
            }
        }
        return artistModel.size();
    }

    /***
     * This method gets the total original albums on the API for the searched artist
     * @param tracks
     * @param artist
     * @return
     */
    public int getTotalOriginalAlbums(TrackListModel tracks, String artist) {
        List<ArtistModel> artistModel = new ArrayList<ArtistModel>();
        for(TrackModel track: tracks.getData()){
        	if (track.getArtist().getName().equalsIgnoreCase(artist))
            {
        		artistModel.add(track.getArtist());
            }
        }
        return artistModel.size();
    }
    
    /***
     * This method gets the total albums on the API response
     * @param tracks
     * @return
     */
    public int getTotalAlbums(TrackListModel tracks) {

        List<AlbumModel> albumModels = new ArrayList<AlbumModel>();
        for (TrackModel track:tracks.getData()) {
            albumModels.add(track.getAlbum());
        }
        return albumModels.size();
    }
}
