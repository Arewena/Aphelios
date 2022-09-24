package io.github.arewena.event

import io.github.arewena.Item.Items.AAWeapon
import io.github.arewena.Item.QSkillNameChange
import net.kyori.adventure.text.Component.text
import org.bukkit.entity.Player

fun weponChangeEvent(player: Player) {
    player.inventory.setItem(8, AAWeapon.first())
    AAWeapon.removeAt(0)
    AAWeapon.add(player.inventory.getItem(8)!!)
    QSkillChangeEvent(player)
    QSkillNameChange(player)
}