package uk.gov.onelogin.libinit.libraries.activesession

import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetActiveSessionUseCase @Inject constructor(
    private val activeSessionApi: ActiveSessionApi,
    private val activeSessionStore: ActiveSessionStore,
) {
    fun execute(): StateFlow<Boolean> {
        val isActiveSession = activeSessionApi.getActiveSession()
        activeSessionStore.write(isActiveSession)

        return activeSessionStore.read()
    }
}

