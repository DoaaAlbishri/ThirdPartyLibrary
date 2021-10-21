package com.example.thirdpartylibrary


import `is`.arontibo.library.ElasticDownloadView
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.skydoves.elasticviews.ElasticButton


//I'm use 2 third party library
//https://github.com/skydoves/ElasticViews
//https://github.com/Tibolte/ElasticDownload

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val elasticButton = findViewById<View>(R.id.elasticbutton) as ElasticButton
        val elasticButton1 = findViewById<View>(R.id.elasticbutton1) as ElasticButton
        val mElasticDownloadView = findViewById<View>(R.id.elastic_download_view) as ElasticDownloadView

        elasticButton.setOnClickListener {
            mElasticDownloadView.startIntro()
            mElasticDownloadView.success()
        }

        elasticButton1.setOnClickListener {
            mElasticDownloadView.startIntro()
            mElasticDownloadView.setProgress(40F)
            mElasticDownloadView.fail()
        }


    }
}