package com.example.myapplicationpractica03dsm104

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MiLifeCycleObserver:DefaultLifecycleObserver {
    override fun onCreate(lifecycler: LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MyLifeCycleObserver","onCreate")
    }

    override fun onStart(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MyLifeCycleObserver","onStart")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("MyLifeCycleObserver","onPause")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("MyLifeCycleObserver","onResume")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d("MyLifeCycleObserver","onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d("MyLifeCycleObserver","onDestroy")
    }
}