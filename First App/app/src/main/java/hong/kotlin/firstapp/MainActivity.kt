package hong.kotlin.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MyBtn = findViewById<Button>(R.id.mybutton)
        val  MyText = findViewById<TextView>(R.id.textview);
        var  timesLoad = 0
        MyBtn.setOnClickListener(){
            timesLoad += 1
            MyText.text = "Count Me is " + timesLoad.toString()

            Toast.makeText(this, "Hello Me $timesLoad", Toast.LENGTH_LONG).show()
        }

    }
}