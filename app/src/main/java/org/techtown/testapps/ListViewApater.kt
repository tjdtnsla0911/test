package org.techtown.testapps

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewApater(val List: MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {

        return List.size
    }


    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        Log.e("## 컨벌트 getView의 getView에옴  = ","p0 = "+p0.toString())
        var convertView = p1 //View를 넣자
        if(p1 == null){
//            Log.e("## 컨벌트 getView의 View(p1) = ",p1.toString())
            //LayoutInflater는 XML에 정의된 Resource를 VIew객체로 반환해준다.
            convertView = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item,p2,false)
            Log.e("## 컨벌트 getView의 convertView = ",convertView.toString())
        }
        var listViewText = convertView?.findViewById<TextView>(R.id.ListViewTextArea)
            listViewText!!.text = List[p0]

        return convertView!!


    }


}