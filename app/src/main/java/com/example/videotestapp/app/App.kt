package com.example.videotestapp.app

import android.app.Application
import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.videotestapp.BuildConfig
import com.example.videotestapp.app.common.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initDi()
    }

    private fun initDi() {
        startKoin {
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(this@App)
            modules(
                *appModule,
                *domainModule,
                *dataModule
            )
        }
    }
}