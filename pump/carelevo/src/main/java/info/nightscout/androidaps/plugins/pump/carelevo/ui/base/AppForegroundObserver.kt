package info.nightscout.androidaps.plugins.pump.carelevo.ui.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class AppForegroundObserver(
    private val onEnterForeground: () -> Unit
) : LifecycleEventObserver {

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        if (event == Lifecycle.Event.ON_START) {
            onEnterForeground()
        }
    }
}