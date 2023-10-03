package com.jst.sleeping

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform