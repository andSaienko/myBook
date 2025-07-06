package com.isa.mybook

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform