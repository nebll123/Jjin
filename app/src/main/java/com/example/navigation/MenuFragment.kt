package com.example.navigation

import android.content.ClipData.newIntent
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_menu.*
import android.content.Intent as Intent1

class MenuFragment : Fragment() {

    companion object {

        const val TAG: String = "로그"

        fun newInstance(): MenuFragment {
            return MenuFragment()
        }

    }

    //메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "MenuFragment - onCreate:() called")
    }

    //프레그먼트를 안고있는 엑티비티에 붙었을때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "MenuFragment - onCreate:() called")
    }

    //뷰가 생성되었을때
    //프레그먼트와 레이아웃을 연결시켜주는 부분이다.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "MenuFragment - onCreate:() called")
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        return view
    }

    lateinit var noticeButton: Button
    lateinit var gameButton: Button
    lateinit var foodButton: Button
    lateinit var boardButton: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        noticeButton = view.findViewById(R.id.btn_notice)
        gameButton = view.findViewById(R.id.btn_game)
        foodButton = view.findViewById(R.id.btn_schoolmeal)
        boardButton = view.findViewById(R.id.btn_freeboard)

        noticeButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                var intent = Intent1(
                    Intent1.ACTION_VIEW, Uri.parse("https://www.mjc.ac.kr/bbs/data/list.do?menu_idx=66")
                )
                startActivity(intent)
            }
        })

//        gameButton.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(p0: View?) {
//
//                val game = Intent1(this, Randomgame::class.java)
//                game.putExtra("answer", "this is the answer")asdasd
//                startActivity(game)
//            }
//
//    })
        foodButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                var food = Intent1(
                    Intent1.ACTION_VIEW, Uri.parse("https://www.mjc.ac.kr/ibuilder.do?menu_idx=278&sso=ok")
                )
                startActivity(food)
            }
        })
        boardButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                var food = Intent1(
                    Intent1.ACTION_VIEW, Uri.parse("https://everytime.kr/")
                )
                startActivity(food)
            }
        })
}
    }








