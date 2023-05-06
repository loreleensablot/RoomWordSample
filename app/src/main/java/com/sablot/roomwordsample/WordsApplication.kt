package com.sablot.roomwordsample

import android.app.Application

class WordsApplication: Application() {
    private val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}