package uk.gov.onelogin.libinit.features.proveidentity.internal

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import uk.gov.onelogin.libinit.libraries.activesession.GetActiveSessionUseCase

internal class ProveIdentityViewModel(
    private val getActiveSessionUseCase: GetActiveSessionUseCase,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
    fun isActiveSession() = getActiveSessionUseCase.execute()
}
