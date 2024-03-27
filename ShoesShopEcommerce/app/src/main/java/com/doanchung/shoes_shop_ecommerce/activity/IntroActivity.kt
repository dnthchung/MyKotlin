package com.doanchung.shoes_shop_ecommerce.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.doanchung.shoes_shop_ecommerce.R
import com.doanchung.shoes_shop_ecommerce.databinding.ActivityIntroBinding

class IntroActivity : BaseActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_intro)

        binding.startBtn.setOnClickListener {
            startActivity(
                Intent(
                    this@IntroActivity, MainActivity::class.java
                )
            )
        }

    }
}