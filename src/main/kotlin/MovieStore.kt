
class MovieStore(val movieList: List<Movie>) {
    init{
        if(movieList.size <5)  throw IllegalArgumentException()
    }

    fun findMoviesByReleaseDate(year: Int):List<Movie> = movieList.filter { x -> x.hasReleaseYear(year) }

    fun findMoviesWithDurationGreaterThan(duration:Int):List<Movie> = movieList.filter { x -> x.hasDurationGreaterThan(duration) }

    fun findMoviesWithActors(actor:String):List<Movie> = movieList.filter { x -> x.hasActor(actor) }

}