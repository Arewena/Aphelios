package io.github.arewena


import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin


class Main : JavaPlugin(), Listener {
    override fun onEnable() { this.server.pluginManager.registerEvents(this, this) }
    

}


