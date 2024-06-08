package lv.lienaritere.youryearsongapp.spotifyapi;

public class TrackRendered {

    private String albumName;
    private String imageUrl;
    private String artists;
    private String externalUrls;
    private String id;
    private Boolean isPlayable;
    private String name;
    private String previewUrl;

    public TrackRendered(String albumName, String imageUrl, String artists,
                         String externalUrls,
                         String id, Boolean isPlayable,
                         String name, String previewUrl) {
        this.albumName = albumName;
        this.imageUrl = imageUrl;
        this.artists = artists;
        this.externalUrls = externalUrls;
        this.id = id;
        this.isPlayable = isPlayable;
        this.name = name;
        this.previewUrl = previewUrl;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "TrackWithSelections{" +
                "albumName='" + albumName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", artists='" + artists + '\'' +
                ", externalUrls='" + externalUrls + '\'' +
                ", id='" + id + '\'' +
                ", isPlayable=" + isPlayable +
                ", name='" + name + '\'' +
                ", previewUrl='" + previewUrl + '\'' +
                '}';
    }
}
