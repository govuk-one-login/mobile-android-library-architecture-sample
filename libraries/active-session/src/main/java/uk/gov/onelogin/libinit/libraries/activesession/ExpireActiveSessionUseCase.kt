package uk.gov.onelogin.libinit.libraries.activesession

import javax.inject.Inject

class ExpireActiveSessionUseCase @Inject constructor(
    private val activeSessionApi: ActiveSessionApi,
    private val activeSessionStore: ActiveSessionStore,
) {
    fun execute() {
        activeSessionApi.expireActiveSession()
        activeSessionStore.write(false)
    }
}

