package lv.lienaritere.youryearsongapp.spotifyapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import se.michaelthelin.spotify.exceptions.SpotifyWebApiException;

import java.io.IOException;
import java.util.Arrays;

@RestController
public class SpotifyApiController {
    SpotifyApiService spotifyApiService;
    public SpotifyApiController(SpotifyApiService spotifyApiService) {
        this.spotifyApiService = spotifyApiService;
    }

    @GetMapping("/search/{year}")
    public TrackRendered[] getYear(@PathVariable("year") String year) {
        try {
            Object[] response = spotifyApiService.searchYear(year);
            return Arrays.copyOf(response, response.length, TrackRendered[].class);
        } catch (IOException | SpotifyWebApiException e) {
            throw new RuntimeException(e + "Invalid search");
        }
    }
}
