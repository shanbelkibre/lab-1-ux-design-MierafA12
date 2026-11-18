package org.dbu.tuba_ethiopian

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BookDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}