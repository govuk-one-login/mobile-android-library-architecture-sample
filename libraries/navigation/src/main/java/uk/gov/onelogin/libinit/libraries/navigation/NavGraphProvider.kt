package uk.gov.onelogin.libinit.libraries.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

interface NavGraphProvider {
    fun NavGraphBuilder.contributeToGraph(
        navController: NavController
    )
}