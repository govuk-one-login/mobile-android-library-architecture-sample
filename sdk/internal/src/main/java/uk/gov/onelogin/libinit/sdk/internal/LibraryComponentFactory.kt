package uk.gov.onelogin.libinit.sdk.internal

import androidx.activity.ComponentActivity
import timber.log.Timber
import uk.gov.onelogin.libinit.features.cleardata.api.ClearDataComponent
import uk.gov.onelogin.libinit.libraries.activesession.ActiveSessionComponent
import uk.gov.onelogin.libinit.libraries.network.AuthenticatedHttpClient
import uk.gov.onelogin.libinit.sdk.sharedapi.LibraryComponent
import uk.gov.onelogin.libinit.sdk.sharedapi.LibrarySingleton

fun createLibraryComponent(
    librarySingleton: LibrarySingleton,
    authenticatedHttpClient: AuthenticatedHttpClient,
    activity: ComponentActivity,
): LibraryComponent {
    Timber.d("Creating library component")
    val component = librarySingleton.component
    return DaggerMergedBaseLibraryComponent.factory().create(
        clearDataComponent = component as ClearDataComponent,
        activeSessionComponent = component as ActiveSessionComponent,
        activity = activity,
        authenticatedHttpClient = authenticatedHttpClient
    )
}
