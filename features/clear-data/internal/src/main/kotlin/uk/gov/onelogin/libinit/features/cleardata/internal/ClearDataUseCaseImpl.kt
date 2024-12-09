package uk.gov.onelogin.libinit.features.cleardata.internal

import com.squareup.anvil.annotations.ContributesBinding
import uk.gov.onelogin.libinit.features.cleardata.api.ClearDataUseCase
import uk.gov.onelogin.libinit.libraries.activesession.ActiveSessionStore
import uk.gov.onelogin.libinit.libraries.di.LibrarySingletonScope
import javax.inject.Inject

@ContributesBinding(LibrarySingletonScope::class)
class ClearDataUseCaseImpl @Inject constructor(
    private val activeSessionStore: ActiveSessionStore
): ClearDataUseCase {
    override fun clearData() {
        activeSessionStore.write(false)
    }
}