package uk.gov.onelogin.libinit.features.developersettings.internal

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import uk.gov.onelogin.libinit.libraries.activesession.CreateActiveSessionUseCase
import uk.gov.onelogin.libinit.libraries.activesession.ExpireActiveSessionUseCase
import uk.gov.onelogin.libinit.libraries.activesession.GetActiveSessionUseCase

class DeveloperSettingsViewModel(
    private val getActiveSessionUseCase: GetActiveSessionUseCase,
    private val createActiveSessionUseCase: CreateActiveSessionUseCase,
    private val expireActiveSession: ExpireActiveSessionUseCase,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
    fun isActiveSession(): Flow<Boolean> = getActiveSessionUseCase.execute()

    fun onExpireSessionClick() = viewModelScope.launch {
        expireActiveSession.execute()
    }

    fun onCreateSessionClick() = viewModelScope.launch {
        createActiveSessionUseCase.execute()
    }
}

