package hong.kotlin.dobcalculate

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tvSelectDate: TextView? = null
    private var tvMinute: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSelectDate = findViewById<Button>(R.id.btnSelect)
        tvSelectDate = findViewById(R.id.viewDate)
        tvMinute = findViewById(R.id.viewMinute)
        btnSelectDate.setOnClickListener { _ ->
            clickDatePicker()
        }
    }

    
    private fun clickDatePicker() {
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        val dpd = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _, selectedYear, selectedMonth, selectedDateOfMonth ->
//                Toast.makeText(this, "year is $year", Toast.LENGTH_SHORT).show()

                val selectedDate = "$selectedDateOfMonth/${selectedMonth + 1}/$selectedYear"
                tvSelectDate?.text = (selectedDate)

                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                val theDate = sdf.parse(selectedDate)
                val selectedDateInMinuted = theDate.time / 60000

                val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))

                val currectMinutes = currentDate.time / 60000
                val differnceInMinutes = currectMinutes - selectedDateInMinuted
                tvMinute?.text = differnceInMinutes.toString()
            },
            year,
            month,
            day
        )
        dpd.datePicker.maxDate = System.currentTimeMillis() - 8400000
        dpd.show()

    }

}

