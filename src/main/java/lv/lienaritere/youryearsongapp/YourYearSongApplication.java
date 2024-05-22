package lv.lienaritere.youryearsongapp;

import lv.lienaritere.youryearsongapp.spotifyapi.SpotifyApiResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static lv.lienaritere.youryearsongapp.spotifyapi.SpotifyApiAuthorization.clientCredentials;


@SpringBootApplication
public class YourYearSongApplication {

    public static void main(String[] args) {
        SpringApplication.run(YourYearSongApplication.class, args);
        clientCredentials();
    }

}
