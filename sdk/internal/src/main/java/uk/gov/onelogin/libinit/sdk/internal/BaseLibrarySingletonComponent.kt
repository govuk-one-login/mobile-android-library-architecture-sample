package uk.gov.onelogin.libinit.sdk.internal

import com.squareup.anvil.annotations.MergeComponent
import uk.gov.onelogin.libinit.libraries.di.LibrarySingletonScope
import javax.inject.Singleton

@Singleton
@MergeComponent(LibrarySingletonScope::class)
interface BaseLibrarySingletonComponent {

    @MergeComponent.Factory
    interface Factory {
        fun create(): BaseLibrarySingletonComponent
    }

    fun inject(librarySingletonImpl: LibrarySingletonImpl)
}