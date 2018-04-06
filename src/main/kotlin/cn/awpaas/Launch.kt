package cn.cityworks

import de.codecentric.boot.admin.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.reactive.config.EnableWebFlux

@EnableDiscoveryClient
@EnableAdminServer
@EnableWebFlux
@SpringBootApplication
class Launch

fun main(args: Array<String>) {
    runApplication<Launch>(*args)
}
