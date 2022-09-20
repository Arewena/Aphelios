package io.github.arewena.event

import io.github.arewena.isRight
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent

class useWeponEvent : Listener {
    @EventHandler
    fun onAttack(e: EntityDamageByEntityEvent) {
        if (e.damager is Player && (e.damager as Player).inventory.getItem(8) != null) {
            val damager = e.damager as Player
            val item = damager.inventory.getItem(8)!!

            if (damager.inventory.heldItemSlot == 8 && isRight) {
                e.damage = 4.0
                if(item.amount - 1 > 0) { item.amount = item.amount - 1 }
                else if(item.amount - 1 == 0) {
                    weponChangeEvent(damager)
                }
            }



        }

    }
}