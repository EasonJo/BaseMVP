package com.eason.common.adapter

import android.view.View
import com.eason.common.R
import com.eason.common.entity.Person
import com.eason.commonlib.adapter.AbstractAdapter
import kotlinx.android.synthetic.main.itemview.view.*

/**
 * BaseAdapter的封装使用.
 * Created by Eason on 2017/12/6.
 */
class PersonAdapter(data: MutableList<Person>) : AbstractAdapter<Person>(data, R.layout.itemview) {
    override fun onViewRecycled(itemView: View) {
    }

    override fun onItemClick(itemView: View, itemPosition: Int) {
    }

    override fun View.bind(item: Person) {
        name.text = item.name
        age.text = item.age.toString()
    }

}