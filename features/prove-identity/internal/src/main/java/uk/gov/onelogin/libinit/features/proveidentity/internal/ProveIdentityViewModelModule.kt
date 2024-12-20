package uk.gov.onelogin.libinit.features.proveidentity.internal

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import uk.gov.onelogin.libinit.features.activesession.internalapi.GetActiveSessionUseCase
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Named

@Module
@ContributesTo(LibraryScope::class)
object ProveIdentityViewModelModule {
    const val FACTORY_NAME = "ProveIdentityViewModelFactory"

    @Provides
    @Named(FACTORY_NAME)
    fun provideFactory(
        getActiveSessionUseCase: GetActiveSessionUseCase,
    ): ViewModelProvider.Factory = viewModelFactory {
        initializer {
            ProveIdentityViewModel(
                getActiveSessionUseCase = getActiveSessionUseCase,
                savedStateHandle = createSavedStateHandle(),
            )
        }
    }
}
