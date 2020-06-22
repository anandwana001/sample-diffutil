package com.akshay.samplediffutil

/**
 * Created by akshaynandwana on
 * 22, June, 2020
 **/

object DataSource {

    val ratingList: List<Rating>
        get() {
            val ratings = ArrayList<Rating>()
            ratings.add(Rating(1, 10, "Android"))
            ratings.add(Rating(2, 12, "Google"))
            ratings.add(Rating(3, 5, "Apple"))
            return ratings
        }

    val ratingList2: List<Rating>
        get() {
            val ratings = ArrayList<Rating>()
            ratings.add(Rating(1, 10, "Android"))
            ratings.add(Rating(2, 12, "Google"))
            ratings.add(Rating(1, 1, "Redmi"))
            return ratings
        }
}

data class Rating(val rateIndex: Int, val ratingValue: Int, val name: String)