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
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.icons.filled.ArrowDropDown
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
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlin.math.PI
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sin

// create animated circuler progress
//@Composable
//fun AnimatedCircularProgress() {
//    val progress = remember { Animatable(0f) }
//    val process2= 1f
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


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

//       val FontFamily= FontFamily(
//           Font(R.font.font_style)
//       )


        setContent {

            // DropdownMenu()
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Box(
                    modifier = Modifier
                        .padding(top = 40.dp),


                ) {
                    Text(
                        text = "welcome to github",
                        fontSize = 34.sp,
                        color = Color.Red,

                    )


                }
            }


        }
    }
}


// animated 3d drop down menu

//
//@Composable
//fun DropdownMenu() {
//    var isExpanded by remember { mutableStateOf(false) }
//    val rotationAngle by animateFloatAsState(targetValue = if (isExpanded) 180f else 0f)
//
//    Column(
//        modifier = Modifier
//            .padding(16.dp)
//            .fillMaxWidth()
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .clickable { isExpanded = !isExpanded },
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Box(
//                modifier = Modifier
//                    .padding(8.dp)
//            ) {
//                Text(
//                    text = "Hello",
//                    fontSize = 20.sp,
//                    color = Color.Black
//                )
//            }
//            Box(
//                modifier = Modifier
//                    .padding(8.dp)
//            ) {
//                Icon(
//                  //  imageVector = if (isExpanded) Icons.Filled.ArrowDropUp else Icons.Filled.ArrowDropDown,
//                    contentDescription = "Dropdown Icon",
//                    tint = Color.Black,
//                    modifier = Modifier
//                        .size(24.dp)
//                        .graphicsLayer {
//                            rotationZ = rotationAngle
//                        }
//                )
//            }
//        }
//        if (isExpanded) {
//            Box(
//                modifier = Modifier
//                    .padding(top = 8.dp)
//                    .height(200.dp)
//                    .fillMaxWidth()
//                    .background(Color.LightGray, RoundedCornerShape(8.dp)),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(
//                    text = "Dropdown Content",
//                    fontSize = 18.sp,
//                    color = Color.Black
//                )
//            }
//        }
//    }
//}
//


////create timer

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
//            var size by remember {
//                mutableStateOf(200.dp)
//            }
//            val animation by animateDpAsState(
//                targetValue = size,
//                tween(durationMillis = 1000 ,
//                    delayMillis = 500
//
//                )
//            )
//            Box(
//                modifier = Modifier
//                    .size(animation)
//                    .background(Color.Red),
//                Alignment.BottomEnd,
//
//                ) {
//                Button(onClick = {
//                    size += 50.dp
//                }) {
//                    Text(text = "click to maximize")
//                }
//
//            }

//            val constraints = ConstraintSet {
//                val greenbox = createRefFor("green_box")
//                val redbox=createRefFor("red_box")
//
//                constrain(greenbox){
//                    top.linkTo(parent.top)
//                    start.linkTo(parent.start)
//                    width=Dimension.value(100.dp)
//                    height=Dimension.value(100.dp)
//
//                }
//
//                constrain(redbox){
//                    top.linkTo(parent.top)
//                    start.linkTo(greenbox.end)
//                    width=Dimension.value(100.dp)
//                    height=Dimension.value(100.dp)
//                }
//
//            }
//            ConstraintLayout(constraints, modifier = Modifier.fillMaxSize()) {
//
//                Box(modifier = Modifier
//                    .background(Color.Green)
//                    .layoutId("green_box"))
//
//                Box(modifier = Modifier
//                    .background(Color.Red)
//                    .layoutId("red_box"))
//            }
//            LazyColumn {
//                items(200) {
//                    Text(
//                        text = "item $it",
//                        fontSize = 25.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//
//
//                    )
//                }
//
//            }


//                    val snackbarHostState = remember { SnackbarHostState() }
//                    var textfield by remember { mutableStateOf("") }
//                    val scope = rememberCoroutineScope()
//
//                    Scaffold(
//                        modifier = Modifier.fillMaxSize(),
//
//                        snackbarHost = {
//                            SnackbarHost(hostState = snackbarHostState)
//                        }
//                    ) {
//                        Column(
//                            verticalArrangement = Arrangement.Center,
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .background(Color.Yellow)
//                                .padding(horizontal = 30.dp)
//                        ) {
//                            TextField(
//                                value = textfield,
//                                label = {
//                                    Text(text = "enter your data")
//                                },
//                                onValueChange = {
//                                    textfield = it
//                                },
//                                singleLine = true,
//                                modifier = Modifier.fillMaxWidth()
//                            )
//                            Spacer(modifier = Modifier.height(15.dp))
//                            Button(onClick = {
//                                scope.launch {
//                                    snackbarHostState.showSnackbar("hello $textfield")
//                                }
//                            }) {
//                                Text(text = "welcome mr ")
//                            }
//                        }
//
//            Box(modifier = Modifier
//                .padding(30.dp)
//                .fillMaxWidth()
//                .background(Color.Yellow))
//
//            {
//                Text(
//                    text = "welcome",
//                    fontFamily = FontFamily,
//                    fontWeight =FontWeight.Bold,
//                    fontSize = 10.sp,
//                    textAlign = TextAlign.End
//
//
//                    )
//
//
//            }


//MainContent()
//            Row (
//                modifier = Modifier
//                  //  .background(Color.Yellow)
//                    //.padding(30.dp)
//                    //.width(150.dp)
//                    .fillMaxWidth()
//                    .height(150.dp),
//
//                horizontalArrangement = Arrangement.SpaceEvenly,
//               verticalAlignment =Alignment.CenterVertically
//
//
//
//            ){
//                Text(text = "done" , modifier = Modifier
//                    .background(Color.Blue)
//                    .size(70.dp)
//                    .width(200.dp)
//                    .fillMaxWidth()
//
//                )
//                Spacer(modifier = Modifier.width(30.dp).background(Color.Blue))
//                Text(text = "done")
//                Text(text = "done")
//            }

//fun ColorBox(modifier: Modifier = Modifier) {
//    // Using mutableStateOf to hold a single color value
//    var color by remember { mutableStateOf(Color.Red) }

//@Composable
//
//fun color_box(modifier: Modifier=Modifier) {
//    var seocnd_box by remember {
//        mutableStateOf(Color.Blue)
//    }
//
//    Column(modifier=Modifier) {
//
//        Box(modifier = modifier
//
//            .background(Color.Red)
//            .clickable {
//                seocnd_box = Color(
//
//                    Random.nextFloat(),
//                    Random.nextFloat(),
//                    Random.nextFloat(),
//
//                    )
//            }
//            .weight(1f)
//        )
//
//        Box(modifier = Modifier
//            .fillMaxSize()
//            .background(seocnd_box)
//            .weight(1f)
//
//        )
//
//
//    }
//
//}

//// adding image cards
//@Composable
//fun ImageCard(imageCard: ImageCard) {
//    Card(
//        shape = RoundedCornerShape(20.dp),
//
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(IntrinsicSize.Min)
//
//
//            .padding(8.dp)
//    ) {
//        Column(modifier = Modifier.padding(8.dp)
//            .fillMaxHeight(0.5f)
//        ) {
//            Image(
//                painter = painterResource(id = imageCard.imageRes),
//                contentDescription = null,
//                modifier = Modifier
//                    .fillMaxWidth()
//
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
//
//@Composable
//fun MainContent() {
//    val imageCard = ImageCard(
//        imageRes = R.drawable.rasm,
//        title = "desktop image",
//        description = "photo of my mac laptop"
//    )
//    MaterialTheme {
//        Surface(modifier = Modifier.fillMaxSize()) {
//            ImageCard(imageCard = imageCard)
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewMainContent() {
//
//    MainContent()
//}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Jetpack_composeTheme {
//        Greeting("Android")
//    }
//}