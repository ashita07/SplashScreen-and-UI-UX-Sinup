package com.example.splashscreen1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        //question mark (?) is used in kotlin to save from null pointer exception as in java
        //if support action bar does not exist then it does not show error
        Handler().postDelayed({
           val intent = Intent(this,Signup::class.java)
            startActivity(intent)
        } ,3000 )
    }
}
//to create splash screen
/* Handler().postDelayed({
  val intent=Intent(this,SplashScreen2::class.java)
  startActivity(intent)
  }3000)
*/
