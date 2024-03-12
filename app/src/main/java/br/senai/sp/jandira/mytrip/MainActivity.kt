package br.senai.sp.jandira.mytrip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrip.ui.theme.MyTripTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                    SignUp()
                }
            }
        }
    }
}

@Composable
fun Login() {
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
            OutlinedTextField(
                value = "teste@email.com",
                onValueChange = {},
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
                shape = RoundedCornerShape(20.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = "*********",
                onValueChange = {},
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
                shape = RoundedCornerShape(20.dp)
            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .padding(end = 20.dp),
            horizontalAlignment = Alignment.End

        ){
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0xFFCF06F0)),
                modifier = Modifier.size(height = 60.dp, width = 160.dp),
                shape = RoundedCornerShape(24.dp)
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
                Text(text = "Sign up", color = Color(0xFFCF06F0), fontWeight = FontWeight.Bold)
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripTheme {
        Login()
    }
}

@Composable
fun SignUp(){
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
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .height(500.dp)
                .padding(horizontal = 20.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFFCF06F0)
                )
                Text(text = "Create a new account", fontWeight = FontWeight.ExtraLight)
                Spacer(modifier = Modifier.height(20.dp))
                Box (
                    contentAlignment = Alignment.Center
                ) {
                    Image(painter = painterResource(id = R.drawable.icon),
                        contentDescription = "",
                        modifier = Modifier.size(width = 50.dp, height = 50.dp))
                    Icon(imageVector = Icons.Filled.Person, contentDescription = "", tint = Color(0xFFCF06F0))
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = "Susanna Hoffs",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Username")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFCF06F0),
                    unfocusedBorderColor = Color(0xFFCF06F0)
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "",
                        tint = Color(0xFFCF06F0)
                    )
                },
                shape = RoundedCornerShape(20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = "99999-0987",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Phone")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFCF06F0),
                    unfocusedBorderColor = Color(0xFFCF06F0)
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Phone,
                        contentDescription = "",
                        tint = Color(0xFFCF06F0)
                    )
                },
                shape = RoundedCornerShape(20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = "susanna@email.com",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "E-mail")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFCF06F0),
                    unfocusedBorderColor = Color(0xFFCF06F0)
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xFFCF06F0)
                    )
                },
                shape = RoundedCornerShape(20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = "*********",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Password")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFCF06F0),
                    unfocusedBorderColor = Color(0xFFCF06F0)
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xFFCF06F0)
                    )
                },
                shape = RoundedCornerShape(20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = false,
                    onCheckedChange = {},
                    colors = CheckboxDefaults.colors(uncheckedColor = Color(0xFFCF06F0)),
                    modifier = Modifier.scale(1.5f)
                )
                Text(text = "Over 18?")
            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.End
        ) {
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0xFFCF06F0)),
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "CREATE ACCOUNT", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Text(text = "Already have an account?")
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "Sign in", color = Color(0xFFCF06F0), fontWeight = FontWeight.Bold)
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
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview() {
    MyTripTheme {
        SignUp()
    }
}