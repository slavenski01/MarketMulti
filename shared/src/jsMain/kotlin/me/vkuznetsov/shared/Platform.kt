package me.vkuznetsov.shared

actual class Platform actual constructor() {
    actual val platform: String
        get() = "JS"
}