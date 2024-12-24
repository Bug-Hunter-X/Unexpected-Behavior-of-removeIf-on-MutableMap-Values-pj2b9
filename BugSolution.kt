fun main() {
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = mutableListOf<String>()
    for ((key, value) in map) {
        if (value > 2) {
            keysToRemove.add(key)
        }
    }

    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, b=2}

    //Alternative solution using filterNot
    val newMap = map.filterNot { it.value > 2 }
    println(newMap) // Output: {a=1, b=2}
}