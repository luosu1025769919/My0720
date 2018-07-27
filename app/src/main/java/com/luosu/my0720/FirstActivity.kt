package com.luosu.my0720

import android.Manifest
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.yanzhenjie.permission.AndPermission
import android.Manifest.permission
import com.yanzhenjie.permission.Permission


class FirstActivity : AppCompatActivity() {
    internal lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        AndPermission.with(this).runtime().permission(Manifest.permission.INTERNET).start()

        img = findViewById(R.id.img) as ImageView
        var url= "http://img5.duitang.com/uploads/blog/201405/13/20140513135700_FYvXz.thumb.700_0.jpeg";
        Handler().postDelayed(Runnable {
            Glide.with(this@FirstActivity).load(url).into(img)

        },2000)

    }
}
