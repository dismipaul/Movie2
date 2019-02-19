package com.dismi.popularmovie2.data;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

public class MoviesContract {
    public static final String CONTENT_AUTHORITY = "com.dismi.popularmovie2";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_MOVIES = "movies";

    public static final class MoviesColumns implements BaseColumns{

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_MOVIES).build();
        public static final String TABLE_NAME = "movies";
        public static final String COLUMN_KEY = "movies_id";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_RELEASE_DATE = "releasedate";
        public static final String COLUMN_MOVIE_POSTER = "poster";
        public static final String COLUMN_VOTE_AVERAGE = "voteaverage";
        public static final String COLUMN_OVERVIEW = "overview";

        public static Uri getMoviesUri() {
            return CONTENT_URI.buildUpon().build();
        }
        public static Uri getMoviesUri(long _id) {
            return ContentUris.withAppendedId(CONTENT_URI, _id);
        }
    }
}
