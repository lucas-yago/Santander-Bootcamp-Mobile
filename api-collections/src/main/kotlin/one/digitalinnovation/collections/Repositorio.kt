package one.digitalinnovation.collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        //map.put(id, value)
        map[id] = value
    }

    //fun findById(id: String) = map.get(id)
    fun findById(id: String) = map[id]

    fun findAll() = map.values

    fun remove(id: String) {
        map.remove(id)
    }

}