package uk.gov.onelogin.libinit.features.activesession.internal

import com.squareup.anvil.annotations.ContributesBinding
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import timber.log.Timber
import uk.gov.onelogin.libinit.features.activesession.internalapi.ActiveSessionStore
import uk.gov.onelogin.libinit.libraries.di.LibrarySingletonScope
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@ContributesBinding(LibrarySingletonScope::class)
class InMemoryActiveSessionStore @Inject constructor() : ActiveSessionStore {
    private var isActiveSession: MutableStateFlow<Boolean> = MutableStateFlow(false)
    override fun read(): StateFlow<Boolean> =
        isActiveSession.asStateFlow()

    override fun write(value: Boolean) {
        Timber.d("Writing $value to active session store")
        isActiveSession.value = value
    }
}

