package com.example.recyclerviewappkt

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var arr = ArrayList<Model>()

        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))
        arr.add(Model(R.drawable.ic_launcher_foreground,"A","1"))

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(this,4)

        var adapter = Adapter(this,arr)

        recyclerView.adapter = adapter
    }
}