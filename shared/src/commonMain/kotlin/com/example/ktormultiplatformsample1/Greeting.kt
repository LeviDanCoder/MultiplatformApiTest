package com.example.ktormultiplatformsample1

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}