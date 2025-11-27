package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

class MealPassActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MealPassScreen(
                imgId = R.drawable.you,
                studentName = "Devendranadh Venkat",
                regNo = "12301888",
                mealType = "Daily / Weekly / Monthly",
                feeAmount = "10000"
            )
        }
    }
}

@Composable
fun MealPassScreen(
    imgId: Int,
    studentName: String,
    regNo: String,
    mealType: String,
    feeAmount: String
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Image(
            painter = painterResource(id = imgId),
            contentDescription = "Profile",
            modifier = Modifier
                .size(130.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(20.dp))


        Row(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Student Name", fontSize = 16.sp, fontWeight = FontWeight.ExtraBold)
                OutlinedTextField(
                    value = studentName,
                    onValueChange = {},
                    placeholder = { Text("Enter Name") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))


        Row(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Registration Number", fontSize = 16.sp,fontWeight = FontWeight.ExtraBold)
                OutlinedTextField(
                    value = regNo,
                    onValueChange = {},
                    placeholder = { Text("Enter Reg No") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))


        Row(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Meal Plan Type", fontSize = 16.sp,fontWeight = FontWeight.ExtraBold)
                OutlinedTextField(
                    value = mealType,
                    onValueChange = {},
                    placeholder = { Text("Daily / Weekly / Monthly") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))


        Row(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Fee Amount", fontSize = 16.sp,fontWeight = FontWeight.ExtraBold,)
                OutlinedTextField(
                    value = feeAmount,
                    onValueChange = {},
                    placeholder = { Text("Enter Fee Amount") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1E88E5))
        ) {
            Text(text = "Get Meal Pass", fontSize = 18.sp, color = Color.White)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMealPassScreen() {
    MealPassScreen(
        imgId = R.drawable.you,
        studentName = "Devendranadh Venkat",
        regNo = "12301888",
        mealType = "Daily / Weekly / Monthly",
        feeAmount = "10000"
    )
}
