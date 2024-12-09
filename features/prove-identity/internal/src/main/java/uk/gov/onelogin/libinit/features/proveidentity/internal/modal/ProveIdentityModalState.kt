package uk.gov.onelogin.libinit.features.proveidentity.internal.modal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.mapSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
internal fun rememberProveIdentityModalState(
    initiallyAllowedToShow: Boolean = true,
): ProveIdentityModalState = rememberSaveable(
    initiallyAllowedToShow,
    saver = proveIdentityModalStateSaver,
) {
    ProveIdentityModalState(
        allowedToShow = initiallyAllowedToShow
    )
}

@Stable
class ProveIdentityModalState(
    allowedToShow: Boolean,
) {
    var allowedToShow by mutableStateOf(allowedToShow)
        private set

    fun allowToShow() {
        allowedToShow = true
    }

    fun onDismissRequest() {
        allowedToShow = false
    }
}

val proveIdentityModalStateSaver = mapSaver(
    save = {
        mutableMapOf(
            "allowedToShow" to it.allowedToShow,
        )
    },
    restore = { saved ->
        ProveIdentityModalState(
            allowedToShow = saved["allowedToShow"] as Boolean,
        )
    }
)