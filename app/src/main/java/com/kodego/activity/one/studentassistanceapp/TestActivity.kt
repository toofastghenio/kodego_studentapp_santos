package com.kodego.activity.one.studentassistanceapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.kodego.activity.one.studentassistanceapp.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetName.setOnClickListener(){
//            Toast.makeText(applicationContext, "Hello from Toast", Toast.LENGTH_LONG).show()
            var name : String = binding.etvName.text.toString()
            binding.txtName.text = name
        }
    }

    private fun setContentView(root: ConstraintLayout) {

    }
}