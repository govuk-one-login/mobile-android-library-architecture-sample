package uk.gov.onelogin.libinit.features.proveidentity.internal.continuetoprove

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.squareup.anvil.annotations.ContributesMultibinding
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentity
import uk.gov.onelogin.libinit.features.proveidentity.internalapi.ProveIdentityNavGraphProvider
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Inject

@ContributesMultibinding(LibraryScope::class)
class ContinueToProveIdentityNavGraphProvider @Inject constructor() :
    ProveIdentityNavGraphProvider {
    override fun NavGraphBuilder.contributeToGraph(
        navController: NavController
    ) {
        composable<ProveIdentity.ContinueToProveIdentity> {
            ContinueToProveIdentityScreen(
                onContinueClick = { navController.navigate(ProveIdentity.SelectPhotoId) }
            )
        }
    }
}