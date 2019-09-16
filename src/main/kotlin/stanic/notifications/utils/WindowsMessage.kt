package stanic.notifications.utils

import java.awt.*

class WindowsMessage {

    @Throws(AWTException::class)
    fun send(caption: String, msg: String) {
        val tray = SystemTray.getSystemTray()

        val image = Toolkit.getDefaultToolkit().createImage("icon.png")

        val trayIcon = TrayIcon(image, "Tray Demo")
        trayIcon.isImageAutoSize = true
        trayIcon.toolTip = "System tray icon demo"
        tray.add(trayIcon)

        trayIcon.displayMessage(caption, msg, TrayIcon.MessageType.INFO)
    }

}