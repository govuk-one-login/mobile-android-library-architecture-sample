package uk.gov.onelogin.libinit.libraries.navigation

import androidx.compose.runtime.staticCompositionLocalOf

val LocalNavGraphProviders = staticCompositionLocalOf<Set<NavGraphProvider>> {
    error("no nav graph providers provided")
}
