package br.senai.sp.jandira.mytrip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.mytrip.telas.HomePage
import br.senai.sp.jandira.mytrip.telas.Login
import br.senai.sp.jandira.mytrip.telas.SignUp
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
                    val controleDeNavegacao = rememberNavController()

                    NavHost(navController = controleDeNavegacao, startDestination = "login"){
                        composable("login"){ Login(controleDeNavegacao) }
                        composable("cadastro"){ SignUp(controleDeNavegacao)}
                        composable("home"){ HomePage(controleDeNavegacao)}
                    }
                }
            }
        }
    }
}