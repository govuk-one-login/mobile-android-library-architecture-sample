package uk.gov.onelogin.libinit.features.proveidentity.internal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import uk.gov.onelogin.libinit.features.proveidentity.internal.card.ProveIdentityUiCard
import uk.gov.onelogin.libinit.features.proveidentity.internal.modal.ProveIdentityModal
import uk.gov.onelogin.libinit.features.proveidentity.internal.modal.rememberProveIdentityModalState
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentityNavGraphProvider

@Composable
internal fun ProveIdentityRoot(
    viewModel: ProveIdentityViewModel,
    navGraphProviders: Set<ProveIdentityNavGraphProvider>,
    modifier: Modifier = Modifier,
) {
    val isActiveSession by viewModel
        .isActiveSession()
        .collectAsState()

    val proveIdentityModalState = rememberProveIdentityModalState(
        initiallyAllowedToShow = isActiveSession
    )

    if (isActiveSession) {
        ProveIdentityUiCard(
            onStartClick = proveIdentityModalState::allowToShow,
            modifier = modifier,
        )
    }

    ProveIdentityModal(
        navGraphProviders = navGraphProviders,
        state = proveIdentityModalState,
    )
}