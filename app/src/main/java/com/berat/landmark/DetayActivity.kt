package com.berat.landmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)
        val intent =intent;
        var landmarkName=intent.getStringExtra("name");
        textView.text=landmarkName
        val singleton=Singleton.Selected;
        val selectedImage=singleton.selectedImage;
        imageView.setImageBitmap(selectedImage);
    }
}