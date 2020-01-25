import com.sun.corba.se.impl.orbutil.graph.Graph
import com.sun.corba.se.impl.orbutil.graph.GraphImpl
import java.util.*
import kotlin.collections.ArrayList

class BridgeCars {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0

        val queue = truck_weights.toCollection(LinkedList())

        while (queue.isNotEmpty()) {
            val truck = queue.poll()
            var localWeight = 0
            for (i in 1 until bridge_length + 1) {
                localWeight += truck
                if (localWeight > weight) {
                    answer += i
                    break
                }
            }
            answer += 1
        }
        println(answer)
        return answer
    }

}

fun main() {
    val bridgeCars = BridgeCars()
    bridgeCars.solution(2, 10, intArrayOf(7, 4, 5, 6)).assertEquals(8)
    bridgeCars.solution(100, 100, intArrayOf(10)).assertEquals(101)
    bridgeCars.solution(100, 100, intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10)).assertEquals(110)
}