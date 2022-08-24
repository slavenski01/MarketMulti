package me.vkuznetsov.shared.dispatchers

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

actual val uiDispatcher: CoroutineContext
    get() = Dispatchers.Main