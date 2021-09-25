package org.techtown.testapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import org.techtown.testapps.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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



        for (i in 0..(sentenceList.size-1)){
           Log.e("#####","뱉어라  i="+i+" 이고 sentenceList = "+sentenceList[i])
        }

        //랜덤값을 가져온다

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.showButton.setOnClickListener{
            println("showButton클릭")
            var intent = Intent(this,Sent::class.java)
            Toast.makeText(this,"명언버튼클릭!",Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        if(sentenceList.random() is String){
            println("##################@@@@@@@@@@@@@@@@@@@@@@@@@@")
        }

        binding.goodWordTestArea.setText(sentenceList.random())

    }
}