package com.example.foodkitchen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvFoods = findViewById(R.id.rv_foods)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerList()
    }



    private fun showRecyclerList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListFoodAdapter(list)
        rvFoods.adapter = listHeroAdapter


        listHeroAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                showSelectedHero(data)
            }
        })

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun showSelectedHero(food: Food) {

        val moveWithDataIntent = Intent(this@MainActivity, FoodDetail::class.java)
        moveWithDataIntent.putExtra(FoodDetail.SEE_NAMES, food.name)
        moveWithDataIntent.putExtra(FoodDetail.SEE_PRICES, food.price)
        moveWithDataIntent.putExtra(FoodDetail.SEE_DETAILS, food.detail)
        moveWithDataIntent.putExtra(FoodDetail.SEE_PHOTOS, food.photo)
        startActivity(moveWithDataIntent)


//        Toast.makeText(this, "Kamu memilih " + food.name, Toast.LENGTH_SHORT).show()
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_profile -> {
                val moveIntent = Intent(this@MainActivity, MoveProfile::class.java)
                startActivity(moveIntent)
            }
        }
    }
}