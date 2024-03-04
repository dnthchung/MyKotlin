package com.doanchung.unitconverter

import android.content.res.Resources.Theme
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.doanchung.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                UnitConverter()
                }
            }
        }
    }
}

//tao ham co kha nang ket hop
@Composable
fun UnitConverter(){
    Column {
        //here all the ui ele will be stacked bellow
        Text(text = "Unit Converter : ")
        TextField(value = "", onValueChange = {
            /**
             * here goes what should happen, when the value of OutlineTextFiled changes
             */
        })
        Row {
            val context = LocalContext.current
            Button(onClick = {
                Toast.makeText(context,
                    "clicked",
                    Toast.LENGTH_LONG).show()
            }) {
                Text(text = "Click Me")
            }
        }
        Text(text = "Result : ")
    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview(){
    UnitConverter()
}

