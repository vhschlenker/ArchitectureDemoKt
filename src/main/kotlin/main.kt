import controller.GreeterController
import view.GreeterView

fun main(args: Array<String>) {
    val view = GreeterView()
    val controller = GreeterController(view)
    controller.startGreeting()
}