package com.example.ejertarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejertarjetapresentacion.ui.theme.EjerTarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjerTarjetaPresentacionTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.adrianafoto),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .background(Color(0xFF073042))
            )
            Text(
                text = stringResource(R.string.nombre),
                fontSize = 28.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = stringResource(R.string.titulo),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF006D3B)
            )
        }
        Column(modifier = Modifier.padding(bottom = 48.dp)) {
            FilaContacto("📞", stringResource(R.string.telefono))
            FilaContacto("🔗", stringResource(R.string.usuario))
            FilaContacto("✉️", stringResource(R.string.correo))
        }
    }
}

@Composable

fun FilaContacto(icono: String, texto: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = icono, fontSize = 20.sp)
        Text(text = texto, modifier = Modifier.padding(start = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPreview() {
    EjerTarjetaPresentacionTheme() {
        TarjetaPresentacion()
    }
}