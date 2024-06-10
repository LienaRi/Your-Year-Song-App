package lv.lienaritere.youryearsongapp.spotifyapi;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SpotifyApiRepository {
    private final Map<String, Integer> searchResultsKeeper;

    public SpotifyApiRepository() {
        searchResultsKeeper = new HashMap<>();
    }

    public Map<String, Integer> getSearchResultsKeeper() {
        return searchResultsKeeper;
    }

    public void addSearchedYear(String year) {
        if (searchResultsKeeper.containsKey(year)) {
            searchResultsKeeper.replace(year, searchResultsKeeper.get(year) + 20);
        } else {
            searchResultsKeeper.put(year, 20);
        }
    }
}
