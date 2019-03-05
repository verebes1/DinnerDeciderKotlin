package com.adprogress.dinnerdecider_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val foodsToChooseFrom = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addFoodTapped(view: View) {
        if (addFoodEditText.text.count() > 1) {
            foodsToChooseFrom.add(addFoodEditText.text.toString())
            addFoodEditText.text.clear()
        }
    }

    fun decideTapped(view: View) {
        if (foodsToChooseFrom.count() > 0) {
            selectedFoodTextView.text = foodsToChooseFrom[Random.nextInt(foodsToChooseFrom.count())]
        } else {
            selectedFoodTextView.text = "Add some dishes :)"
        }
    }
}
