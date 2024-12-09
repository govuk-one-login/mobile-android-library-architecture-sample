package uk.gov.onelogin.libinit.libraries.compose

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.lifecycle.ViewModelProvider

val LocalViewModelFactories = staticCompositionLocalOf<ViewModelProvider.Factory> {
    error("no view model providers provided")
}
