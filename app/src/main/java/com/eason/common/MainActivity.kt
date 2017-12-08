package com.eason.common

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.eason.common.adapter.PersonAdapter
import com.eason.common.entity.Person
import kotlinx.android.synthetic.main.activity_main.*

/**
 * recycleView Demo.
 */
class MainActivity : AppCompatActivity() {

    private val persons: MutableList<Person> by lazy {
        arrayListOf(Person("Eason", 32), Person("AAA", 22), Person("BBB", 22)
                , Person("DDD", 34))
    }
//    private val persons = arrayListOf(Person("Eason", 32), Person("AAA", 22), Person("BBB", 22)
//            , Person("DDD", 34))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val personAdapter = PersonAdapter(persons)
        recyclerView.adapter = personAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        button.setOnClickListener {
            personAdapter.add(Person("Eason too", 32))
            //personAdapter.remove(0)

            Toast.makeText(this,"click",Toast.LENGTH_LONG).show()
        }
    }

}
