package lv.lienaritere.youryearsongapp.spotifyapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import se.michaelthelin.spotify.exceptions.SpotifyWebApiException;

import java.io.IOException;
import java.util.List;

@RestController
public class SpotifyApiController {
    SpotifyApiService spotifyApiService;

    public SpotifyApiController(SpotifyApiService spotifyApiService) {
        this.spotifyApiService = spotifyApiService;
    }

    @GetMapping("/search/{year}")
    public List<TrackRendered> getYear(@PathVariable("year") String year) {
        try {
            return spotifyApiService.searchYear(year);
        } catch (IOException | SpotifyWebApiException e) {
            throw new RuntimeException(e + "Invalid search");
        }
    }
}
