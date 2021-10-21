package com.example.thirdpartylibrary


import `is`.arontibo.library.ElasticDownloadView
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.skydoves.elasticviews.ElasticButton


//I'm use 2 third party library
//https://github.com/skydoves/ElasticViews
//https://github.com/Tibolte/ElasticDownload

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<View>(R.id.textView) as TextView
        val elasticButton = findViewById<View>(R.id.elasticbutton) as ElasticButton
        val elasticButton1 = findViewById<View>(R.id.elasticbutton1) as ElasticButton
        val mElasticDownloadView = findViewById<View>(R.id.elastic_download_view) as ElasticDownloadView
        var pro = 20F
        elasticButton.setOnClickListener {
            mElasticDownloadView.startIntro()
            mElasticDownloadView.setProgress(pro)
            pro+=20F
            if(pro == 100F) {
                mElasticDownloadView.success()
                textView.text = "Success download"
            }
        }

        elasticButton1.setOnClickListener {
            mElasticDownloadView.startIntro()
            mElasticDownloadView.setProgress(40F)
            mElasticDownloadView.fail()
            textView.text = "fail download"
        }


    }
}