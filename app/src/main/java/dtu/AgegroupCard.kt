package dtu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dtu.engtech.DB3_3.R
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.navigation.NavController


@Composable
fun AgegroupCard(
    agegroup: Agegroup,
    modifier: Modifier = Modifier,
) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource((R.drawable.startside)),
            contentDescription = "Start skattejagten",
            modifier = Modifier
                .size(50.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = agegroup.age.toString()
            )
        }
    }
}

@Composable
fun StartsideView(navController: NavController) {
    Column(modifier = Modifier.padding(10.dp)) {
        Image(
            painter = painterResource(R.drawable.startside),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clickable { Log.e("Hej", "Farvel") }
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )
        Button(onClick = { navController.navigate("Agegruop") }, 
            modifier = Modifier.padding(10.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)) {
            Text(text = "Start skattejagten")
            
        }
    }
}
       /* 
        //verticalArrangement = Arrangement.Center,
            //horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Cyan,
            contentColor = Color.Magenta
        ),
            onClick = { navController.navigate("Game") }) {
            Text(text = "To Game")
        }
            )}
    /*Box(
        Image(
            painter = painterResource((R.drawable.startside)),
            contentDescription = "Start skattejagten",
            modifier = Modifier
                .size(50.dp)
                .fillMaxWidth()
                .fillMaxHeight(),
            //verticalArrangement = Arrangement.Center,
            //horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Cyan,
                contentColor = Color.Magenta
            ),
                onClick = { navController.navigate("Startside") }) {
                Text(text = "To agegroup")
            }
            )
        }*/

}*/

@Composable
fun AgegroupView(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Cyan,
            contentColor = Color.Magenta
        ),
            onClick = { navController.navigate("Game") }) {
            Text(text = "To Game")
        }
    }
}

@Composable
fun GameViewBarn(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Cyan,
            contentColor = Color.Magenta
        ),
            onClick = { navController.navigate("Startside") }) {
            Text(text = "Back to Startside")
        }
    }
}

@Composable
fun GameViewTeen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Cyan,
            contentColor = Color.Magenta
        ),
            onClick = { navController.navigate("Startside") }) {
            Text(text = "Back to Startside")
        }
    }
}