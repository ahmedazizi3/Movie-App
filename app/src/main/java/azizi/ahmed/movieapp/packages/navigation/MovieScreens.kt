package azizi.ahmed.movieapp.packages.navigation

enum class MovieScreens {
    HomeScreen,
    DetailScreen;
    companion object {
        fun fromRout(
            route: String?
        ): MovieScreens = when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailScreen.name -> DetailScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized.")
        }
    }
}