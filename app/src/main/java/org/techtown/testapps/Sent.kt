package org.techtown.testapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView

class Sent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sent)
        val sentenceList = mutableListOf<String>()
        sentenceList.add("인생은 언제나 힘들다")
        sentenceList.add("하지만 살다보면 좋은 일이 올수도있다")
        sentenceList.add("그때를 위해 살아가는거다.")
        sentenceList.add("자신의 꿈을위해 살아가는것")
        sentenceList.add("그것은 너무 매력적이다.")
        sentenceList.add("나는 이룰수밖에없다.")
        sentenceList.add("절대 포기하지마라.")
        sentenceList.add("포기는 죽음, 그걸로 끝이다.")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")
        sentenceList.add("그옛날 당신은 무엇이 되고싶었나요?")



         val sentAdapter = ListViewApater(sentenceList)
        Log.e("###### Sent.kt  ","sentAdapter : "+sentAdapter.toString())
        val listView = findViewById<ListView>(R.id.sentView)

        //여기에서 BaseAdapter()를 실행시키네;
        listView.adapter = sentAdapter

    }
}