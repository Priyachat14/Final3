package com.example.quizapp

object  Constants{

    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Question>{
        val questionsList = java.util.ArrayList<Question>()

        val que1 = Question(1,"OSI Layer มีทั้งหมดกี่ Layer",
        R.drawable.img1,
            "5 Layer",
            "6 Layer",
            "7 Layer",
            "8 Layer",
            3
        )
        questionsList.add(que1)

        val que2 = Question(
                2, "จงเรียงลำดับขนาดของเครือข่าย",
                R.drawable.img2,
                "LAN MAN WAN",
                "LAN WAN MAN",
                "WAN MAN LAN",
                "WAN LAN MAN",
                1
        )
        questionsList.add(que2)

        val que3 = Question(3,"Address ของ IPv4 กับ IPv6 แตกต่างกันเท่าไหร่",
            R.drawable.img3,
            "1 เท่า",
            "2 เท่า",
            "3 เท่า",
            "4 เท่า",
            4
        )
        questionsList.add(que3)

        val que4 = Question(4,"1 + 2 x 3 - 4 ÷ 4 = ??",
            R.drawable.img4,
            "4",
            "5",
            "6",
            "7",
            3
        )
        questionsList.add(que4)

        val que5 = Question(5,"IP Address 192.168.1.21/24 จัดเป็น IP คลาสใด",
            R.drawable.img5,
            "Class A",
            "Class B",
            "Class C",
            "Class D",
            3
        )
        questionsList.add(que5)


        return questionsList
    }

}