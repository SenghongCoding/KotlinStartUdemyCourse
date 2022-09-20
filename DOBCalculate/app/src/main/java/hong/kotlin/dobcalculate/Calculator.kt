package hong.kotlin.dobcalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.ArithmeticException

class Calculator : AppCompatActivity() {

    private var tvInput: TextView? = null
    private var clearbtn: Button? = null

    var lastDot: Boolean = false
    var lastNumeric: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        tvInput = findViewById(R.id.tvinput)

        clearbtn = findViewById(R.id.clear_text)



    }

    fun onDigit(view: View) {
        tvInput?.append((view as Button).text)
        lastNumeric = true
        lastDot = false

//        var setence = "Senghon"
//        if (setence.contains("Seng")){
//            tvInput?.append("SengHong")
//        }
    }

    fun onClear(view: View) {
        tvInput?.text = ""

    }

    fun onDecimalPoint(view: View) {
        if (lastNumeric && !lastDot) {
            tvInput?.append(".")
            lastNumeric = false
            lastDot = true
        }
    }

    fun onOperator(view: View) {

        tvInput?.text?.let {

            if (lastNumeric && !isOperatorAdded(it.toString())) {
                tvInput?.append((view as Button).text)
                lastNumeric = false
                lastDot = false
            }
        }

    }

    private fun removeZeroAfterDot(result: String): String {
        var value = result
        if (result.contains(".0")) {
            value = result.substring(0, result.length - 2)
        }
        return value
    }

    fun onEqual(view: View) {
        if (lastNumeric) {
            var tvValue = tvInput?.text.toString()
            var prefix = ""
//            !----------------
            try {
                if (tvValue.startsWith("-")) {
                    prefix = "-"
                    tvValue = tvValue.substring(1)
                }
                if (tvValue.contains("-")) {
                    val splitValue = tvValue.split("-")
                    var one = splitValue[0]
                    var two = splitValue[1]
                    var result = one.toDouble() - two.toDouble()

                    if (prefix.isNotEmpty()) {
                        one = prefix + one
                    }

                    tvInput?.text = removeZeroAfterDot(result.toString())
                }
//                !++++++++++++++++++++++++
                else if (tvValue.contains("+")) {
                    val splitValue = tvValue.split("+")
                    var one = splitValue[0]
                    var two = splitValue[1]
                    var result = one.toDouble() + two.toDouble()

                    if (prefix.isNotEmpty()) {
                        one = prefix + one
                    }

                    tvInput?.text = removeZeroAfterDot(result.toString())
                }
//                !/////////////////////////////
                else if (tvValue.contains("/")) {
                    val splitValue = tvValue.split("/")
                    var one = splitValue[0]
                    var two = splitValue[1]
                    var result = one.toDouble() / two.toDouble()

                    if (prefix.isNotEmpty()) {
                        one = prefix + one
                    }

                    tvInput?.text = removeZeroAfterDot(result.toString())
                }
//                !***************
                else if (tvValue.contains("*")) {
                    val splitValue = tvValue.split("*")
                    var one = splitValue[0]
                    var two = splitValue[1]
                    var result = one.toDouble() * two.toDouble()

                    if (prefix.isNotEmpty()) {
                        one = prefix + one
                    }

                    tvInput?.text = removeZeroAfterDot(result.toString())
                }


            } catch (e: ArithmeticException) {
                e.printStackTrace()
            }
        }
    }

    private fun isOperatorAdded(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/")
                    || value.contains("*")
                    || value.contains("+")
                    || value.contains("-")
        }

    }
}