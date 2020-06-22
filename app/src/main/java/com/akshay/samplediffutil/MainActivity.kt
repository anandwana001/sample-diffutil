package com.akshay.samplediffutil

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var ratingAdapter: RatingAdapter =  RatingAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setList()

        addbtn.setOnClickListener {
            ratingAdapter.setData(DataSource.ratingList2)
        }
    }

    private fun setList() {
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.itemAnimator = DefaultItemAnimator()
        recycler_view.adapter = ratingAdapter
        ratingAdapter.setData(DataSource.ratingList)
    }
}
