package com.akshay.samplediffutil

import android.util.Log
import androidx.recyclerview.widget.DiffUtil

/**
 * Created by akshaynandwana on
 * 22, June, 2020
 **/

class RecyclerDataDiffCallback<T>(var oldList: List<T>, var newList: List<T>) :
    DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

        Log.d("DiffData", "areItemsTheSame - "+
                "\n oldList[oldItemPosition] - " + oldList[oldItemPosition]
                +
                "\n newList[newItemPosition] - " + newList[newItemPosition]
                +
                (oldList[oldItemPosition] == newList.get(newItemPosition)).toString()
        )

        return oldList[oldItemPosition]!!.equals(newList[newItemPosition])
    }

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

        Log.d("DiffData", "areContentsTheSame - "+
                "\n oldList[oldItemPosition] - " + oldList[oldItemPosition]
                +
                "\n newList[newItemPosition] - " + newList[newItemPosition]
                +
                (oldList[oldItemPosition] == newList.get(newItemPosition)).toString()
        )

        return oldList[oldItemPosition]!!.equals(newList[newItemPosition])
    }
}