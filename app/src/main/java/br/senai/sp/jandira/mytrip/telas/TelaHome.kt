package br.senai.sp.jandira.mytrip.telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrip.R
import br.senai.sp.jandira.mytrip.repository.CategoriaRepository
import br.senai.sp.jandira.mytrip.repository.ViagemRepository
import br.senai.sp.jandira.mytrip.ui.theme.MyTripTheme
import br.senai.sp.jandira.mytrip.ui.theme.reduzirData

@Composable
fun HomePage(controleDeNavegacao: NavHostController) {
    var buscarState = remember {
        mutableStateOf("")
    }
    val categoria = CategoriaRepository().listarTodasAsCategorias()
    val viagens = ViagemRepository().listarTodasAsViagens()
    MyTripTheme {
        Surface (
            modifier = Modifier.fillMaxSize()
        ) {
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
                    items(categoria){
                        Card(
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
                               Image(painter = it.image!!, contentDescription = "", modifier = Modifier.size(width = 30.dp, height = 40.dp))
                                Text(text = it.nome, color = Color.White)
                            }
                        }
                    }
                }
                OutlinedTextField(value = buscarState.value,
                    onValueChange = {
                        buscarState.value = it
                    },
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
                    items(viagens){
                        Card (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(13.dp), colors = CardDefaults.cardColors(Color.White),
                            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 16.dp)
                        ) {
                            Column (
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Card (
                                    modifier = Modifier.fillMaxWidth(),
                                    colors = CardDefaults.cardColors(Color.White)
                                ) {
                                    Image(painter = if(it.image == null) painterResource(id = R.drawable.default_image) else it.image!!, contentDescription = "London", modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(6.dp), contentScale = ContentScale.Crop)
                                }
                                Text(text = "${it.destino}, ${it.dataChegada.year}", fontSize = 16.sp, color = Color(0xFFCF06F0))
                                Text(text = it.descricao, fontSize = 11.sp, color = Color.LightGray, lineHeight = 12.sp)
                                Column (
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(8.dp),
                                    horizontalAlignment = Alignment.End
                                ) {
                                    Text(text = "${reduzirData(it.dataChegada)} - ${reduzirData(it.dataPartida)}", fontSize = 11.sp, color = Color(0xFFCF06F0))
                                }
                            }
                        }
                    }
                }
                Row {
                    FloatingActionButton(onClick = { /*TODO*/ }) {

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
        //HomePage()
    }
}