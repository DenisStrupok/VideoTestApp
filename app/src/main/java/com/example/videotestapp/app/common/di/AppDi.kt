package com.example.videotestapp.app.common.di

import com.example.videotestapp.app.features.home.HomeVM
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val viewModelModules = module {
    viewModel<HomeVM>()
}

val appModule = arrayOf(viewModelModules)