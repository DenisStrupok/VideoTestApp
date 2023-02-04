package com.example.videotestapp.app.common.ui.base

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

abstract class BaseActivity(@LayoutRes layoutId: Int) : AppCompatActivity(layoutId) {

}