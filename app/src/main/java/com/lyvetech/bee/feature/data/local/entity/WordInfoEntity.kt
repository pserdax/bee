package com.lyvetech.bee.feature.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lyvetech.bee.feature.domain.model.Meaning
import com.lyvetech.bee.feature.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val origin: String,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            word = word,
            phonetic = phonetic,
            origin = origin,
            meanings = meanings
        )
    }
}
