package dr.snow.sampleplugin

import org.bukkit.plugin.java.JavaPlugin
import java.net.http.WebSocket

class SamplePlugin: JavaPlugin(), WebSocket.Listener {
    override fun onEnable() {
        getCommand("heal")!!.setExecutor(HealCommand())
    }
}