package uk.gov.onelogin.libinit.features.activesession.internal

import com.squareup.anvil.annotations.ContributesBinding
import uk.gov.onelogin.libinit.features.activesession.internalapi.ActiveSessionApi
import uk.gov.onelogin.libinit.features.activesession.internalapi.ActiveSessionStore
import uk.gov.onelogin.libinit.features.activesession.internalapi.ExpireActiveSessionUseCase
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Inject

@ContributesBinding(LibraryScope::class)
class DefaultExpireActiveSessionUseCase @Inject constructor(
    private val activeSessionApi: ActiveSessionApi,
    private val activeSessionStore: ActiveSessionStore,
) : ExpireActiveSessionUseCase {
    override fun execute() {
        activeSessionApi.expireActiveSession()
        activeSessionStore.write(false)
    }
}

