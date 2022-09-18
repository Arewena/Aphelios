package io.github.arewena.event

import io.github.arewena.Item.Items
import io.github.arewena.skills.AphEskill
import io.github.arewena.skills.AphQskill
import io.github.arewena.skills.AphRskill
import io.github.arewena.skills.AphWskill
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.player.PlayerDropItemEvent
import org.bukkit.event.player.PlayerItemHeldEvent
class blockItemMoveEvent : Listener {
    @EventHandler
    fun onClick(e: InventoryClickEvent) {
        if (Items.ItemSet.values.contains(e.currentItem) || Items.ItemSet.values.contains(e.currentItem)) {e.isCancelled = true}
        if (Items.ItemSet.values.contains(e.cursor) || Items.ItemSet.values.contains(e.cursor)) {e.isCancelled = true}
        if (Items.skillItem.contains(e.currentItem) || Items.skillItem.contains(e.currentItem)) {e.isCancelled = true}
        if (Items.skillItem.contains(e.cursor) || Items.skillItem.contains(e.cursor)) {e.isCancelled = true}
        if (Items.AAWeapon.contains(e.currentItem) || Items.AAWeapon.contains(e.currentItem)) {e.isCancelled = true}
        if (Items.AAWeapon.contains(e.cursor) || Items.AAWeapon.contains(e.cursor)) {e.isCancelled = true}
    }

    @EventHandler
    fun onDrop(e: PlayerDropItemEvent) {
        if (Items.ItemSet.values.contains(e.itemDrop.itemStack) || Items.ItemSet.values.contains(e.itemDrop.itemStack)) {e.isCancelled = true}
        if (Items.ItemSet.values.contains(e.itemDrop.itemStack) || Items.ItemSet.values.contains(e.itemDrop.itemStack)) {e.isCancelled = true}
        if (Items.skillItem.contains(e.itemDrop.itemStack) || Items.skillItem.contains(e.itemDrop.itemStack)) {e.isCancelled = true}
        if (Items.skillItem.contains(e.itemDrop.itemStack) || Items.skillItem.contains(e.itemDrop.itemStack)) {e.isCancelled = true}
        if (Items.AAWeapon.contains(e.itemDrop.itemStack) || Items.AAWeapon.contains(e.itemDrop.itemStack)) {e.isCancelled = true}
        if (Items.AAWeapon.contains(e.itemDrop.itemStack) || Items.AAWeapon.contains(e.itemDrop.itemStack)) {e.isCancelled = true}
    }

    @EventHandler
    fun onMove(e: PlayerItemHeldEvent) {
        when(e.newSlot) {
            0 -> AphQskill(e.player)
            1 -> AphWskill(e.player)
            2 -> AphEskill(e.player)
            3 -> AphRskill(e.player)
            else -> e.isCancelled = true
        }
        e.isCancelled = true




    }

}