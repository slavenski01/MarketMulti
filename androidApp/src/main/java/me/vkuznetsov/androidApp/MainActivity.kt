package me.vkuznetsov.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.vkuznetsov.shared.Greeting
import android.widget.TextView
import me.vkuznetsov.androidApp.view.RestrictionView
import me.vkuznetsov.shared.restriction.RestrictionBehavior

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        RestrictionBehavior(findViewById<RestrictionView>(R.id.tv_restriction)).show()
    }
}
