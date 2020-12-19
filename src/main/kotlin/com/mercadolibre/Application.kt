package com.mercadolibre

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.mercadolibre")
		.start()
}

