package view

class GreeterView {
    fun outputString(string: String) {
        println(string)
    }

    fun readString(): String {
        return readLine()!!
    }
}