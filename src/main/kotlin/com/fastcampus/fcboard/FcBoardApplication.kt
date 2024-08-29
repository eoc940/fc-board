package com.fastcampus.fcboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FcBoardApplication
// 테스트 주석
fun main(args: Array<String>) {
    runApplication<FcBoardApplication>(*args)
}
