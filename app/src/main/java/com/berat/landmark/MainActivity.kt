package com.berat.landmark

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  //data
    var landmarkNames=ArrayList<String>();
        landmarkNames.add("Pisa")
        landmarkNames.add("Colleseum")
        landmarkNames.add("Eiffel")
        landmarkNames.add("London Bridge")

        //image
        val Pisa=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pisa)
        val London=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ondon)
        val Eiffel=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.eyfeljpg)
        val Colleseum=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pisa)
var landmarkImages=ArrayList<Bitmap>();
        landmarkImages.add(Pisa);
        landmarkImages.add(London);
        landmarkImages.add(Eiffel);
        landmarkImages.add(Colleseum);

//adapter:Layout&Data
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)
        
listView.adapter=adapter;

        //tikladigimizda ne yapicagimizi buraya yaziyoruz
        listView.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->
val intent= Intent(applicationContext,DetayActivity::class.java)
            //hagisine tiklarsak position ile ikinci ekrana yollariz bilgileri
            intent.putExtra("name",landmarkNames[position])
            val singleton=Singleton.Selected;
            singleton.selectedImage=landmarkImages[position];
            startActivity(intent);

        }

    }
}