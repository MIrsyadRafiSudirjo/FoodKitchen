package com.example.foodkitchen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class FoodDetail : AppCompatActivity(), View.OnClickListener {

    companion object{
        const val SEE_NAMES ="see_names"
        const val SEE_PRICES ="see_prices"
        const val SEE_DETAILS ="see_details"
        const val SEE_PHOTOS = "see_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)


        val tvDataReceivedName: TextView = findViewById(R.id.detail_food_name)
        val tvDataReceivedPrice: TextView = findViewById(R.id.detail_food_price)
        val tvDataReceivedDetail: TextView = findViewById(R.id.detail_food_detail)
        val imgDataReceivedImg: ImageView = findViewById(R.id.img_detail_photo)



        val name = intent.getStringExtra(SEE_NAMES)
        val prices = intent.getStringExtra(SEE_PRICES)
        val details = intent.getStringExtra(SEE_DETAILS)
        val photo = intent.getIntExtra(SEE_PHOTOS,0)

        tvDataReceivedName.text= name
        tvDataReceivedPrice.text= prices
        tvDataReceivedDetail.text= details
        imgDataReceivedImg.setImageResource(photo)

        val btnOrder: Button = findViewById(R.id.btn_order)
        btnOrder.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_order->{
                Toast.makeText(this, "Food Ordered", Toast.LENGTH_SHORT).show()
            }
        }
    }
}