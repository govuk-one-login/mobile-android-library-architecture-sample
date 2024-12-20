package uk.gov.onelogin.libinit.features.activesession.internalapi

import com.squareup.anvil.annotations.ContributesTo
import uk.gov.onelogin.libinit.libraries.di.LibrarySingletonScope
import javax.inject.Singleton

@Singleton
@ContributesTo(LibrarySingletonScope::class)
interface ActiveSessionComponent {
    fun activeSessionStore(): ActiveSessionStore
}
