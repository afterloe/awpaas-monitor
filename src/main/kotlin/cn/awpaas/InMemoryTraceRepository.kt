package cn.awpaas

import java.io.Serializable
import java.util.*

open class InMemoryTraceRepository: TraceRepository,Serializable {

    override fun add(traceInfo: Map<String, Object>) {
        val trace = Trace(Date(), traceInfo)
        synchronized(this.traces) {
            while (this.traces.size >= this.capacity) {
                this.traces.removeAt(if (this.reverse) this.capacity - 1 else 0)
            }
            if (this.reverse) {
                this.traces.add(0, trace)
            } else {
                this.traces.add(trace)
            }
        }
    }

    private var capacity = 100
    private var reverse = true
    private val traces = LinkedList<Trace>()

    fun setReverse(reverse: Boolean) {
        synchronized(this.traces) {
            this.reverse = reverse
        }
    }

    fun setCapacity(capacity: Int) {
        synchronized(this.traces) {
            this.capacity = capacity
        }
    }

    override fun findAll(): List<Trace> {
        synchronized(this.traces) {
            return Collections.unmodifiableList(ArrayList(this.traces))
        }
    }
}