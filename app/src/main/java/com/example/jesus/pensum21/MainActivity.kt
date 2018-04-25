package com.example.jesus.pensum21

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.jesus.pensum21.R.id.BTGenerar
import com.example.jesus.pensum21.R.id.txtCarreras
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    var Carreras = arrayOf("Ingeniería De Sistemas", "Ingeniería Industrial", "Ingeniería Civil")

    var spinner: Spinner? = null
    var textView_txtCarreras: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView_txtCarreras = this.txtCarreras

        spinner = this.SPCarreras
        spinner!!.setOnItemSelectedListener(this)

        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item,Carreras)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner!!.setAdapter(aa)
        BTGenerar.setOnClickListener{
            var carrera:String= txtCarreras.text.toString()
            val  intent: Intent = Intent(this, Pensum::class.java)
            var putExtra: Any = intent.putExtra("carrera", carrera)
            startActivity(intent)
        }
    }

    override fun onItemSelected(p0: AdapterView<*>, p1: View, position: Int, id: Long) {
        textView_txtCarreras!!.text = Carreras[position]
    }

    override fun onNothingSelected(p0: AdapterView<*>) {

    }
}
