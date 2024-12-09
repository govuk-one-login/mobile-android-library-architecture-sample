package uk.gov.onelogin.libinit.features.proveidentity.internal

import androidx.lifecycle.ViewModelProvider
import com.squareup.anvil.annotations.ContributesTo
import uk.gov.onelogin.libinit.libraries.di.ActivityScope
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentityNavGraphProvider
import javax.inject.Named

@ActivityScope
@ContributesTo(LibraryScope::class)
interface ProveIdentityComponent {
    @Named(ProveIdentityViewModelModule.FACTORY_NAME)
    fun proveIdentityViewModelFactory(): ViewModelProvider.Factory

    fun proveIdentityNavGraphProviders(): Set<ProveIdentityNavGraphProvider>
}
