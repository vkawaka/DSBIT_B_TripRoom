package br.senai.sp.jandira.mytrip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Forest
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
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
                    HomePage()
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

@Composable
fun HomePage(){
    Column {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(197.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.paris),
                contentDescription = "Cidade de Paris",
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 19.dp, vertical = 13.dp),
                horizontalAlignment = Alignment.End
            ){
                Card (
                    shape = CircleShape,
                    border = BorderStroke(width = 2.dp, Color(0xffffffff)),
                    modifier = Modifier.size(52.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.taehyun_app),
                        contentDescription = "Imagem do Usuário",
                    )
                }
                Text(
                    text = "Kang Taehyun",
                    color = Color(0xffffffff),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(19.dp),
                verticalArrangement = Arrangement.Bottom
            ){
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Icon de localização", tint = Color.White, modifier = Modifier.size(16.dp))
                    Text(text = "You're in Paris",
                        fontSize = 14.sp,
                        color = Color.White
                    )
                }
                Text(text = "My Trips",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
            }
        }
        Text(text = "Categories", fontSize = 14.sp, color = Color.Gray, modifier = Modifier.padding(horizontal = 13.dp, vertical = 10.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 19.dp)
        ){
            item{ Card (
                modifier = Modifier
                    .size(width = 130.dp, height = 60.dp)
                    .padding(horizontal = 9.dp),
                colors = CardDefaults.cardColors(Color(0xFFCF06F0))
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(imageVector = Icons.Default.Landscape, contentDescription = "", tint = Color.White, modifier = Modifier.size(32.dp))
                    Text(text = "Montain", color = Color.White)
                }
            }}
            item{ Card (
                modifier = Modifier
                    .size(width = 130.dp, height = 60.dp)
                    .padding(horizontal = 9.dp),
                colors = CardDefaults.cardColors(Color(0xFFEAABF4))
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(imageVector = Icons.Default.DownhillSkiing, contentDescription = "", tint = Color.White, modifier = Modifier.size(32.dp))
                    Text(text = "Snow", color = Color.White)
                }
            }}
            item{ Card (
                modifier = Modifier
                    .size(width = 130.dp, height = 60.dp)
                    .padding(horizontal = 9.dp),
                colors = CardDefaults.cardColors(Color(0xFFEAABF4))
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(imageVector = Icons.Default.BeachAccess, contentDescription = "", tint = Color.White, modifier = Modifier.size(32.dp))
                    Text(text = "Beach", color = Color.White)
                }
            }}
        }
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 13.dp)
                .padding(vertical = 10.dp),
            shape = RoundedCornerShape(30.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            placeholder = {
                Text(text = "Search your destiny", color = Color.LightGray)
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search", tint = Color.LightGray)
            }
        )
        Text(text = "Past Trips", fontSize = 14.sp, color = Color.Gray, modifier = Modifier.padding(horizontal = 13.dp))
        LazyColumn{
            item{
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(13.dp), colors = CardDefaults.cardColors(Color.White)
                ) {
                    Column (
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Card (
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(Color.White)
                        ) {
                            Image(painter = painterResource(id = R.drawable.london), contentDescription = "London", modifier = Modifier
                                .fillMaxWidth()
                                .padding(6.dp), contentScale = ContentScale.Crop)
                        }
                        Text(text = "London, 2019", fontSize = 16.sp, color = Color(0xFFCF06F0))
                        Text(text = "London is the capital and the largest city of the United Kingdom, with a population of just under 9 million", fontSize = 11.sp, color = Color.LightGray, lineHeight = 12.sp)
                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            horizontalAlignment = Alignment.End
                        ) {
                            Text(text = "18 Feb - 21 Feb", fontSize = 11.sp, color = Color(0xFFCF06F0))
                        }
                    }
                }
            }
            item{
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(13.dp), colors = CardDefaults.cardColors(Color.White)
                ) {
                    Column (
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Card (
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(Color.White)
                        ) {
                            Image(painter = painterResource(id = R.drawable.london), contentDescription = "London", modifier = Modifier
                                .fillMaxWidth()
                                .padding(6.dp), contentScale = ContentScale.Crop)
                        }
                        Text(text = "London, 2019", fontSize = 16.sp, color = Color(0xFFCF06F0))
                        Text(text = "London is the capital and the largest city of the United Kingdom, with a population of just under 9 million", fontSize = 11.sp, color = Color.LightGray, lineHeight = 12.sp, modifier = Modifier.padding(vertical = 10.dp))
                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            horizontalAlignment = Alignment.End
                        ) {
                            Text(text = "18 Feb - 21 Feb", fontSize = 11.sp, color = Color(0xFFCF06F0))
                        }
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePagePreview() {
    MyTripTheme {
        HomePage()
    }
}