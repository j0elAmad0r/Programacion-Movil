package com.joel.diseomovil
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.diseomovil.ui.theme.DiseñoMovilTheme
import com.joel.diseomovil.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiseñoMovilTheme {
                PantallaLogin()
            }
        }
    }
}

@Composable
fun PantallaLogin() {

    Box( // Fondo morado
        modifier = Modifier
            .fillMaxSize()
            .background(Purple40),
        contentAlignment = Alignment.Center
    ) {

        Box( // Apartado blanco para segundo fondo
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .fillMaxHeight(0.95f)
                .background(Color.White, RoundedCornerShape(40.dp))
        ) {
            ContenidoLogin()
        }
    }
}

@Composable
fun ContenidoLogin() {
    Column( // Coloca los elementos uno debajo del otro
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.creatividad),
            contentDescription = null,
            modifier = Modifier.height(200.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Hello",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Bienvenido a nuestra app",
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(30.dp))
        btnInicio("Login")

        Spacer(modifier = Modifier.height(15.dp))
        btnInicio("Sign Up")

        Spacer(modifier = Modifier.weight(1f)) // Empuja el contenido hacia abajo
        Text(
            text = "Nuestras redes",
            fontSize = 12.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(8.dp))
        Image(painter = painterResource(id = R.drawable.redes),
            contentDescription = null,
            modifier = Modifier.height(55.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@Composable
fun btnInicio(texto: String) {
    Box( // Boton usado para login e inicio de sesion
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .background(
                color = Color(128, 0, 128), shape = RoundedCornerShape(33.dp)
            ), contentAlignment = Alignment.Center
    )
    {
        Text(
            text = texto,
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
