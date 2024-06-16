package com.example.jetpack_compose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

import kotlinx.coroutines.launch
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.random.Random

import androidx.activity.compose.setContent
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
//import androidx.compose.material.Icon
//import androidx.compose.material.icons.Icons
//import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

import androidx.compose.ui.input.pointer.pointerInput
//import androidx.compose.ui.tooling.data.EmptyGroup.data
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import kotlin.math.PI
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sin
import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.remember
import androidx.core.content.ContextCompat
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.BottomSheetState
import androidx.compose.material.BottomSheetValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.rememberBottomSheetState
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.core.app.ActivityCompat


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            println("welcome")
            //MyGridScreen()  //lazy vertical grid example
        // {navigating to different pages using navigation component Icons
//            val navController = rememberNavController()
//            Scaffold(
//                bottomBar = { BottomNavigationBar(navController) }
//            ) {
//                NavGraph(navController = navController)
//            }
//calling all the composable functions
//
// MultiSelectNumberColumn()  // multiselect number column
//  Navigation() //navigating from one screen to other , and passing data to another screen
// MainContent() //adding image card
//github_text() //simple text
//Drop_Down_Menu() //dropdown_menu
// TimerScreen()  //create timer
//maximiz_box_animated() //maximize box with a button
// Retrive_data_Lazy_Column() //retrive the data according to size of screen
//Snack_Bar() //how snacbars work when entering data on textfield
// AnimatedCircularProgress() // animated circuler progress
        }

    }

}


//{LazyVerticalGrid Example
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MyGridScreen() {
//    val itemsList = (1..15).map { "Item $it" }
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("LazyVerticalGrid Example") }
//            )
//        },
//        content = { padding ->
//            LazyVerticalGrid(
//                columns = GridCells.Fixed( 3), // Set the number of columns
//                modifier = Modifier
//                    .padding(padding)
//                    .fillMaxSize()
//            ) {
//                items(itemsList) { item ->
//                    GridItem(item)
//                }
//            }
//        }
//    )
//}
//
//@Composable
//fun GridItem(item: String) {
//    Box(
//        modifier = Modifier
//            .padding(8.dp)
//            .fillMaxWidth()
//            .aspectRatio(1f)
//            .background(Color.Green),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = item,
//            fontSize = 18.sp,
//            color = Color.Black
//        )
//    }
//}
//}LazyVerticalGrid Example


//{ embeded compose in xml code. should be run in mainactivity .
//        setContentView(R.layout.compose_on_xml)
//        var textFromXml by mutableStateOf("") // No 'remember' here
//
//        val xmlTextField = findViewById<EditText>(R.id.xmlTextField)
//        xmlTextField.addTextChangedListener(object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) {
//                textFromXml = s.toString()
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
//        })
//
//        val composeView = findViewById<ComposeView>(R.id.compose_view)
//        composeView.setContent {
//            MaterialTheme {
//                ComposeTextFieldSection(textFromXml) { newText ->
//                    textFromXml = newText // Update textFromXml when Compose TextField changes
//                }
//            }
//        }
//} embeded compose in xml code.


//
//{ multiselect number column

//
//data class Item(val id: Int, val text: String)
//
//@Composable
//fun MultiSelectNumberColumn() {
//    val items = remember {
//        mutableStateListOf<Item>() // Specify the correct type explicitly
//    }
//    val selectedItems = remember { mutableStateListOf<Int>() }
//
//    // Generate numbers from 1 to 10
//    for (i in 1..17) {
//        items.add(Item(i, i.toString())) // Adding numbers with string representation
//    }
//
//    Column {
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxSize()
//                .weight(1f)
//        ) {
//            items(items) { item ->
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(16.dp)
//                        .background(if (selectedItems.contains(item.id)) Color.LightGray else Color.Transparent)
//                        .clickable {
//                            if (selectedItems.contains(item.id)) {
//                                selectedItems.remove(item.id)
//                            } else {
//                                selectedItems.add(item.id)
//                            }
//                        },
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceBetween
//                ) {
//
//                    Text(
//                        text = item.text,
//                        color = Color.Red
//
//                    )
//
//                }
//            }
//        }

// Display selected items (optional)
//        Text(
//            text = "Selected Items: ${selectedItems.joinToString()}",
//            modifier = Modifier.padding(16.dp)
//        )
//    }
//}

//} multiselect number column


////{ adding image cards

