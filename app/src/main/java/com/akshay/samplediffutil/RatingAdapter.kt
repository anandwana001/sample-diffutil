package com.akshay.samplediffutil

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by akshaynandwana on
 * 22, June, 2020
 **/

class RatingAdapter : RecyclerView.Adapter<RatingAdapter.ViewHolder>() {

    private val ratings = ArrayList<Rating>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_rating, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rating = ratings[position]
        Log.d("DiffData", "\n onBindViewHolder called")
        holder.name_text.text = rating.name
    }

    fun setData(newRating: List<Rating>) {
        /*val diffCallback = RatingDiffCallback(ratings, newRating)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        ratings.clear()
        ratings.addAll(newRating)
        diffResult.dispatchUpdatesTo(this)
*/
        val result = DiffUtil.calculateDiff(
            RecyclerDataDiffCallback(
                ratings, newRating
            ), false
        )
        ratings.clear()
        ratings.addAll(newRating)
        result.dispatchUpdatesTo(this)
    }

    override fun getItemCount(): Int {
        return ratings.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name_text: TextView = itemView.findViewById(R.id.name_text)

    }
}
