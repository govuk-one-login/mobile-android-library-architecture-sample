package uk.gov.onelogin.libinit.features.proveidentity.internal.continuetoprove

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.gov.onelogin.libinit.features.proveidentity.internal.R

@Composable
internal fun ContinueToProveIdentityScreen(
    onContinueClick: () -> Unit,
) {
    Column {
        Text(
            modifier = Modifier.padding(16.dp),
            text = stringResource(R.string.prove_identity_modal_title),
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            modifier = Modifier.padding(16.dp),
            text = stringResource(R.string.prove_identity_modal_body),
        )
        Button(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            onClick = onContinueClick,
        ) {
            Text(
                text = stringResource(R.string.prove_identity_modal_button),
            )
        }
    }
}

@Preview
@Composable
private fun ContinueToProveIdentityScreenPreview() {
    ContinueToProveIdentityScreen(onContinueClick = {})
}
