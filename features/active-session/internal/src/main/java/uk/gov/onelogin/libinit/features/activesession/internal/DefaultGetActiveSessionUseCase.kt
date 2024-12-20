package uk.gov.onelogin.libinit.features.activesession.internal

import com.squareup.anvil.annotations.ContributesBinding
import kotlinx.coroutines.flow.StateFlow
import uk.gov.onelogin.libinit.features.activesession.internalapi.ActiveSessionApi
import uk.gov.onelogin.libinit.features.activesession.internalapi.ActiveSessionStore
import uk.gov.onelogin.libinit.features.activesession.internalapi.GetActiveSessionUseCase
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Inject

@ContributesBinding(LibraryScope::class)
class DefaultGetActiveSessionUseCase @Inject constructor(
    private val activeSessionApi: ActiveSessionApi,
    private val activeSessionStore: ActiveSessionStore,
) : GetActiveSessionUseCase {
    override fun execute(): StateFlow<Boolean> {
        val isActiveSession = activeSessionApi.getActiveSession()
        activeSessionStore.write(isActiveSession)

        return activeSessionStore.read()
    }
}

