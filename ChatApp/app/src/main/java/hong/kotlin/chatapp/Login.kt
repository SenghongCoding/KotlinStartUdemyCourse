package hong.kotlin.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth


class Login : AppCompatActivity() {

    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnLogIn: Button
    private lateinit var btnSignUp: Button

    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        mAuth = FirebaseAuth.getInstance()

        editEmail = findViewById(R.id.id_email)
        editPassword = findViewById(R.id.id_password)
        btnLogIn = findViewById(R.id.btn_login)
        btnSignUp = findViewById(R.id.btn_signup)

        btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        btnLogIn.setOnClickListener {
            val email = editEmail.text.toString()
            var password = editPassword.text.toString()

            login(email, password)
        }

    }

    private fun login(email: String, password: String) {
        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val intent = Intent(this@Login, HomeApp::class.java)
                    startActivity(intent)
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(this@Login, "User does not exist!", Toast.LENGTH_SHORT).show()
                }
            }
    }
}