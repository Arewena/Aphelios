package io.github.arewena

import io.github.arewena.Item.Items.ItemSet
import io.github.monun.kommand.kommand
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import io.github.arewena.Item.Items.AAWeapon
import io.github.arewena.Item.QSkillNameChange
import io.github.arewena.event.blockItemMoveEvent
import io.github.arewena.event.useWeponEvent
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

var isRight = false

class Main : JavaPlugin() {
    override fun onEnable() {
        kommand {
            register("aphelios") {
                executes {
                    player.inventory.heldItemSlot = 8
                    isRight = true
                    for (i in ItemSet) {
                        player.inventory.setItem(i.key, i.value)
                    }
                    for (i in 7..8) {
                        player.inventory.setItem(i, AAWeapon[i - 7])
                    }

                    QSkillNameChange(player)
                }
            }
        }
        this.server.pluginManager.registerEvents(blockItemMoveEvent(), this)
        this.server.pluginManager.registerEvents(useWeponEvent(), this)
    }







    

}

