package uk.gov.onelogin.libinit.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import uk.gov.onelogin.libinit.app.ui.MainContent
import uk.gov.onelogin.libinit.features.developersettings.api.DeveloperSettingsCard
import uk.gov.onelogin.libinit.features.proveidentity.api.ProveIdentityCard
import uk.gov.onelogin.libinit.sdk.api.Library
import uk.gov.onelogin.libinit.sdk.api.rememberLibraryComponent

class MainActivity : ComponentActivity() {
    private val librarySingleton = Library.createInstance().apply {
        clearData()
    }
    private val authenticatedHttpClient = CustomAuthenticatedHttpClient(
        initialSession = true
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val libraryComponent = rememberLibraryComponent(
                librarySingleton = librarySingleton,
                authenticatedHttpClient = authenticatedHttpClient,
            )
            MainContent {
                var debugCounter by rememberSaveable { mutableIntStateOf(0) }

                DeveloperSettingsCard(
                    modifier = Modifier.fillMaxWidth(),
                    component = libraryComponent,
                    debugCounter = debugCounter,
                    onClickDebugCounter = { debugCounter += 1 }
                )

                ProveIdentityCard(
                    component = libraryComponent,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    }
}
