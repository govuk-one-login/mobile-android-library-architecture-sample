package uk.gov.onelogin.libinit.features.proveidentity.internalapi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.squareup.anvil.annotations.ContributesTo
import uk.gov.onelogin.libinit.libraries.di.ActivityScope
import uk.gov.onelogin.libinit.libraries.di.LibraryScope

interface ProveIdentityEntryPoints {
    @Composable
    fun ProveIdentityCard(modifier: Modifier)
}

@ActivityScope
@ContributesTo(LibraryScope::class)
interface ProveIdentityEntryPointsComponent {
    fun proveIdentityEntryPoints(): ProveIdentityEntryPoints
}
