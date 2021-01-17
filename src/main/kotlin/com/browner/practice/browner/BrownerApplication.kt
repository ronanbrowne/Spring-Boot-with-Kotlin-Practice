package com.browner.practice.browner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BrownerApplication

fun main(args: Array<String>) {
	runApplication<BrownerApplication>(*args)
}
