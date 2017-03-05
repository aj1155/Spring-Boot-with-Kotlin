package io.gomko

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinApplication::class.java, *args)
}

@SpringBootApplication
//@EnableLoadTimeWeaving
//@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
open class KotlinApplication {

}
