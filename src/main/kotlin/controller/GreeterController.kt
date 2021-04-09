package controller

import model.User
import view.GreeterView

class GreeterController(private val view: GreeterView) {
    fun startGreeting() {
        view.outputString("Hello, who are you?")
        val name = view.readString()
        val user = User(name)
        view.outputString(greetUser(user))
    }

    private fun greetUser(user: User): String {
        return "Hello, " + user.name
    }
}