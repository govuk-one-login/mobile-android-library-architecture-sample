package uk.gov.onelogin.libinit.features.activesession.internal

import com.squareup.anvil.annotations.ContributesBinding
import uk.gov.onelogin.libinit.features.activesession.internalapi.ActiveSessionApi
import uk.gov.onelogin.libinit.features.activesession.internalapi.ActiveSessionStore
import uk.gov.onelogin.libinit.features.activesession.internalapi.CreateActiveSessionUseCase
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Inject

@ContributesBinding(LibraryScope::class)
class DefaultCreateActiveSessionUseCase @Inject constructor(
    private val activeSessionApi: ActiveSessionApi,
    private val activeSessionStore: ActiveSessionStore,
) : CreateActiveSessionUseCase {
    override fun execute() {
        activeSessionApi.createActiveSession()
        activeSessionStore.write(true)
    }
}

