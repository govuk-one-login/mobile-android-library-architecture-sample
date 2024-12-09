package uk.gov.onelogin.libinit.features.selectphotoid.internal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun SelectPhotoIdScreen(
    viewModel: SelectPhotoIdViewModel
) {
    Column {
        Text(
            modifier = Modifier.padding(16.dp),
            text = stringResource(R.string.select_photo_id_title),
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            modifier = Modifier.padding(16.dp),
            text = stringResource(R.string.select_photo_id_body),
        )
        Button(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            onClick = { },
        ) {
            Text(
                text = stringResource(R.string.select_photo_id_button),
            )
        }
    }
}