package io.github.arewena.skills

import io.github.arewena.Item.QSkillNameChange
import io.github.arewena.event.QSkillChangeEvent
import org.bukkit.Material
import org.bukkit.entity.Player

fun AphWskill(player: Player) {
    if (!player.hasCooldown(Material.YELLOW_DYE)) {
        val wepon1 = player.inventory.getItem(7)
        val wepon2 = player.inventory.getItem(8)

        player.inventory.setItem(8, wepon1)
        player.inventory.setItem(7, wepon2)
        player.setCooldown(Material.YELLOW_DYE, 10)
        QSkillChangeEvent(player)
        QSkillNameChange(player)
    }
}