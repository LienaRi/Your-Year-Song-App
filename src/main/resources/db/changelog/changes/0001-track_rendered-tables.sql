-- liquibase formatted sql

-- changeset liena:1

CREATE TABLE track_rendered
(
    search_Id     serial NOT NULL PRIMARY KEY,
    album_name    varchar,
    image_url     varchar,
    artists       varchar,
    external_urls varchar,
    id            varchar,
    is_playable   boolean,
    name          varchar,
    preview_url   varchar,
    searched_year varchar
);
