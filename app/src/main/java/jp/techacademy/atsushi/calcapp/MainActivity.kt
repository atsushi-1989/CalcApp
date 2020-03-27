package jp.techacademy.atsushi.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        var value: String = ""
        var foundError: Int = 0

        val num1 = editText1.text.toString()
        val num2 = editText2.text.toString()

        if (num1 == "" || num2 == "") {
            textView1.text = "何か数値を入力してください"
        } else {

            when (v?.id) {
                R.id.button1 -> {
                    try {
                        value = (num1.toFloat() + num2.toFloat()).toString()

                    } catch (e: Exception) {
                        textView1.text = "※数値を入力してください"
                        foundError++

                    } finally {
                        if (foundError == 0) {
                            val intent = Intent(this, SecondActivity::class.java)
                            intent.putExtra("VALUE", value)
                            startActivity(intent)
                            textView1.text = ""
                        } else {
                            editText1.setText("")
                            editText2.setText("")
                        }
                    }
                }

                R.id.button2 -> {

                    try {
                        value = (num1.toFloat() - num2.toFloat()).toString()

                    } catch (e: Exception) {
                        textView1.text = "※数値を入力してください"
                        foundError++

                    } finally {
                        if (foundError == 0) {
                            val intent = Intent(this, SecondActivity::class.java)
                            intent.putExtra("VALUE", value)
                            startActivity(intent)
                            textView1.text = ""
                        } else {
                            editText1.setText("")
                            editText2.setText("")
                        }
                    }
                }


                R.id.button3 -> {

                    try {
                        value = (num1.toFloat() * num2.toFloat()).toString()

                    } catch (e: Exception) {
                        textView1.text = "※数値を入力してください"
                        foundError++

                    } finally {
                        if (foundError == 0) {
                            val intent = Intent(this, SecondActivity::class.java)
                            intent.putExtra("VALUE", value)
                            startActivity(intent)
                            textView1.text = ""
                        } else {
                            editText1.setText("")
                            editText2.setText("")
                        }
                    }
                }


                R.id.button4 -> {

                    try {
                        value = (num1.toFloat() / num2.toFloat()).toString()

                    } catch (e: Exception) {
                        textView1.text = "※数値を入力してください"
                        foundError++

                    } finally {
                        if (foundError == 0) {
                            val intent = Intent(this, SecondActivity::class.java)
                            intent.putExtra("VALUE", value)
                            startActivity(intent)
                            textView1.text = ""
                        } else {
                            editText1.setText("")
                            editText2.setText("")
                        }
                    }
                }
            }
        }
    }
}
