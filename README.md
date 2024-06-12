# Your Year Song App
## Back-end part

This is a simple app, created for learning purposes. The app uses free Spotify API that user can filter by year.
Back-end part made with Java/Spring Boot and [Spotify API wrapper](https://github.com/spotify-web-api-java/spotify-web-api-java/tree/master). The app uses H2 in-memory database to store search results. 
The Back-end retrieves search results, called by Front-end, and converts them to a response.
Front-end created with TypeScript, using React.js can be found [here](https://github.com/LienaRi/Your-Year-Song-App-Front-end).

## Run Project Locally

To run the project locally:

- Clone or fork this repository.
- Clone or fork the Front-end repository, that can be found [here](https://github.com/LienaRi/Your-Year-Song-App-Front-end).  
- In the Back-end part, update YOUR_SPOTIFY_CLIENT_ID and YOUR_SPOTIFY_CLIENT_SECRET in [spotifyapi/client/SpotifyApiClient](https://github.com/LienaRi/Your-Year-Song-App/blob/8bb93f1306814e1ab6275ffa1458fda5296a8299/src/main/java/lv/lienaritere/youryearsongapp/spotifyapi/client/SpotifyApiClient.java) with your Spotify API ID and Client Secret. The credentials can be obtained for free from [Spotify for Developers](https://developer.spotify.com/).
- Run the Back-end part.
- On the Front-end part, first run

    ```bash
    npm install
    ```
    
- Then run
    
    ```bash
    npm run dev
    ```
    
- The App is running on http://localhost:3000/
