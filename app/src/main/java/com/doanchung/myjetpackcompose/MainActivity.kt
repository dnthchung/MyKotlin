package com.doanchung.myjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doanchung.myjetpackcompose.ui.theme.MyJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    //composable function
                    Main()
                }
            }
        }
    }
}

/**
 * Jetpack Compose không có margin
 * padding -> khoảng cách giữa các component
 *  + padding ngay sau modifier -> outer padding = margin
 *  + padding sau các thuộc tính khác -> inner padding = padding
 *
 */
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Main(){
    //row and column -> định dạng các vị trí các component là các compo nằm chiều ngang hoặc dọc
    Column(
        //set background color : modifier được sử dụng để thay đổi các thuộc tính của component
        modifier= Modifier
            .background(color = Color(0xFF87AC87))
            .fillMaxWidth(1f)
            .fillMaxHeight()
    ) {
        Text(
            text = "Hello \n anh chi em!",
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFF44336),
            modifier = Modifier
                .padding(top = 40.dp, bottom = 10.dp, start = 40.dp, end = 40.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .background(color = Color(0xFF9C27B0))
                .padding(20.dp),
            textAlign = TextAlign.Center

        )
        Text(text = "Hello, world!")


        //TextField : value -> giá trị mặc định, onValueChange -> sự kiện thay đổi giá trị
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .background(color = Color(0xFF9C27B0)),
            placeholder = {
                //must custom text style
                Text(text = "Enter your name")
            },

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)

        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            //label = placeholder
            label = {
                Text(text = "Enter your name")
            },
        )

    }

}