//data class ImageCard(
//    val imageRes: Int,
//    val title: String,
//    val description: String,
//)
//
//@Composable
//fun MainContent() {
//    val imageCard = ImageCard(
//        imageRes = R.drawable.dev, // Make sure this drawable exists in your res/drawable directory
//        title = "Android Development",
//        description = "Photo of Android dev "
//    )
//    ImageCard(imageCard = imageCard)
//}
//
//@Composable
//fun ImageCard(imageCard: ImageCard) {
//    Card(
//        shape = RoundedCornerShape(10.dp),
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(20.dp)
//            .padding(top = 20.dp)
//    ) {
//        Column(
//            modifier = Modifier
//                .padding(top = 20.dp)
//                .padding(10.dp)
//        ) {
//            Image(
//                painter = painterResource(id = imageCard.imageRes),
//                contentDescription = null,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(200.dp),
//                contentScale = ContentScale.Crop
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = imageCard.title,
//                fontSize = 16.sp,
//                fontWeight = FontWeight.Bold
//            )
//            Spacer(modifier = Modifier.height(4.dp))
//            Text(
//                text = imageCard.description,
//                fontSize = 14.sp
//            )
//        }
//    }
//}
//} adding image cards

//{ github text
//@Composable
//fun github_text() {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//
//    ) {
//        Box(
//        ) {
//            Text(
//                text = "welcome to github",
//                fontSize = 34.sp,
//                color = Color.Black,
//            )
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        Box(
//        ) {
//            Text(
//                text = "welcome to github",
//                fontSize = 34.sp,
//                color = Color.Red,
//            )
//        }
//    }
//}

//} github text


// {  drop down menu
//@Composable
//fun Drop_Down_Menu() {
//    var expanded by remember { mutableStateOf(false) }
//    var selectedText by remember { mutableStateOf("") }
//    val items = listOf("Option 1", "Option 2", "Option 3")
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Top,
//        horizontalAlignment = Alignment.Start
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 30.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.Center
//        ) {
//            Box {
//                Button(
//                    onClick = { expanded = true }) {
//                    Text(text = "select option")
//                }
//
//
//                DropdownMenu(
//                    modifier = Modifier.align(Alignment.Center),
//                    expanded = expanded,
//                    onDismissRequest = { expanded = false }
//                ) {
//                    items.forEach { item ->
//                        DropdownMenuItem(onClick = {
//                            selectedText = item
//                            expanded = false
//                        }) {
//                            Text(text = item)
//                        }
//                    }
//                }
//            }
//        }
//
//        Text(
//            text = "Selected: $selectedText",
//            modifier = Modifier.padding(16.dp)
//        )
//    }
//}
//}drop down menu


////{create timer

//@Composable
//fun TimerScreen() {
//    var time by remember { mutableStateOf(60) } // Initial time in seconds
//    var isRunning by remember { mutableStateOf(false) }
//    var elapsedTime by remember { mutableStateOf(0) }
//
//    LaunchedEffect(isRunning, elapsedTime) {
//        if (isRunning && time > 0) {
//            delay(500L)
//            time--
//            elapsedTime++
//        }
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFEDEDED))
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Box(contentAlignment = Alignment.Center) {
//            Canvas(modifier = Modifier.size(200.dp)) {
//                val circleRadius = size.minDimension / 2
//                val angle = (2 * PI * time.toFloat() / 60).toFloat()
//
//                // Draw outer circle
//                drawCircle(
//                    color = Color.Gray,
//                    radius = circleRadius,
//                    style = Stroke(width = 10.dp.toPx(), cap = StrokeCap.Round)
//                )
//
//                // Draw timer progress
//                drawArc(
//                    color = Color.Blue,
//                    startAngle = -90f,
//                    sweepAngle = 360f * time / 60,
//                    useCenter = false,
//                    style = Stroke(width = 10.dp.toPx(), cap = StrokeCap.Round)
//                )
//
//                // Draw button area
//                val buttonRadius = circleRadius * 0.2f
//                val buttonCenterX = center.x + circleRadius * cos(angle - PI / 2).toFloat()
//                val buttonCenterY = center.y + circleRadius * sin(angle - PI / 2).toFloat()
//
//                drawCircle(
//                    color = if (isRunning) Color.Red else Color.Green,
//                    radius = buttonRadius,
//                    center = Offset(buttonCenterX, buttonCenterY)
//                )
//            }
//
//            Text(
//                text = time.toString(),
//                fontSize = 48.sp,
//                color = Color.Black,
//                fontWeight = FontWeight.Bold
//            )
//        }
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(
//            onClick = { isRunning = !isRunning },
//            shape = CircleShape,
//
//            modifier = Modifier.size(80.dp)
//        ) {
//            Text(
//                text = if (isRunning) "Stop" else "Start",
//                color = Color.White
//            )
//        }
//    }
//}
// }create timer

//{maximiz box with a button
//@Composable
//fun maximiz_box_animated(){
//    var size by remember {
//        mutableStateOf(200.dp)
//    }
//    val animation by animateDpAsState(
//        targetValue = size,
//        tween(durationMillis = 1000 ,
//            delayMillis = 500
//
//        )
//    )
//    Box(
//        modifier = Modifier
//            .size(animation)
//            .background(Color.Red),
//        Alignment.BottomEnd,
//
//        ) {
//        Button(onClick = {
//            size += 50.dp
//        }) {
//            Text(text = "click to maximize")
//        }
//
//    }
//}
// }maximiz box with a button

//{ retrive the data according to size of screen
//@Composable
//fun Retrive_data_Lazy_Column() {
//LazyColumn {
//    items(200) {
//        Text(
//            text = "item $it",
//            fontSize = 25.sp,
//            fontWeight = FontWeight.Bold,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(vertical = 24.dp)
//
//
//        )
//    }
//}
//}

//} retrive the data according to size of screen

//{how snacbars work when entering data on textfield
//@Composable
//fun Snack_Bar() {
//    val snackbarHostState = remember { SnackbarHostState() }
//    var textfield by remember { mutableStateOf("") }
//    val scope = rememberCoroutineScope()
//
//    Scaffold(
//        modifier = Modifier.fillMaxSize(),
//
//        snackbarHost = {
//            SnackbarHost(hostState = snackbarHostState)
//        }
//    ) {
//        Column(
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color.Yellow)
//                .padding(horizontal = 30.dp)
//        ) {
//            TextField(
//                value = textfield,
//                label = {
//                    Text(text = "enter your data")
//                },
//                onValueChange = {
//                    textfield = it
//                },
//                singleLine = true,
//                modifier = Modifier.fillMaxWidth()
//            )
//            Spacer(modifier = Modifier.height(15.dp))
//            Button(onClick = {
//                scope.launch {
//                    snackbarHostState.showSnackbar("hello $textfield")
//                }
//            }) {
//                Text(text = "welcome mr ")
//            }
//        }
//
//        Box(
//            modifier = Modifier
//                .padding(30.dp)
//                .fillMaxWidth()
//                .background(Color.Yellow)
//        )
//    }
//}

// }how snacbars work when entering data on textfield


// {create animated circuler progress
//@Composable
//fun AnimatedCircularProgress() {
//    val progress = remember { Animatable(0f) }
//    val process2= 2f
//    val scope = rememberCoroutineScope()
//
//    LaunchedEffect(Unit) {
//        scope.launch {
//            progress.animateTo(
//                targetValue = process2,
//                animationSpec = tween(
//                    durationMillis = 2000
//                )
//            )
//        }
//    }
//
//    Box(
//        contentAlignment = androidx.compose.ui.Alignment.Center,
//        modifier = Modifier.fillMaxSize()
//    ) {
//
//
//        Canvas(
//            modifier = Modifier
//                .size(200.dp)
//        ) {
//            drawArc(
//                color = Color.Green,
//                startAngle = -90f,
//                sweepAngle = 150 * progress.value,
//                useCenter = false,
//                style = androidx.compose.ui.graphics.drawscope.Stroke(
//                    width = 14.dp.toPx(),
//                    cap = StrokeCap.Round
//                )
//            )
//            val progressText = (progress.value * 100).toInt().toString()
//            val textPaint = Paint().asFrameworkPaint().apply {
//                isAntiAlias = true
//                textSize = 30.sp.toPx()
//                color = android.graphics.Color.BLACK
//                textAlign = android.graphics.Paint.Align.CENTER
//                typeface = android.graphics.Typeface.create("", android.graphics.Typeface.BOLD)
//            }
//
//            drawContext.canvas.nativeCanvas.drawText(
//                progressText,
//                size.width / 2,
//                size.height / 2 - (textPaint.ascent() + textPaint.descent()) / 2,
//                textPaint
//            )
//        }
//    }
//}
// }create animated circuler progress
