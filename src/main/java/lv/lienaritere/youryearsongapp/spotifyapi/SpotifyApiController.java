package lv.lienaritere.youryearsongapp.spotifyapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpotifyApiController {

    @GetMapping("https://api.spotify.com/v1/search?q=remaster%2520artist%3AQueen&type=album&include_external=audio")
    public void getSpotifyApi() {

    }

}
