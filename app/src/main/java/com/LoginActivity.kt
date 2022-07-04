package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import com.example.projectkara.R
import com.example.projectkara.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var name: String
    private lateinit var username: String
    private lateinit var age: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSign.setOnClickListener {
            getname()
            if (checkname()) {
                getname()
                if(checkusername()){
                    getage()
                    if (checkage()){

                    }
                }
            }


        }
        Toast.makeText(this, "cofirmmm", Toast.LENGTH_SHORT).show()


    }

    private fun getname() {
        name = binding.hintName.toString()
    }

    private fun getUserName() {
        username = binding.hintUsername.toString()
    }

    private fun getage() {
        age = binding.hintAge.toString()
    }

    private fun checkname():Boolean{
        if (name.equals("")) {
            Toast.makeText(this, "name is empty", Toast.LENGTH_SHORT).show()
            return false
        }
        else{
            if(name.length>6){
                Toast.makeText(this, "name is true", Toast.LENGTH_SHORT).show()
                return true
            }else
                Toast.makeText(this, "name is false", Toast.LENGTH_SHORT).show()
            return false
        }

    }
    private fun checkusername():Boolean{
        if (username.equals("")) {
            Toast.makeText(this, "username is empty", Toast.LENGTH_SHORT).show()
            return false
        }
        else{
            if(username.length>6){
                Toast.makeText(this, "username is true", Toast.LENGTH_SHORT).show()
                return true
            }else
                Toast.makeText(this, "username is false", Toast.LENGTH_SHORT).show()
            return false
        }

    }
    private fun checkage():Boolean{
        if (age.equals("")) {
            Toast.makeText(this, "age is empty", Toast.LENGTH_SHORT).show()
            return false
        }
        else{
            if(age.length>6){
                Toast.makeText(this, "age is true", Toast.LENGTH_SHORT).show()
                return true
            }else
                Toast.makeText(this, "age is sss false", Toast.LENGTH_SHORT).show()
            return false
        }

    }

}









