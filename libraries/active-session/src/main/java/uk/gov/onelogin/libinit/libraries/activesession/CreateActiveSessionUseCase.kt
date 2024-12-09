package uk.gov.onelogin.libinit.libraries.activesession

import javax.inject.Inject

class CreateActiveSessionUseCase @Inject constructor(
    private val activeSessionApi: ActiveSessionApi,
    private val activeSessionStore: ActiveSessionStore,
) {
    fun execute() {
        activeSessionApi.createActiveSession()
        activeSessionStore.write(true)
    }
}

