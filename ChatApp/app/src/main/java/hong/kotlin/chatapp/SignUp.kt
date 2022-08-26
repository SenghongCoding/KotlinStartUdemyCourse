package hong.kotlin.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SignUp : AppCompatActivity() {

    private lateinit var edtName: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnSignUp: Button

    private lateinit var SAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        supportActionBar?.hide()
        SAuth = FirebaseAuth.getInstance()
        edtEmail = findViewById(R.id.l_email)
        edtName = findViewById(R.id.name)
        edtPassword = findViewById(R.id.l_password)
        btnSignUp = findViewById(R.id.l_signUp)
        btnSignUp.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()

            mySignUp(email, password)
        }

    }

    private fun mySignUp(email: String, password: String) {
        SAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this@SignUp, Login::class.java)
                    startActivity(intent)

                } else if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(
                        this@SignUp,
                        "Please input email and Password",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(this@SignUp, "some error occurred !", Toast.LENGTH_SHORT).show()
                }
            }
    }
}