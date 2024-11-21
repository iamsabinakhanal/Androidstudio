package com.example.myapplication

import android.os.Bundle
import android.provider.ContactsContract
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import javax.security.auth.callback.PasswordCallback

class task1 : AppCompatActivity() {

    lateinit var Normal:TextView
    lateinit var Main: TextView
    lateinit var firstName: TextView
    lateinit var LastName: TextView
    lateinit var Email:TextView
    lateinit var Password: TextView
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task1)
        Normal=findViewById(R.id.textviewname)
        Main=findViewById(R.id.normalview)
        firstName=findViewById(R.id.firstnametext)
        LastName=findViewById(R.id.lastnametext)
        Email=findViewById(R.id.emailview)
        Password=findViewById(R.id.passwordtext)
        button=findViewById(R.id.button)

        Normal.updateLayoutParams<ViewGroup.MarginLayoutParams> {
            setMargins(32, 16, 32, 16)
        }

        button.setOnClickListener {
            val data: String = Normal.text.toString()
            Main.text = data
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

class textview {

}
