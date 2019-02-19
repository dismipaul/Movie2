package com.dismi.popularmovie2;


public class MovieObject {
    public String Id;
    public String Title;
    public String ReleaseDate;
    public String MoviePoster;
    public String VoteAverage;
    public String Overview;

    public MovieObject(String id,String title,String releaseDate, String moviePoster, String voteAverage,String overview)
    {
        Id = id;
        Title = title;
        ReleaseDate = releaseDate;
        MoviePoster = moviePoster;
        VoteAverage = voteAverage;
        Overview = overview;
    }
}


