package uk.gov.onelogin.libinit.features.proveidentity.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.squareup.anvil.annotations.ContributesBinding
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentityEntryPoints
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentityNavGraphProvider
import uk.gov.onelogin.libinit.libraries.di.ActivityScope
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Inject
import javax.inject.Named

@ActivityScope
@ContributesBinding(LibraryScope::class)
class ProveIdentityEntryPointsImpl @Inject constructor(
    @Named(ProveIdentityViewModelModule.FACTORY_NAME)
    private val viewModelProviderFactory: ViewModelProvider.Factory,
    private val navGraphProviders: Set<@JvmSuppressWildcards ProveIdentityNavGraphProvider>
) : ProveIdentityEntryPoints {
    @Composable
    override fun ProveIdentityCard(
        modifier: Modifier
    ) {
        ProveIdentityRoot(
            viewModel = viewModel(factory = viewModelProviderFactory),
            navGraphProviders = navGraphProviders,
            modifier = modifier,
        )
    }
}