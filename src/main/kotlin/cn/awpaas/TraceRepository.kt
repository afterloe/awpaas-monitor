package cn.awpaas

interface TraceRepository {
    fun findAll(): List<Trace>
    fun add(traceInfo: Map<String, Object>)
}
