package com.androidCourse.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Pizza", "Chicken", "Desert", "Cup Cake")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jop = "Developer"

        //whenever the "DECIDE!" button is pressed the between brackets will happen

       decideButton.setOnClickListener{
           //val random = Random()
           val randomFood = Random.nextInt(foodList.count()) //get random number between 0 to max of foodList array.
           selectedFoodTxt.text = foodList[randomFood]  // the text will be the element in foodList array of random index.
        }

        //whenever the "ADD NEW FOOD..." button is pressed the between brackets will happen
        addedFoodButton.setOnClickListener{
           val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()  // this text be cleared after added to foodList arrayList to be ready to inset new food.
            println(foodList)
        }
    }
}
