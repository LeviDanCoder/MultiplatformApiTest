package com.example.ktormultiplatformsample1

actual class Platform actual constructor() {
    actual val platform: String
        get() = "web"
}