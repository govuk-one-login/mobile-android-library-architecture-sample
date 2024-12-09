package uk.gov.onelogin.libinit.features.developersettings.api

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uk.gov.onelogin.libinit.features.developersettings.internalapi.DeveloperSettingsEntryPointsComponent
import uk.gov.onelogin.libinit.sdk.sharedapi.LibraryComponent

/**
 * A card that allows a user to access developer settings for the library.
 *
 * @param component The state of the library.
 * @param modifier See [Modifier].
 */
@Composable
fun DeveloperSettingsCard(
    component: LibraryComponent,
    modifier: Modifier = Modifier,
    debugCounter: Int,
    onClickDebugCounter: () -> Unit,
) {
    (component as DeveloperSettingsEntryPointsComponent).developerSettingsEntryPoints().DeveloperSettingsCardEntryPoint(
        modifier = modifier,
        debugCounter = debugCounter,
        onClickDebugCounter = onClickDebugCounter,
    )
}