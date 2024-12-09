package uk.gov.onelogin.libinit.features.selectphotoid.internal

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Named

@Module
@ContributesTo(LibraryScope::class)
object SelectPhotoIdViewModelModule {
    const val FACTORY_NAME = "SelectPhotoIdViewModelFactory"

    @Provides
    @Named(FACTORY_NAME)
    fun provideFactory(): ViewModelProvider.Factory = viewModelFactory {
        initializer {
            SelectPhotoIdViewModel()
        }
    }
}
