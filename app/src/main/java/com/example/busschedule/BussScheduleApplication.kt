package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.AppDatabase

class BussScheduleApplication : Application() {

    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}