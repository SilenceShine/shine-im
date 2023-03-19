package io.github.SilenceShine.shine.im

/**
 * @author SilenceShine
 * @since 1.0
 */
@SpringBootApplication
object ImServerApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(ImServerApplication::class.java, args)
    }

}
