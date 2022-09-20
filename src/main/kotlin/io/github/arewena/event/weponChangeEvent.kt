package io.github.arewena.event

import io.github.arewena.Item.Items.AAWeapon
import org.bukkit.entity.Player

fun weponChangeEvent(player: Player) {
    AAWeapon.removeAt(0)
    AAWeapon.add(player.inventory.getItem(8)!!)
    player.sendMessage(AAWeapon.toString())
    player.inventory.setItem(8, AAWeapon.first())

}