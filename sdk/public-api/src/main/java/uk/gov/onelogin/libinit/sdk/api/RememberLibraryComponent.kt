package uk.gov.onelogin.libinit.sdk.api

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import uk.gov.onelogin.libinit.libraries.compose.findActivity
import uk.gov.onelogin.libinit.libraries.network.AuthenticatedHttpClient
import uk.gov.onelogin.libinit.sdk.sharedapi.LibrarySingleton
import uk.gov.onelogin.libinit.sdk.sharedapi.LibraryComponent
import uk.gov.onelogin.libinit.sdk.internal.createLibraryComponent

@Composable
fun rememberLibraryComponent(
    librarySingleton: LibrarySingleton,
    authenticatedHttpClient: AuthenticatedHttpClient
): LibraryComponent {
    val activity = findActivity()
    return remember {
        createLibraryComponent(
            librarySingleton = librarySingleton,
            authenticatedHttpClient = authenticatedHttpClient,
            activity = activity
        )
    }
}