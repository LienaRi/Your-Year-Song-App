package lv.lienaritere.youryearsongapp.spotifyapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpotifyApiRepository extends JpaRepository<TrackRendered, Long> {
    List<TrackRendered> findAllBySearchedYear(String year);
}
