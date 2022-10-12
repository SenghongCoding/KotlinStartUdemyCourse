package hong.kotlin.buildfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class LoginAtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_ativity)
        supportActionBar != null
        val fab_googel = findViewById<Button>(R.id.fab_googel)

        fab_googel.setOnClickListener{

            val intent = Intent(this, UI1::class.java)

            startActivity(intent)
        }
    }
}