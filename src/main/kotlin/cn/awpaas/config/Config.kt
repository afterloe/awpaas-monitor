package cn.awpaas.config

import cn.awpaas.InMemoryTraceRepository
import cn.awpaas.TraceRepository
import java.io.Serializable

//@Configuration
//@AutoConfigureBefore(RevereseZuulProxyConfiguration::class)
class Config :Serializable {

//    @Bean
    fun generatorTraceRepository(): TraceRepository = InMemoryTraceRepository()
}