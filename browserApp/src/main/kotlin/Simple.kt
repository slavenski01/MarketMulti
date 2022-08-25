import kotlinx.browser.document
import kotlinx.html.button
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.id
import me.vkuznetsov.shared.base.ViewMP
import me.vkuznetsov.shared.restriction.RestrictionBehavior

fun main() {
    RestrictionBehavior(RestrictionView()).show()
}

class RestrictionView: ViewMP {
    override fun show() {
        document.body?.append?.div {
            button {
                id = "button"
                text("Курить по прежнему вредно")
            }
        }
    }

    override fun hide() {
        val element = document.getElementById("button")
        element?.parentNode?.removeChild(element)
    }

}

