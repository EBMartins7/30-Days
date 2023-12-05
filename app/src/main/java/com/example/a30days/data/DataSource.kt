package com.example.a30days.data

import android.annotation.SuppressLint
import com.example.a30days.R
import com.example.a30days.model.WellnessTip

class DataSource() {
    fun loadWellnessTips(): List<WellnessTip> {
        return listOf<WellnessTip> (
              WellnessTip(R.string.day1, R.string.tip1, R.string.instruction1, R.drawable.image1),
              WellnessTip(R.string.day2, R.string.tip2, R.string.instruction2, R.drawable.image2),
              WellnessTip(R.string.day3, R.string.tip3, R.string.instruction3, R.drawable.image3),
              WellnessTip(R.string.day4, R.string.tip4, R.string.instruction4, R.drawable.image4),
              WellnessTip(R.string.day5, R.string.tip5, R.string.instruction5, R.drawable.image5),
              WellnessTip(R.string.day6, R.string.tip6, R.string.instruction6, R.drawable.image6),
              WellnessTip(R.string.day7, R.string.tip7, R.string.instruction7, R.drawable.image7),
              WellnessTip(R.string.day8, R.string.tip8, R.string.instruction8, R.drawable.image8),
              WellnessTip(R.string.day9, R.string.tip9, R.string.instruction9, R.drawable.image9),
              WellnessTip(R.string.day10, R.string.tip10, R.string.instruction10, R.drawable.image10),
              WellnessTip(R.string.day11, R.string.tip11, R.string.instruction11, R.drawable.image11),
              WellnessTip(R.string.day12, R.string.tip12, R.string.instruction12, R.drawable.image12),
              WellnessTip(R.string.day13, R.string.tip13, R.string.instruction13, R.drawable.image13),
              WellnessTip(R.string.day14, R.string.tip14, R.string.instruction14, R.drawable.image14),
              WellnessTip(R.string.day15, R.string.tip15, R.string.instruction15, R.drawable.image15),
              WellnessTip(R.string.day16, R.string.tip16, R.string.instruction16, R.drawable.image16),
              WellnessTip(R.string.day17, R.string.tip17, R.string.instruction17, R.drawable.image17),
              WellnessTip(R.string.day18, R.string.tip18, R.string.instruction18, R.drawable.image18),
              WellnessTip(R.string.day19, R.string.tip19, R.string.instruction19, R.drawable.image19),
              WellnessTip(R.string.day20, R.string.tip20, R.string.instruction20, R.drawable.image20),
              WellnessTip(R.string.day21, R.string.tip21, R.string.instruction21, R.drawable.image21),
              WellnessTip(R.string.day22, R.string.tip22, R.string.instruction22, R.drawable.image22),
              WellnessTip(R.string.day23, R.string.tip23, R.string.instruction23, R.drawable.image23),
              WellnessTip(R.string.day24, R.string.tip24, R.string.instruction24, R.drawable.image24),
              WellnessTip(R.string.day25, R.string.tip25, R.string.instruction25, R.drawable.image25),
              WellnessTip(R.string.day26, R.string.tip26, R.string.instruction26, R.drawable.image26),
              WellnessTip(R.string.day27, R.string.tip27, R.string.instruction27, R.drawable.image27),
              WellnessTip(R.string.day28, R.string.tip28, R.string.instruction28, R.drawable.image28),
              WellnessTip(R.string.day29, R.string.tip29, R.string.instruction29, R.drawable.image29),
              WellnessTip(R.string.day30, R.string.tip30, R.string.instruction30, R.drawable.image30)
        )
    }
}