package com.example.nikhil.customisingactionbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView

lateinit var tv:TextView

class MainActivity : AppCompatActivity() {


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var menuInflator:MenuInflater=menuInflater
        menuInflator.inflate(R.menu.main_menu,menu)


        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {             //   this fun runs when any Iten Is Selected

        when(item.itemId){                                                    // switch = when in kotlin

            R.id.settings->tv.text="setting is selected"                 // case

            R.id.info->tv.text="Created by Ankush"                      // case



        }


        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tv=findViewById(R.id.tv)                  // link tv to Text View named tv
    }

}


// 1:  goto.          app    >   res
// right click on .   res    >   new  >  directory     > give any name like   'menu'  (without quotes)
// right click on .   menu   >   new  > menu resource  > type  main_menu              (any name)

   // 2 : add item to main_menu.xml
   //  and use above code.