package io.github.silenceshine.shine.im.controller

import io.github.SilenceShine.shine.core.dto.SingleR
import io.github.SilenceShine.shine.core.dto.reactive.ReactorR
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

/**
 * @author SilenceShine
 * @since 1.0
 */
@Controller
@MessageMapping("test.RSocket")
class TestRSocketController {

    @MessageMapping("requestResponse")
    fun requestResponse(): Mono<SingleR<String>> {
        return ReactorR.single("111")
    }

    @MessageMapping("fireAndForget")
    fun fireAndForget(): Mono<Void> {
        return Mono.empty()
    }

    @MessageMapping("requestStream")
    fun requestStream(): Flux<Long> {
        return Flux.interval(Duration.ofSeconds(1))
    }

}
