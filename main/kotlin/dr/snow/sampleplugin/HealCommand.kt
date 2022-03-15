package dr.snow.sampleplugin

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class HealCommand: CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            sender.sendMessage("Your health has been restored")
            sender.setHealth(20.0)
            return true
        }
        return true
    }
}