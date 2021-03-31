package com.example.quizapp

object  Constants{

    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Question>{
        val questionsList = java.util.ArrayList<Question>()

        val que1 = Question(1,"What country doest this flag belong to?",
        R.drawable.ic_thai,
            "Thai",
            "China",
            "Austria",
            "South Korea",
            1
        )
        questionsList.add(que1)

        val que2 = Question(2,"What country doest this flag belong to?",
            R.drawable.ic_china,
            "South Korea",
            "China",
            "Austria",
            "Malaysia",
            2
        )
        questionsList.add(que2)

        val que3 = Question(3,"What country doest this flag belong to?",
            R.drawable.ic_america,
            "North Korea",
            "America",
            "Austria",
            "Thai",
            2
        )
        questionsList.add(que3)

        val que4 = Question(4,"What country doest this flag belong to?",
            R.drawable.ic_australia,
            "Malaysia",
            "China",
            "Australia",
            "Armenia",
            3
        )
        questionsList.add(que4)

        val que5 = Question(5,"What country doest this flag belong to?",
            R.drawable.ic_malaysia,
            "America",
            "China",
            "Austria",
            "Malaysia",
            4
        )
        questionsList.add(que5)

        val que6 = Question(6,"What country doest this flag belong to?",
            R.drawable.ic_japan,
            "NewZealand",
            "China",
            "japan",
            "Thai",
            3
        )
        questionsList.add(que6)

        val que7 = Question(7,"What country doest this flag belong to?",
            R.drawable.ic_newzealand,
            "Newzealand",
            "America",
            "Austria",
            "China",
            1
        )
        questionsList.add(que7)

        val que8 = Question(8,"What country doest this flag belong to?",
            R.drawable.ic_northkorea,
            "Thai",
            "North Korea",
            "South Korea",
            "Armenia",
            2
        )
        questionsList.add(que8)

        val que9 = Question(9,"What country doest this flag belong to?",
            R.drawable.ic_singapore,
            "Newzealand",
            "china",
            "America",
            "Singapore",
            4
        )
        questionsList.add(que9)

        val que10 = Question(10,"What country doest this flag belong to?",
            R.drawable.ic_southkorea,
            "Singapore",
            "Newzealand",
            "North Korea",
            "South Korea",
            4
        )

        questionsList.add(que10)




        return questionsList
    }

}