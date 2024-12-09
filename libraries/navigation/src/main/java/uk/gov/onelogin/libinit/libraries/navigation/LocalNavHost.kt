package uk.gov.onelogin.libinit.libraries.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun LocalNavHost(
    navGraphProviders: Set<NavGraphProvider>,
    startDestination: NavigationDestination
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        for (navGraphProvider in navGraphProviders) {
            with(navGraphProvider) {
                contributeToGraph(navController)
            }
        }
    }
}