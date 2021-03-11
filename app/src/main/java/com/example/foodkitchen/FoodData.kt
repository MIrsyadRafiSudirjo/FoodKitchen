package com.example.foodkitchen

object FoodData {
    private val foodNames = arrayOf(
            "Choco Pudding",
            "Crepes",
            "Guacamole Chicken",
            "Heart Cake",
            "Honey Chicken Lemon",
            "Mash Potato Chicken",
            "Oregano Chicken",
            "Oreo Pudding",
            "Pasta Chicken",
            "Pistachio")

    private val foodPrice = arrayOf(
            "Rp.100.0000",
            "Rp.35.000",
            "Rp.65.000",
            "Rp.50.000",
            "Rp.75.000",
            "Rp.95.000",
            "Rp.88.000",
            "Rp.110.000",
            "Rp.125.000",
            "Rp.45.000")


    private val foodDetails = arrayOf(
            "Delicious Chololate Pudding with vanilla milk to complement",
            "Grannys favorite recipe ,enjoy our crepes with banana and chocolate",
            "Sauteed chicken breast topped with cheese and guacamole sauce.",
            "Enjoy perfectly shaped heart cake. give it  to your loved one. ",
            "Refreshing chicken with lemon and herbs, the foods that make you healthier",
            "Family favorite food, our favorite mash potato with chicken",
            "Chicken with oregano herbs make your days a lot better",
            "Our specialty Oreo Pudding makes you carves for more",
            "The famous pasta chicken melting in your mouth when eaten",
            "Pistachio cream and brownies our new yet popular menu")

    private val foodImages = intArrayOf(
            R.drawable.chocopudding,
            R.drawable.crepes,
            R.drawable.guacamolechicken,
            R.drawable.heartcake,
            R.drawable.honeychickenlemon,
            R.drawable.mashpotatochicken,
            R.drawable.oreganochicken,
            R.drawable.oreopudding,
            R.drawable.pastachicken,
            R.drawable.pistachio)

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.price = foodPrice[position]
                food.detail = foodDetails[position]
                food.photo = foodImages[position]
                list.add(food)
            }
            return list
        }
}