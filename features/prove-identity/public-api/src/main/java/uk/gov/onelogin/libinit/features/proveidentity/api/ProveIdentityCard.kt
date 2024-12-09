package uk.gov.onelogin.libinit.features.proveidentity.api

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentityEntryPointsComponent
import uk.gov.onelogin.libinit.sdk.sharedapi.LibraryComponent

/**
 * A card that allows a user to start proving their identity.
 *
 * If a user has already proved their identity, this card will not display.
 *
 * @param component The state of the library.
 * @param modifier See [Modifier].
 */
@Composable
fun ProveIdentityCard(
    component: LibraryComponent,
    modifier: Modifier = Modifier,
) {
    (component as ProveIdentityEntryPointsComponent).proveIdentityEntryPoints().ProveIdentityCard(
        modifier = modifier
    )
}