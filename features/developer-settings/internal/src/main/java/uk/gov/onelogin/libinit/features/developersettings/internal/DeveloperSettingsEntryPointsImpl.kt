package uk.gov.onelogin.libinit.features.developersettings.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.squareup.anvil.annotations.ContributesBinding
import uk.gov.onelogin.libinit.features.developersettings.internalapi.DeveloperSettingsEntryPoints
import uk.gov.onelogin.libinit.libraries.di.ActivityScope
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import javax.inject.Inject
import javax.inject.Named

@ActivityScope
@ContributesBinding(LibraryScope::class)
class DeveloperSettingsEntryPointsImpl @Inject constructor(
    @Named(DeveloperSettingsViewModelModule.FACTORY_NAME)
    private val viewModelProviderFactory: ViewModelProvider.Factory,
) : DeveloperSettingsEntryPoints {
    @Composable
    override fun DeveloperSettingsCardEntryPoint(
        modifier: Modifier,
        debugCounter: Int,
        onClickDebugCounter: () -> Unit
    ) {
        DeveloperSettingsCard(
            viewModel = viewModel(factory = viewModelProviderFactory),
            modifier = modifier,
            debugCounter = debugCounter,
            onClickDebugCounter = onClickDebugCounter,
        )
    }
}