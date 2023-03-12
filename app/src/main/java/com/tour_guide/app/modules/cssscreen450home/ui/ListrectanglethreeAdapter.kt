package com.tour_guide.app.modules.cssscreen450home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tour_guide.app.R
import com.tour_guide.app.databinding.RowListrectanglethreeBinding
import com.tour_guide.app.modules.cssscreen450home.`data`.model.ListrectanglethreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglethreeAdapter(
  var list: List<ListrectanglethreeRowModel>
) : RecyclerView.Adapter<ListrectanglethreeAdapter.RowListrectanglethreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglethreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglethree,parent,false)
    return RowListrectanglethreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglethreeVH, position: Int) {
    val listrectanglethreeRowModel = ListrectanglethreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglethreeRowModel = list[position]
    holder.binding.listrectanglethreeRowModel = listrectanglethreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglethreeRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListrectanglethreeRowModel
    ) {
    }
  }

  inner class RowListrectanglethreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglethreeBinding = RowListrectanglethreeBinding.bind(itemView)
  }
}
