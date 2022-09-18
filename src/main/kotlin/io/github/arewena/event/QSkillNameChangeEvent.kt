package io.github.arewena.Item

import net.kyori.adventure.text.Component.text
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory


fun QSkillNameChange(player : Player) {
    if (!player.inventory.getItem(8)?.displayName().toString().contains("중력포")) {
        if (player.inventory.getItem(7)?.displayName().toString().contains("만월총")) {
            player.inventory.setItem(0, player.inventory.getItem(0)?.apply {
                editMeta {
                    it.displayName(
                        text("정밀의 ").color(NamedTextColor.GREEN).append(player.inventory.getItem(0)?.displayName()!!)
                    )
                }
            })
        }

        else if (player.inventory.getItem(7)?.displayName().toString().contains("절단검")) {
            player.inventory.setItem(0, player.inventory.getItem(0)?.apply {
                editMeta {
                    it.displayName(
                        text("소생의 ").color(NamedTextColor.RED).append(player.inventory.getItem(0)?.displayName()!!)
                    )
                }
            })
        }

        else if (player.inventory.getItem(7)?.displayName().toString().contains("중력포")) {
            player.inventory.setItem(0, player.inventory.getItem(0)?.apply {
                editMeta {
                    it.displayName(
                        text("속박의 ").color(NamedTextColor.LIGHT_PURPLE).append(player.inventory.getItem(0)?.displayName()!!)
                    )
                }
            })
        }

        else if (player.inventory.getItem(7)?.displayName().toString().contains("화염포")) {
            player.inventory.setItem(0, player.inventory.getItem(0)?.apply {
                editMeta {
                    it.displayName(
                        text("화염의 ").color(NamedTextColor.BLUE).append(player.inventory.getItem(0)?.displayName()!!)
                    )
                }
            })
        }

        else if (player.inventory.getItem(7)?.displayName().toString().contains("반월검")) {
            player.inventory.setItem(0, player.inventory.getItem(0)?.apply {
                editMeta {
                    it.displayName(
                        text("반월의 ").color(NamedTextColor.RED).append(player.inventory.getItem(0)?.displayName()!!)
                    )
                }
            })
        }
    }
}