package uk.gov.onelogin.libinit.features.developersettings.internal

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import uk.gov.onelogin.libinit.features.activesession.internalapi.CreateActiveSessionUseCase
import uk.gov.onelogin.libinit.features.activesession.internalapi.ExpireActiveSessionUseCase
import uk.gov.onelogin.libinit.features.activesession.internalapi.GetActiveSessionUseCase
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Named

@Module
@ContributesTo(LibraryScope::class)
object DeveloperSettingsViewModelModule {
    const val FACTORY_NAME = "DeveloperSettingsViewModelFactory"

    @Provides
    @Named(FACTORY_NAME)
    fun provideFactory(
        toggleActiveSession: ExpireActiveSessionUseCase,
        getActiveSessionUseCase: GetActiveSessionUseCase,
        createActiveSessionUseCase: CreateActiveSessionUseCase,
    ): ViewModelProvider.Factory = viewModelFactory {
        initializer {
            DeveloperSettingsViewModel(
                expireActiveSession = toggleActiveSession,
                getActiveSessionUseCase = getActiveSessionUseCase,
                createActiveSessionUseCase = createActiveSessionUseCase,
                savedStateHandle = createSavedStateHandle()
            )
        }
    }
}
