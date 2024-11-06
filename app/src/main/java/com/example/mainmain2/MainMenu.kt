package com.example.mainmain2

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun MainMenu(
    modifier: Modifier = Modifier
){
    var nama by remember { mutableStateOf("") }
    var harga by remember { mutableStateOf("") }
    var jumlah by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var pilihanstatus  = listOf("Dine in", "Take Away")

    var jumlahmkn by remember { mutableStateOf("") }
    var statusmkn by remember { mutableStateOf("") }

    Column(
        modifier=Modifier.fillMaxSize().padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BagianHeader()
        Column (modifier=Modifier.padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally){
            Row() {
                Box(modifier = Modifier
                    .background(color = Color.Gray)
                    .size(height = 150.dp, width = 150.dp),
                    contentAlignment = Alignment.Center
                ){
                    Row {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.burger),
                                contentDescription = "",
                                modifier=Modifier
                                    .size(height = 75.dp, width = 100.dp)
                            )
                            Text(text = "Cheeseburger", fontSize = 15.sp)
                            Text(text = "    Bun, Patty, Lettuce,\n Chvk", fontSize = 10.sp, textAlign = TextAlign.Center)
                            Text(text = "Rp.50.000,-", fontSize = 15.sp, textAlign = TextAlign.Start)
                        }
                    }
                }
                Spacer(modifier=Modifier.padding(horizontal = 15.dp))
                Box(modifier = Modifier
                    .background(color = Color.Gray)
                    .size(height = 150.dp, width = 150.dp),
                    contentAlignment = Alignment.Center
                ){
                    Row {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.fries),
                                contentDescription = "",
                                modifier=Modifier
                                    .size(height = 75.dp, width = 100.dp)
                            )
                            Text(text = "Fries", fontSize = 15.sp)
                            Text(text = "Real Potato", fontSize = 10.sp, textAlign = TextAlign.Center)
                            Text(text = "Rp.20.000,-", fontSize = 15.sp, textAlign = TextAlign.Start)
                        }
                    }
                }
            }
            Row (){
                Column() {
                    OutlinedTextField(
                        value = jumlah,
                        onValueChange = {jumlah = it},
                        label = {Text("Jumlah")},
                        modifier=Modifier.size(height = 45.dp, width=100.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(horizontal = 30.dp))
                Column() {
                    OutlinedTextField(
                        value = jumlah,
                        onValueChange = {jumlah = it},
                        label = {Text("Jumlah")},
                        modifier=Modifier.size(height = 45.dp, width=100.dp)
                    )
                }
            }
            Spacer(modifier=Modifier.padding(5.dp))
            Row {
                Box(modifier = Modifier
                    .background(color = Color.Gray)
                    .size(height = 150.dp, width = 150.dp),
                    contentAlignment = Alignment.Center
                ){
                    Row {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.pizza),
                                contentDescription = "",
                                modifier=Modifier
                                    .size(height = 75.dp, width = 100.dp)
                            )
                            Text(text = "Pizza", fontSize = 15.sp)
                            Text(text = "Pepperoni, Cheese, Crust", fontSize = 10.sp, textAlign = TextAlign.Center)
                            Text(text = "Rp.100.000,-", fontSize = 15.sp, textAlign = TextAlign.Start)
                        }
                    }
                }
                Spacer(modifier=Modifier.padding(horizontal = 15.dp))
                Box(modifier = Modifier
                    .background(color = Color.Gray)
                    .size(height = 150.dp, width = 150.dp),
                    contentAlignment = Alignment.Center
                ){
                    Row {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.cola),
                                contentDescription = "",
                                modifier=Modifier
                                    .size(height = 75.dp, width = 100.dp)
                            )
                            Text(text = "Cola", fontSize = 15.sp)
                            Text(text = "Sugar", fontSize = 10.sp, textAlign = TextAlign.Center)
                            Text(text = "Rp.10.000,-", fontSize = 15.sp, textAlign = TextAlign.Start)
                        }
                    }
                }
            }
            Row (){
                Column() {
                    OutlinedTextField(
                        value = jumlah,
                        onValueChange = {jumlah = it},
                        label = {Text("Jumlah")},
                        modifier=Modifier.size(height = 45.dp, width=100.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(horizontal = 30.dp))
                Column() {
                    OutlinedTextField(
                        value = jumlah,
                        onValueChange = {jumlah = it},
                        label = {Text("Jumlah")},
                        modifier=Modifier.size(height = 45.dp, width=100.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row (){
                pilihanstatus.forEach { item ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(selected = status == item,
                            onClick = {
                                status = item
                            })
                        Text(item)
                    }
                }
            }
            Row {
                Button(
                    onClick = {
                        statusmkn = status
                        jumlahmkn = jumlah
                    }
                ) { Text(text="Order") }
            }
            Card(modifier.size(height = 200.dp, width = 300.dp)) {
                CardSection(judulParam = "Status", isiParam = statusmkn) //menampilkan variabel isiParam dengan niilai namaUser
                CardSection(judulParam = "Jumlah", isiParam = jumlahmkn)

            }
        }
    }
}

@Composable
fun BagianHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Red)){
        Row(modifier = Modifier.padding(15.dp)){
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource(id = R.drawable.wendy),
                    contentDescription = "",
                    Modifier.size(50.dp).clip(shape = CircleShape))
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "", Modifier.padding(end=2.dp).size(15.dp),
                    tint = Color.Blue)
            }
            Column(Modifier.padding(5.dp)) {
                Text(text = "Wendy's", color = Color.White, fontSize = 20.sp)
                Spacer(Modifier.padding(2.dp))
                Text(text = "Local Fast Food Chain", color = Color.LightGray)
            }
        }
    }
}

@Composable
fun CardSection(judulParam: String, isiParam:String){
    Column(){
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = judulParam, modifier = Modifier.weight(0.8f))
            Text(text = " = ", modifier = Modifier.weight(0.2f))
            Text(text = "$isiParam",
                modifier = Modifier.weight(2f))
        }
    }
}