package lv.lienaritere.youryearsongapp.spotifyapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TrackRendered {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long searchId;
    private String albumName;
    private String imageUrl;
    private String artists;
    private String externalUrls;
    private String id;
    private Boolean isPlayable;
    private String name;
    private String previewUrl;
    private String searchedYear;

    public TrackRendered(String albumName,
                         String imageUrl,
                         String artists,
                         String externalUrls,
                         String id,
                         Boolean isPlayable,
                         String name,
                         String previewUrl,
                         String searchedYear) {
        this.albumName = albumName;
        this.imageUrl = imageUrl;
        this.artists = artists;
        this.externalUrls = externalUrls;
        this.id = id;
        this.isPlayable = isPlayable;
        this.name = name;
        this.previewUrl = previewUrl;
        this.searchedYear = searchedYear;
    }

    public TrackRendered() {

    }


    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public String getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(String externalUrls) {
        this.externalUrls = externalUrls;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getPlayable() {
        return isPlayable;
    }

    public void setPlayable(Boolean playable) {
        isPlayable = playable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getSearchedYear() {
        return searchedYear;
    }

    public void setYear(String searchedYear) {
        this.searchedYear = searchedYear;
    }

    public Long getSearchId() {
        return searchId;
    }

    public void setSearchId(Long search_id) {
        this.searchId = searchId;
    }

    @Override
    public String toString() {
        return "TrackRendered{" +
                "albumName='" + albumName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", artists='" + artists + '\'' +
                ", externalUrls='" + externalUrls + '\'' +
                ", id='" + id + '\'' +
                ", isPlayable=" + isPlayable +
                ", name='" + name + '\'' +
                ", previewUrl='" + previewUrl + '\'' +
                ", searchedYear='" + searchedYear + '\'' +
                '}';
    }
}
