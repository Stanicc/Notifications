package stanic.notifications.main

import javafx.scene.control.TextField
import stanic.notifications.utils.WindowsMessage
import tornadofx.*

class Notifications: View() {

    private var msg: TextField by singleAssign()

    override val root = form {
        fieldset("Notifications") {
            paddingLeft = 30.0
        }
        msg = textfield()
        hbox {
            button("Teste") {
                action {
                    if (msg.text.isEmpty()) WindowsMessage().send("Aviso", "Você precisa colocar uma mensagem")
                    else WindowsMessage().send("Teste", msg.text)
                }
                hboxConstraints {
                    marginLeft = 10.0
                    marginTop = 15.0
                    marginRight = 25.0
                }
            }
            button("Cancelar") {
                action {
                    close()
                }
                hboxConstraints {
                    marginTop = 15.0
                }
            }
        }
    }

}