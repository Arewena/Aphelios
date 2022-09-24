package io.github.arewena.event

import io.github.arewena.Item.Items.skillItem
import org.bukkit.entity.Player

fun QSkillChangeEvent(player: Player) {
    if (player.inventory.getItem(8)?.displayName().toString().contains("만월총")) player.inventory.setItem(0, skillItem[0])
    else if (player.inventory.getItem(8)?.displayName().toString().contains("절단검")) player.inventory.setItem(0, skillItem[1])
    else if (player.inventory.getItem(8)?.displayName().toString().contains("중력포")) player.inventory.setItem(0, skillItem[2])
    else if (player.inventory.getItem(8)?.displayName().toString().contains("화염포")) player.inventory.setItem(0, skillItem[3])
    else if (player.inventory.getItem(8)?.displayName().toString().contains("반월검")) player.inventory.setItem(0, skillItem[4])


}