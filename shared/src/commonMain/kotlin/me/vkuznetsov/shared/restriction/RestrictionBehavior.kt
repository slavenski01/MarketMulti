package me.vkuznetsov.shared.restriction

import kotlinx.coroutines.*
import me.vkuznetsov.shared.base.ViewMP
import me.vkuznetsov.shared.dispatchers.uiDispatcher

class RestrictionBehavior(private val viewMP: ViewMP) {
    val scope = CoroutineScope(Dispatchers.Default + SupervisorJob())
    fun show() {
        scope.launch {
            delay(2000)
            withContext(uiDispatcher) {
                viewMP.show()
            }
            delay(8000)
            withContext(uiDispatcher) {
                viewMP.hide()
            }
        }
    }
}

