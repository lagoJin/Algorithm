import com.sun.jmx.remote.internal.ArrayQueue
import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

class Printer {


    fun solution(priorities: IntArray, location: Int): Int {
        val printerQueue = ArrayDeque<Pair<Int, Int>>()

        priorities.forEachIndexed { index: Int, value: Int ->
            printerQueue.offer(Pair(index, value))
        }
        var count = 0
        while (!printerQueue.isEmpty()) {
            val first = printerQueue.poll()

            if (printerQueue.filter { first.second < it.second }.isNotEmpty()) {
                printerQueue.offer(first)
            } else {
                count++
                if (first.first == location) return count
            }


        }

        return 0
    }

}

