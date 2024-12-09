package uk.gov.onelogin.libinit.features.developersettings.internal

import androidx.lifecycle.ViewModelProvider
import com.squareup.anvil.annotations.ContributesTo
import uk.gov.onelogin.libinit.libraries.di.ActivityScope
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Named

@ActivityScope
@ContributesTo(LibraryScope::class)
interface DeveloperSettingsComponent {
    @Named(DeveloperSettingsViewModelModule.FACTORY_NAME)
    fun viewModelProviderFactory(): ViewModelProvider.Factory
}

