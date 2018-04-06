package cn.awpaas

import de.codecentric.boot.admin.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
@EnableWebFlux
class Launch

fun main(args: Array<String>) {
    runApplication<Launch>(*args)
}
