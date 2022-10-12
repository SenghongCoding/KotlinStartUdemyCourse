package hong.kotlin.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        var start = findViewById<Button>(R.id.start)
        val ed_name: EditText = findViewById(R.id.ed_text)
        start.setOnClickListener {
            if (ed_name.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name ", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuizQuestion::class.java)
                startActivity(intent)
                finish()

            }
        }
    }
}