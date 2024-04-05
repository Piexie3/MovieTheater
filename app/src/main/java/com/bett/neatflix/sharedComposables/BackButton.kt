package com.bett.neatflix.sharedComposables

import androidx.compose.foundation.layout.size
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bett.neatflix.ui.theme.AppOnPrimaryColor
import com.bett.neatflix.ui.theme.ButtonColor

@Composable
fun BackButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    FloatingActionButton(
        modifier = modifier.size(42.dp),
        backgroundColor = ButtonColor,
        contentColor = AppOnPrimaryColor,
        onClick = { onClick() }) {
        Icon(
            imageVector = Icons.Rounded.ArrowBack,
            contentDescription = "back icon",
        )
    }
}
