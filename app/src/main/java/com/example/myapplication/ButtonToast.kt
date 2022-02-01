package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.view.Gravity
import android.view.View;
import android.widget.*
import android.widget.RadioButton




class ButtonToast : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_toast)

        var genderradioButton: RadioButton
        val btn_click_me = findViewById(R.id.button) as Button
        val btn_custom_layout = findViewById<Button>(R.id.button1)
        val submit = findViewById<Button>(R.id.submit)

        val imagebutton = findViewById<ImageButton>(R.id.weversebutton)

        val pizza = findViewById<CheckBox>(R.id.checkBox1)
        val coffee = findViewById<CheckBox>(R.id.checkBox2)

        val get = findViewById<Button>(R.id.get)
        val switch = findViewById<Switch>(R.id.switch1)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val gender = findViewById<Button>(R.id.getgender)

        btn_click_me.setOnClickListener() {
            Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
        }

        val toggle = findViewById<ToggleButton>(R.id.toggle)
        toggle.setOnCheckedChangeListener { buttonview, isChecked ->
            Toast.makeText(this, if(isChecked) "ON" else "OFF", Toast.LENGTH_SHORT).show()
        }

        /*val layout = layoutInflater.inflate(R.layout.custom_toast,linearLayout)
        btn_custom_layout.setOnClickListener()
        {
            val myToast = Toast(applicationContext)
            myToast.duration = Toast.LENGTH_LONG
            myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            myToast.view = layout
            myToast.show()
        }*/

        imagebutton.setOnClickListener(){
            Toast.makeText(this, "image button clicked", Toast.LENGTH_LONG).show()
        }
        submit.setOnClickListener() {
            if (coffee.isChecked && pizza.isChecked) {
                Toast.makeText(this, "pizza and cofee is checked", Toast.LENGTH_LONG).show()
            }
           else if (pizza.isChecked) {
                Toast.makeText(this, "pizza is checked", Toast.LENGTH_LONG).show()
            }
           else if (coffee.isChecked) {
                Toast.makeText(this, "cofee is checked", Toast.LENGTH_LONG).show()
            }

        }

        get.setOnClickListener() {
            if (switch.isChecked())
                Toast.makeText(this, "switch is on", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "switch is off", Toast.LENGTH_LONG).show()
        }

        gender.setOnClickListener(){
            val selectedId = radioGroup.checkedRadioButtonId
            genderradioButton = findViewById<View>(selectedId) as RadioButton
            if(selectedId==-1){
                Toast.makeText(this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        }
    }

}