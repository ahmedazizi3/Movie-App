package azizi.ahmed.movieapp.packages.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import azizi.ahmed.movieapp.packages.screens.DetailsScreen
import azizi.ahmed.movieapp.packages.screens.HomeScreen

@Composable
fun Navigation(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name
    ) {
        composable(MovieScreens.HomeScreen.name) {
            HomeScreen(
                navigateToDetailScreen = { movie ->
                    navController.navigate(route = MovieScreens.DetailScreen.name+"/$movie")
                }
            )
        }
        composable(
            route = "DetailScreen/{movieData}",
            arguments = listOf(
                navArgument("movieData") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            DetailsScreen(
                movieID = backStackEntry.arguments?.getString("movieData")
            ) {
                navController.popBackStack()
            }
        }
    }
}



