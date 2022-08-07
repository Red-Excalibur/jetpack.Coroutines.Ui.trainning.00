package com.jetpack_compose_trainning_00

import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RestrictTo
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack_compose_trainning_00.ui.theme.Jetpack_compose_trainning_00Theme
import kotlinx.coroutines.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                MyFun()
            }
        }
    }
}


@Composable
fun MyFun(

){
    val fonts = FontFamily(Font(R.font.cloister_black))
    val context = LocalContext.current

      Text(
          text ="ILYAS",
          fontSize = 70.sp,
          fontFamily = fonts,
          modifier = Modifier.clickable {
              Log.d(" here 1","hello  + ${Thread.currentThread().name}")

              Toast
                  .makeText(context,"successfully completed the Mission",Toast.LENGTH_SHORT)
                  .show()


            GlobalScope.launch(Dispatchers.Main){
                var i=0
                delay(3000)
                Log.d(" here","hello  + ${Thread.currentThread().name}")
                Toast.makeText(context,"Test for what you learned : ${i++}",Toast.LENGTH_SHORT).show()
                GlobalScope.launch(Dispatchers.Main){
                    delay(3000)
                    Log.d(" here","hello  + ${Thread.currentThread().name}")
                    Toast.makeText(context,"Test for what you learned :${i++}",Toast.LENGTH_SHORT).show()
                }
                GlobalScope.launch(Dispatchers.Main){
                    delay(3000)
                    Log.d(" here","hello  + ${Thread.currentThread().name}")
                    Toast.makeText(context,"Test for what you learned :${i++}",Toast.LENGTH_SHORT).show()
                }
                GlobalScope.launch(Dispatchers.Main){
                    delay(3000)
                    Log.d(" here","hello  + ${Thread.currentThread().name}")
                    Toast.makeText(context,"Test for what you learned :${i++}",Toast.LENGTH_SHORT).show()
                }
                GlobalScope.launch(Dispatchers.Main){
                    delay(3000)
                    Log.d(" here","hello  + ${Thread.currentThread().name}")
                    Toast.makeText(context,"Test for what you learned :${i++}",Toast.LENGTH_SHORT).show()
                }
                GlobalScope.launch(Dispatchers.Main){
                    delay(3000)
                    Log.d(" here","hello  + ${Thread.currentThread().name}")
                    Toast.makeText(context,"Test for what you learned :${i++}",Toast.LENGTH_SHORT).show()
                }
                GlobalScope.launch(Dispatchers.Main){
                    delay(3000)
                    Log.d(" here","hello  + ${Thread.currentThread().name}")
                    Toast.makeText(context,"Test for what you learned :${i++}",Toast.LENGTH_SHORT).show()
                }
                GlobalScope.launch(Dispatchers.Main){
                    delay(3000)
                    Log.d(" here","hello  + ${Thread.currentThread().name}")
                    Toast.makeText(context,"Test for what you learned :${i++}",Toast.LENGTH_SHORT).show()
                }
                GlobalScope.launch(Dispatchers.Main){
                    delay(3000)
                    Log.d(" here","hello  + ${Thread.currentThread().name}")
                    Toast.makeText(context,"Test for what you learned :${i++}",Toast.LENGTH_SHORT).show()
                }
            }


          }

      )
      
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        modifier = Modifier.fillMaxSize(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        MyFun()
    }
}

