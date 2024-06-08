package lv.lienaritere.youryearsongapp.spotifyapi;

import com.neovisionaries.i18n.CountryCode;
import lv.lienaritere.youryearsongapp.spotifyapi.client.SpotifyApiClient;
import org.apache.hc.core5.http.ParseException;
import org.springframework.stereotype.Service;
import se.michaelthelin.spotify.SpotifyApi;
import se.michaelthelin.spotify.exceptions.SpotifyWebApiException;
import se.michaelthelin.spotify.model_objects.specification.*;
import se.michaelthelin.spotify.requests.data.search.simplified.SearchTracksRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class SpotifyApiService {
    SpotifyApiRepository spotifyApiRepository;


    public SpotifyApiService(SpotifyApiRepository spotifyApiRepository) {
        this.spotifyApiRepository = spotifyApiRepository;
    }

    protected Object[] searchYear(String year) throws IOException, SpotifyWebApiException {
        String searchQuery = "year=" + year;

        SpotifyApi spotifyApi = new SpotifyApi.Builder()
                .setAccessToken(SpotifyApiClient.getAccessToken())
                .build();

        SearchTracksRequest searchTracksRequest = spotifyApi.searchTracks(searchQuery)
                .market(CountryCode.LV)
                .limit(10)
                .offset(getOffset(year))
                .includeExternal("audio")
                .build();

        try {
            Paging<Track> trackPaging = searchTracksRequest.execute();
            return convertDataToTrack(trackPaging.getItems()).toArray();
        } catch (IOException | SpotifyWebApiException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    private int getOffset(String year) {
        if (spotifyApiRepository.getSearchResultsKeeper() != null
                && spotifyApiRepository.getSearchResultsKeeper().containsKey(year))
            return spotifyApiRepository.getSearchResultsKeeper().get(year) * 10;
        return 0;
    }

    private List<TrackRendered> convertDataToTrack(Track[] trackArray) {
        List<TrackRendered> tracks = new ArrayList<>();
        for (Track track : trackArray) {
            TrackRendered trackOutput = new TrackRendered(
                    track.getAlbum().getName(),
                    getImageUrl(track),
                    getArtistName(track),
                    getExternalUrl(track),
                    track.getId(),
                    track.getIsPlayable(),
                    track.getName(),
                    track.getPreviewUrl());
            tracks.add(trackOutput);
        }
        for (TrackRendered track : tracks) {
            System.out.println(track.toString());
        }
        return tracks;
    }

    private String getImageUrl(Track track) {
        List<String> imageUrls = new ArrayList<>();
        for (Image image : track.getAlbum().getImages()) {
            imageUrls.add(image.getUrl());
        }
        return imageUrls.getFirst();
    }

    private String getArtistName(Track track) {
        return Arrays.stream(track.getArtists())
                .map(ArtistSimplified::getName)
                .toList()
                .getFirst();
    }

    private String getExternalUrl(Track track) {
        return track.getExternalUrls()
                .getExternalUrls()
                .get("spotify");
    }

}
