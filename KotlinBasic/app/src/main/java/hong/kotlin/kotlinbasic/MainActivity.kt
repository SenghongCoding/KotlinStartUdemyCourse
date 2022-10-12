package hong.kotlin.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickMe = findViewById<Button>(R.id.btnClcikme)
        var countNumber = 0
        clickMe.setOnClickListener {
            countNumber += 1 * 3
            Toast.makeText(
                this,
                "Hello Senghong $countNumber ",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}