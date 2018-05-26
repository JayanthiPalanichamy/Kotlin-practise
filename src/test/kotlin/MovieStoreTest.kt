import io.kotlintest.specs.StringSpec

class MovieStoreTest: StringSpec() {
    init {
        "Initializing the test case " {
            val generes :List<String> = listOf("Mystery","Thriller")
            val actors :List<String> = listOf("Ryan","Ravi")
            val actress :List<String> = listOf("Jennifer","Yuki")

            val deadpool : Movie = Movie("122435","Dead Pool",2018,generes,"Ryan",actors,actress,180 )
            val Avengers : Movie = Movie("122436","Avengers",2018,generes,"James",actors,actress,180 )
            val Strange : Movie = Movie("122437","Dr Strange",2018,generes,"james",actors,actress,180 )
            val insideOut : Movie = Movie("122438","Inside out",2012,generes,"Filix",actors,actress,120 )
            val rio : Movie = Movie("122439","Rio",2013,generes,"Filix",actors,actress,1200 )
            val movieList:List<Movie> = listOf(deadpool, Avengers, Strange,insideOut,rio)
            val movieStore :MovieStore = MovieStore(movieList)
        }
    }

}