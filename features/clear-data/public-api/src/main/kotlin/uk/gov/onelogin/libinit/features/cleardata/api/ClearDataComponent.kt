package uk.gov.onelogin.libinit.features.cleardata.api

import com.squareup.anvil.annotations.ContributesTo
import uk.gov.onelogin.libinit.libraries.di.LibrarySingletonScope
import javax.inject.Singleton

@Singleton
@ContributesTo(LibrarySingletonScope::class)
interface ClearDataComponent {
    fun clearDataUseCase(): ClearDataUseCase
}
