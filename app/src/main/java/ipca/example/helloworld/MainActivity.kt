package ipca.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val textViewHello : TextView =  TextView(this)
        val button = Button(this)
        val linearLayout = LinearLayout(this)

        textViewHello.text = "Olá Mundo!"
        button.text = "Traduzir"

        linearLayout.addView(textViewHello)
        linearLayout.addView(button)


        button.setOnClickListener {
            textViewHello.text = "Hello World!"
        }


        setContentView(linearLayout)

    }
}