package uk.gov.onelogin.libinit.features.proveidentity.internal.modal

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentity
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentityNavGraphProvider
import uk.gov.onelogin.libinit.libraries.compose.FullScreenDialog
import uk.gov.onelogin.libinit.libraries.navigation.LocalNavHost


/**
 * A modal dialog that allows a user to prove their identity.
 *
 * If it is allowed to, this dialog will display automatically.
 *
 * @param modifier See [Modifier].
 * @param state The modal UI state.
 */
@Composable
internal fun ProveIdentityModal(
    navGraphProviders: Set<ProveIdentityNavGraphProvider>,
    modifier: Modifier = Modifier,
    state: ProveIdentityModalState = rememberProveIdentityModalState(),
) {
    if (!state.allowedToShow) {
        return
    }

    FullScreenDialog(
        modifier = modifier,
        onDismissRequest = state::onDismissRequest,
    ) {
        LocalNavHost(
            startDestination = ProveIdentity.ContinueToProveIdentity,
            navGraphProviders = navGraphProviders,
        )
    }
}

