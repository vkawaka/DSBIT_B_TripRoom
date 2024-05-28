package br.senai.sp.jandira.mytrip.telas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrip.repository.UsuarioRepository
import br.senai.sp.jandira.mytrip.ui.theme.MyTripTheme

@Composable
fun Login(controleDeNavegacao: NavHostController?) {
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    var erroState = remember {
        mutableStateOf(false)
    }

    var mensagemErroState = remember {
        mutableStateOf("")
    }
    var usuarioRepository = UsuarioRepository(LocalContext.current)

    MyTripTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column {
                Row(
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(
                            x = 20.dp,
                            y = (-10.dp)
                        )
                ) {
                    Card(
                        colors = CardDefaults.cardColors(Color(0xFFCF06F0)),
                        modifier = Modifier
                            .width(150.dp)
                            .height(60.dp)
                    ) {

                    }
                }
                Column (
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .height(500.dp)
                        .padding(horizontal = 20.dp),
                ){
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(text = "Login", fontSize = 52.sp, fontWeight = FontWeight.ExtraBold, color = Color(0xFFCF06F0))
                        Text(text = "Please sing in to continue", fontWeight = FontWeight.ExtraLight)
                    }
                    Spacer(modifier = Modifier.height(100.dp))
                    Text(text = mensagemErroState.value,
                        color = Color.Red,
                        modifier = Modifier.padding(start = 4.dp)
                    )
                    OutlinedTextField(
                        value = emailState.value,
                        onValueChange = {
                            emailState.value = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "E-mail")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFCF06F0)
                        ),
                        leadingIcon = {
                            Icon(imageVector = Icons.Filled.Email, contentDescription = "", tint = Color(0xFFCF06F0))
                        },
                        shape = RoundedCornerShape(20.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = senhaState.value,
                        onValueChange = {
                            senhaState.value = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Password")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFCF06F0)
                        ),
                        leadingIcon = {
                            Icon(imageVector = Icons.Filled.Lock, contentDescription = "", tint = Color(0xFFCF06F0))
                        },
                        shape = RoundedCornerShape(20.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text, capitalization = KeyboardCapitalization.None),
                        visualTransformation = PasswordVisualTransformation()
                    )
                }
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .padding(end = 20.dp),
                    horizontalAlignment = Alignment.End

                ){
                    Button(onClick = {
                        val email = emailState.value
                        val senha = senhaState.value
                        if (usuarioRepository.verificarCredenciais(email,senha)){
                            controleDeNavegacao!!.navigate("home")
                        }else{
                            erroState.value=true
                            mensagemErroState.value="Incorrect e-mail address or password!"
                        }
                    },
                        modifier = Modifier
                            .width(150.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC51BCA)),

                        ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Text(text = "SIGN IN", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                            Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "")
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row {
                        Text(text = "Don't have an account?")
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "Sign up", color = Color(0xFFCF06F0), fontWeight = FontWeight.Bold, modifier = Modifier.clickable { controleDeNavegacao!!.navigate("cadastro") })
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(
                            x = (-10.dp),
                            y = 10.dp
                        )
                ) {
                    Card(
                        colors = CardDefaults.cardColors(Color(0xFFCF06F0)),
                        modifier = Modifier
                            .width(150.dp)
                            .height(60.dp)
                    ) {

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripTheme {
        Login(null)
    }
}
