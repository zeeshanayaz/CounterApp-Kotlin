package com.zeeshanayaz1.counterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var teamAScore : Int = 0
    var teamBScore : Int = 0
    val winningScore : Int = 10
//    val btn_click_me = findViewById(R.id.Button_add3PointstoA) as Button

//    Scoring to A
    fun add3PointstoA (view: View){
        if (teamAScore >= winningScore || teamBScore >= winningScore) {
            val ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT)
            ss.show()
        } else {
            teamAScore = teamAScore + 3

            val textView_score = findViewById<View>(R.id.textView_TeamAScore) as TextView
            textView_score.text = "" + teamAScore
            textView_score.setTextSize(60F)
            checkWinner()
        }
    }

    fun add2PointstoA (view: View){
        if (teamAScore >= winningScore || teamBScore >= winningScore) {
            val ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT)
            ss.show()
        } else {
            teamAScore = teamAScore + 2

            val textView_score = findViewById<View>(R.id.textView_TeamAScore) as TextView
            textView_score.text = "" + teamAScore
            textView_score.setTextSize(60F)
            checkWinner()
        }
    }

    fun add1PointToAFreeThrow (view: View) {
        if (teamAScore >= winningScore || teamBScore >= winningScore) {
            val ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT)
            ss.show()
        } else {
            teamAScore = teamAScore + 1

            val textView_score = findViewById<View>(R.id.textView_TeamAScore) as TextView
            textView_score.text = "" + teamAScore
            textView_score.setTextSize(60F)
            checkWinner()
        }
    }


//    Scoring to B
    fun add3PointstoB (view: View){
        if (teamAScore >= winningScore || teamBScore >= winningScore) {
            val ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT)
            ss.show()
        } else {
            teamBScore = teamBScore + 3

            val textView_score = findViewById<View>(R.id.textView_TeamBScore) as TextView
            textView_score.text = "" + teamBScore
            textView_score.setTextSize(60F)
            checkWinner()
        }
    }

    fun add2PointstoB (view: View){
        if (teamAScore >= winningScore || teamBScore >= winningScore) {
            val ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT)
            ss.show()
        } else {
            teamBScore = teamBScore + 2

            val textView_score = findViewById<View>(R.id.textView_TeamBScore) as TextView
            textView_score.text = "" + teamBScore
            textView_score.setTextSize(60F)
            checkWinner()
        }
    }

    fun add1PointToBFreeThrow (view: View){
        if (teamAScore >= winningScore || teamBScore >= winningScore) {
            val ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT)
            ss.show()
        } else {
            teamBScore = teamBScore + 1

            val textView_score = findViewById<View>(R.id.textView_TeamBScore) as TextView
            textView_score.text = "" + teamBScore
            textView_score.setTextSize(60F)
            checkWinner()
        }
    }
//Reset Text View

    fun resetScore(view: View){
        if (teamAScore == 0 && teamBScore ==0)
        {
            val ss = Toast.makeText(this, "Scores are already set to 0", Toast.LENGTH_SHORT)
            ss.show()
        }
        else
        {
            teamBScore = 0;
            teamAScore = 0;
            val textView_scoreA = findViewById<View>(R.id.textView_TeamAScore) as TextView
            textView_scoreA.setText("00")
            textView_scoreA.setTextSize(60F)

            val textView_scoreB = findViewById<View>(R.id.textView_TeamBScore) as TextView
            textView_scoreB.setText("00")
            textView_scoreB.setTextSize(60F)
        }
    }

    //    Check Winner Function
    fun checkWinner() {
        if (teamAScore > winningScore || teamAScore === winningScore) {
            val ss = Toast.makeText(this, "Team A is Winner", Toast.LENGTH_SHORT)
            ss.show()
        }
        if (teamBScore > winningScore || teamBScore === winningScore) {
            val ss = Toast.makeText(this, "Team B is Winner", Toast.LENGTH_SHORT)
            ss.show()
        }
    }
}
