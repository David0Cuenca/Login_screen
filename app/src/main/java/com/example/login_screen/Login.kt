package com.example.login_screen

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login_screen.ui.theme.Login_ScreenTheme
@Composable
fun LoginScreen() {
    Box(Modifier
        .fillMaxSize()
        .padding(9.dp)){

        Header(Modifier.align(Alignment.TopStart))

        Body(Modifier.align(Alignment.Center))

    /*  Footer(Modifier.align(Alignment.BottomCenter))*/
    }
}

@Composable
fun Header(modifier: Modifier){
    val activity = LocalContext.current as? Activity
    Icon(imageVector = ImageVector.vectorResource(R.drawable.close),
        contentDescription = "Close App",
        modifier = Modifier.clickable { activity?.finish() })
}

@Composable
fun Body(modifier: Modifier) {
    Column(modifier = modifier) {
    ImageLogo(Modifier.align(Alignment.CenterHorizontally))
        Email()
            /*Password()
        ForgotPassword()
        Logindivisor()
        LoginInicial()*/
    }
}

@Composable
fun Email() {
    var email by rememberSaveable { mutableStateOf("") }
    TextField(
        value = email,
        onValueChange = { email = it },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun Footer(modifier: Modifier){
    Row (modifier = Modifier.fillMaxWidth()){
        Text(text = "Don't you have an account?")
    }
}

@Composable
fun ImageLogo(modifier : Modifier) {
    Image(
        painter = painterResource(id = R.drawable.insta),
        contentDescription = "Logo Image")
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Login_ScreenTheme {
        LoginScreen()
    }
}