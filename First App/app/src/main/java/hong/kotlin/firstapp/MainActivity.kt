package hong.kotlin.firstapp

import android.content.DialogInterface
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MyBtn = findViewById<Button>(R.id.btn1)
        val MyText = findViewById<TextView>(R.id.textview);
        var timesLoad = 0
        MyBtn.setOnClickListener() {
            timesLoad += 1
            MyText.text = "Count Me is " + timesLoad.toString()

            Toast.makeText(this, "Hello Me $timesLoad", Toast.LENGTH_LONG).show()
        }

        var addContactDialog = AlertDialog.Builder(this)
            .setTitle("test")
            .setMessage("Hello my name is senghong")
            .setIcon(R.drawable.contact_foreground )
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "you add me !", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "you didn't add me !", Toast.LENGTH_SHORT).show()
            }.create()
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            addContactDialog.show()
        }

        val options = arrayOf("First Item", "second item", "third item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Please choose one :")
            .setIcon(R.drawable.contact_foreground)
            .setSingleChoiceItems(options, 0) { _, i ->
                Toast.makeText(this, "You has selected on :  ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, i ->
                Toast.makeText(this, "You accepted this single choice ! ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("De Accept") { _, _ ->
                Toast.makeText(this, "You has not accepted !", Toast.LENGTH_SHORT).show()
            }.create()

        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multi = arrayOf("First Item", "second item", "third item")
        val mulliSelect = AlertDialog.Builder(this)
            .setTitle("Please choose Multiple Items :")
            .setIcon(R.drawable.contact_foreground)
            .setMultiChoiceItems(multi, booleanArrayOf(false, false, false)) { _,_, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "You has selected on : ", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "You has Unselected ", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept") { _,_->
                Toast.makeText(this, "You accepted this single choice !", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("De Accept") { _, _ ->
                Toast.makeText(this, "You has not accepted !", Toast.LENGTH_SHORT).show()
            }.create()
        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {
            mulliSelect.show()
        }

    }
}