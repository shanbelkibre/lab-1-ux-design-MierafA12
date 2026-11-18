package org.dbu.tuba_ethiopian

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var tvHeaderTitle: TextView
    private lateinit var fragmentContainer: FrameLayout
    private lateinit var navStore: LinearLayout
    private lateinit var navMyBooks: LinearLayout
    private lateinit var navListening: LinearLayout
    private lateinit var navReading: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tvHeaderTitle = findViewById(R.id.tvHeaderTitle)
        fragmentContainer = findViewById(R.id.fragmentContainer)
        navStore = findViewById(R.id.navStore)
        navMyBooks = findViewById(R.id.navMyBooks)
        navListening = findViewById(R.id.navListening)
        navReading = findViewById(R.id.navReading)

        findViewById<ImageView>(R.id.btnHeaderSearch).setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        navStore.setOnClickListener { selectTab(0) }
        navMyBooks.setOnClickListener { selectTab(1) }
        navListening.setOnClickListener { selectTab(2) }
        navReading.setOnClickListener { selectTab(3) }

        // Initial view setup
        selectTab(0)
    }

    private fun selectTab(index: Int) {
        val activeBg = Color.parseColor("#26C6DA")
        val inactiveBg = Color.TRANSPARENT

        navStore.setBackgroundColor(if (index == 0) activeBg else inactiveBg)
        navMyBooks.setBackgroundColor(if (index == 1) activeBg else inactiveBg)
        navListening.setBackgroundColor(if (index == 2) activeBg else inactiveBg)
        navReading.setBackgroundColor(if (index == 3) activeBg else inactiveBg)

        fragmentContainer.removeAllViews()
        val inflater = LayoutInflater.from(this)

        when (index) {
            0 -> {
                tvHeaderTitle.text = getString(R.string.title_store)
                val storeView = inflater.inflate(R.layout.fragment_store, fragmentContainer, false)
                setupStoreClickListeners(storeView)
                fragmentContainer.addView(storeView)
            }
            1 -> {
                tvHeaderTitle.text = getString(R.string.title_my_books)
                val view = inflater.inflate(R.layout.fragment_my_books, fragmentContainer, false)
                fragmentContainer.addView(view)
            }
            2 -> {
                tvHeaderTitle.text = getString(R.string.title_listening)
                val view = inflater.inflate(R.layout.fragment_listening, fragmentContainer, false)
                fragmentContainer.addView(view)
            }
            3 -> {
                tvHeaderTitle.text = getString(R.string.title_reading)
                val view = inflater.inflate(R.layout.fragment_reading, fragmentContainer, false)
                fragmentContainer.addView(view)
            }
        }
    }

    private fun setupStoreClickListeners(view: View) {
        val recentContainer = view.findViewById<LinearLayout>(R.id.llRecentBooksContainer)
        if (recentContainer != null) {
            for (i in 0 until recentContainer.childCount) {
                recentContainer.getChildAt(i).setOnClickListener {
                    startActivity(Intent(this, BookDetailActivity::class.java))
                }
            }
        }
        val popularContainer = view.findViewById<LinearLayout>(R.id.llPopularBooksContainer)
        if (popularContainer != null) {
            for (i in 0 until popularContainer.childCount) {
                popularContainer.getChildAt(i).setOnClickListener {
                    startActivity(Intent(this, BookDetailActivity::class.java))
                }
            }
        }
    }
}