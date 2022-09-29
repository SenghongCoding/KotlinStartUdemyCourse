package hong.kotlin.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "what does this country belong to?",
            R.drawable.kh,
            "Khmer",
            "Thai",
            "Lao",
            "Canada",
            1,

            )
        questionList.add(que1)

        val que2 = Question(
            2,
            "what does this country belong to?",
            R.drawable.thai,
            "Khmer",
            "Thai",
            "Lao",
            "Canada",
            2,

            )
        questionList.add(que1)

        val que3 = Question(
            3,
            "what does this country belong to?",
            R.drawable.lao,
            "Khmer",
            "Thai",
            "Lao",
            "Canada",
            3,

            )
        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        return questionList

    }
}