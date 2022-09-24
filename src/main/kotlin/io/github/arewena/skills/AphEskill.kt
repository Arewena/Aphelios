package io.github.arewena.skills

import io.github.arewena.Item.Items.AAWeapon
import net.kyori.adventure.text.Component.text
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.entity.Player

fun AphEskill(player: Player) {
    if (AAWeapon[0].displayName().toString().contains("만월총")) {
        player.sendActionBar(text("다음 무기: ").append(text("만월총").color(NamedTextColor.GREEN)))
    }
    else if (AAWeapon[0].displayName().toString().contains("절단검")) {
        player.sendActionBar(text("다음 무기: ").append(text("절단검").color(NamedTextColor.RED)))
    }
    else if (AAWeapon[0].displayName().toString().contains("중력포")) {
        player.sendActionBar(text("다음 무기: ").append(text("중력포").color(NamedTextColor.LIGHT_PURPLE)))
    }
    else if (AAWeapon[0].displayName().toString().contains("화염포")) {
        player.sendActionBar(text("다음 무기: ").append(text("화염포").color(NamedTextColor.BLUE)))
    }
    else if (AAWeapon[0].displayName().toString().contains("반월검")) {
        player.sendActionBar(text("다음 무기: ").append(text("반월검").color(NamedTextColor.WHITE)))
    }
    player.setCooldown(Material.ORANGE_DYE, 20)
}