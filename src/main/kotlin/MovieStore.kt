
class MovieStore(val movieList: List<Movie>) {
    init{
        if(movieList.size <5)  throw IllegalArgumentException()
    }

    fun findMoviesByReleaseDate(year: Int):List<Movie> = movieList.filter { movie -> movie hasReleaseYear year }

    fun findMoviesWithDurationGreaterThan(duration:Int):List<Movie> = movieList.filter { movie -> movie hasDurationGreaterThan duration }

    fun findMoviesWithActors(actor:String):List<Movie> = movieList.filter { movie -> movie hasActor actor }

}