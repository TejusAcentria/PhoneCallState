package com.phonecallstate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var mainActivityRunningInstance: MainActivity? = null
    fun getInstace(): MainActivity? {
        return mainActivityRunningInstance
    }

    fun updateUI(str: String) {
        this@MainActivity.runOnUiThread {
            //use findFragmentById for fragments defined in XML ((SimpleFragment)getSupportFragmentManager().findFragmentByTag(fragmentTag)).updateUI(str);
            textView.text = str
        }
    }


    var phoneCallState: PhoneCallState? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivityRunningInstance = this
    }

}
