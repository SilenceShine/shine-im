package io.github.silenceshine.shine.im

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @author SilenceShine
 * @since 1.0
 */
@SpringBootApplication
class ImServerApplication

fun main(args: Array<String>) {
    runApplication<ImServerApplication>(*args)
}

