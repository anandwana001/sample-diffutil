package com.akshay.samplediffutil

import android.util.Log
import androidx.recyclerview.widget.DiffUtil

/**
 * Created by akshaynandwana on
 * 22, June, 2020
 **/

class RatingDiffCallback(private val oldList: List<Rating>, private val newList: List<Rating>) :
    DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        Log.d("DiffData", "areItemsTheSame - "+
                "\n oldList[oldItemPosition].rateIndex - " + oldList[oldItemPosition].rateIndex
                +
                "\n newList[newItemPosition].rateIndex - " + newList[newItemPosition].rateIndex
                +
                (oldList[oldItemPosition].rateIndex == newList.get(newItemPosition).rateIndex).toString()
        )
        return oldList[oldItemPosition].rateIndex == newList.get(newItemPosition).rateIndex
    }

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        val (_, value, name) = oldList[oldPosition]
        val (_, value1, name1) = newList[newPosition]


        Log.d("DiffData", "areContentsTheSame - "+
                "\n name - " + name
                +
                "\n name1 - " + name1
                +
                "\n value - " + value
                +
                "\n value1 - " + value1
                +
                (name == name1).toString() + " - "+(value == value1).toString()
        )

        return name == name1 && value == value1
    }

    override fun getChangePayload(oldPosition: Int, newPosition: Int): Any? {
        return super.getChangePayload(oldPosition, newPosition)
    }
}