package uk.gov.onelogin.libinit.features.proveidentity.internalapi

import kotlinx.serialization.Serializable
import uk.gov.onelogin.libinit.libraries.navigation.NavigationDestination

sealed interface ProveIdentity : NavigationDestination {
    @Serializable
    data object ContinueToProveIdentity : ProveIdentity
    @Serializable
    data object SelectPhotoId : ProveIdentity
}