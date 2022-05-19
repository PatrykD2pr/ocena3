package com.example.zmianaobrazka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var img = findViewById<ImageView>(R.id.img)
        var napis = findViewById<TextView>(R.id.napis)

        var btnP = findViewById<Button>(R.id.prev)
        var btnN = findViewById<Button>(R.id.next)

        var alphaTxt = findViewById<EditText>(R.id.alphaTxt)
        var checkVis = findViewById<CheckBox>(R.id.vis)
        var checkAlp = findViewById<CheckBox>(R.id.alphaCheck)

        var obrazek = 1;



        btnN.setOnClickListener {
            if (obrazek == 1)
            {
                img.setImageResource(R.drawable.gold)
                obrazek = 2;
                napis.text = "Rank: Gold";
            }
            else if (obrazek == 2)
            {
                img.setImageResource(R.drawable.diamond)
                obrazek = 3;
                napis.text = "Rank: Diamond";
            }
            else if (obrazek == 3)
            {
                img.setImageResource(R.drawable.gm)
                obrazek = 4;
                napis.text = "Rank: Grand Master";
            }
            else if (obrazek == 4)
            {
                img.setImageResource(R.drawable.challenger)
                obrazek = 5;
                napis.text = "Rank: Challenger";
            }
            else if (obrazek == 5)
            {
                img.setImageResource(R.drawable.bronze)
                obrazek = 1;
                napis.text = "Rank: Bronze";
            }
        } //Set Next Image

        btnP.setOnClickListener {
            if (obrazek == 1)
            {
                img.setImageResource(R.drawable.challenger)
                obrazek = 5;
                napis.text = "Rank: Challenger";
            }
            else if (obrazek == 2)
            {
                img.setImageResource(R.drawable.bronze)
                obrazek = 1;
                napis.text = "Rank: Bronze";
            }
            else if (obrazek == 3)
            {
                img.setImageResource(R.drawable.gold)
                obrazek = 2;
                napis.text = "Rank: Gold";
            }
            else if (obrazek == 4)
            {
                img.setImageResource(R.drawable.diamond)
                obrazek = 3;
                napis.text = "Rank: Diamond";
            }
            else if (obrazek == 5)
            {
                img.setImageResource(R.drawable.gm)
                obrazek = 4;
                napis.text = "Rank: Grand Master";
            }


        } //Set Previous Image

        checkVis.setOnClickListener {
            if (checkVis.isChecked == true)
            {
                napis.alpha = 1F
                img.alpha = 0F
            }
            else
            {
                napis.alpha = 0F
                img.alpha = 1F
            }
        } //Set Visibility

        checkAlp.setOnClickListener {

            var imgAlp = 1F

            if (checkAlp.isChecked == true)
            {
                if (alphaTxt.text.toString() == null || alphaTxt.text.toString() == "") img.alpha = imgAlp
                else
                {
                    var alpha = alphaTxt.text.toString()
                    img.alpha = alpha.toFloat();

                }
            }
            else if (checkAlp.isChecked == false)
            {
                img.alpha = 1F
            }
            else img.alpha = 1F
        }
    }
}