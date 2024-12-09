package uk.gov.onelogin.libinit.features.developersettings.internalapi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.squareup.anvil.annotations.ContributesTo
import uk.gov.onelogin.libinit.libraries.di.ActivityScope
import uk.gov.onelogin.libinit.libraries.di.LibraryScope

interface DeveloperSettingsEntryPoints {
    @Composable
    fun DeveloperSettingsCardEntryPoint(
        modifier: Modifier,
        debugCounter: Int,
        onClickDebugCounter: () -> Unit
    )
}

@ActivityScope
@ContributesTo(LibraryScope::class)
interface DeveloperSettingsEntryPointsComponent {
    fun developerSettingsEntryPoints(): DeveloperSettingsEntryPoints
}
