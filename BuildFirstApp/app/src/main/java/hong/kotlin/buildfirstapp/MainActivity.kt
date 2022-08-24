package hong.kotlin.buildfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnLogIn = findViewById<Button>(R.id.btnLogin)
        var pwText = findViewById<TextView>(R.id.pwText)
        btnLogIn.setOnClickListener() {
            pwText.text = "Add me to text password field"
            println("test")
        }
    }
}