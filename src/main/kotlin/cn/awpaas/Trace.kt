package cn.awpaas

import org.springframework.util.Assert
import java.util.*

class Trace {
    private val timestamp: Date
    private val info: Map<String, Any>

    constructor(timestamp: Date, info: Map<String, Any>) {
        Assert.notNull(timestamp, "Timestamp must not be null")
        Assert.notNull(info, "Info must not be null")
        this.timestamp = timestamp
        this.info = info
    }

    fun getTimestamp(): Date {
        return this.timestamp
    }

    fun getInfo(): Map<String, Any> {
        return this.info
    }

}