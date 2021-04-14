package com.example.hrybkov_mod1

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(context: Context, private val elementsList: List<ListItem>): BaseAdapter() {


    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return elementsList.size
    }

    override fun getItem(position: Int): Any {
        return elementsList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.list_view_items, parent, false)

        val titleView = rowView.findViewById<TextView>(R.id.item_title)
        val quantityView = rowView.findViewById<TextView>(R.id.item_quantity)
        val itemImage = rowView.findViewById<ImageView>(R.id.ivItemImage)

        val resource = getItem(position) as ListItem

        titleView.text = resource.title
        quantityView.text = resource.quantity
        itemImage.setImageResource(resource.image)

        return rowView
    }

}