package uk.gov.onelogin.libinit.features.selectphotoid.internal

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.squareup.anvil.annotations.ContributesMultibinding
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentity
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentityNavGraphProvider
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Inject
import javax.inject.Named

@ContributesMultibinding(LibraryScope::class)
class SelectPhotoIdNavGraphProvider @Inject constructor(
    @Named(SelectPhotoIdViewModelModule.FACTORY_NAME)
    private val viewModelFactory: ViewModelProvider.Factory
) : ProveIdentityNavGraphProvider {
    override fun NavGraphBuilder.contributeToGraph(
        navController: NavController
    ) {
        composable<ProveIdentity.SelectPhotoId> {
            SelectPhotoIdScreen(
                viewModel = viewModel(factory = viewModelFactory)
            )
        }
    }
}