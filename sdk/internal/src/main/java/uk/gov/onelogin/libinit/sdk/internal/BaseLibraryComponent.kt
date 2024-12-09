package uk.gov.onelogin.libinit.sdk.internal

import androidx.activity.ComponentActivity
import com.squareup.anvil.annotations.MergeComponent
import dagger.BindsInstance
import uk.gov.onelogin.libinit.features.cleardata.api.ClearDataComponent
import uk.gov.onelogin.libinit.libraries.activesession.ActiveSessionComponent
import uk.gov.onelogin.libinit.libraries.di.ActivityScope
import uk.gov.onelogin.libinit.libraries.di.LibraryScope
import uk.gov.onelogin.libinit.libraries.network.AuthenticatedHttpClient

@ActivityScope
@MergeComponent(LibraryScope::class, dependencies = [
    ClearDataComponent::class,
    ActiveSessionComponent::class,
])
interface BaseLibraryComponent {

    @MergeComponent.Factory
    interface Factory {
        fun create(
            clearDataComponent: ClearDataComponent,
            activeSessionComponent: ActiveSessionComponent,
            @BindsInstance activity: ComponentActivity,
            @BindsInstance authenticatedHttpClient: AuthenticatedHttpClient,
        ): BaseLibraryComponent
    }
}
