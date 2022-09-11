package io.github.arewena


import io.github.monun.kommand.kommand
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.Component.text
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.*
import org.bukkit.event.player.PlayerDropItemEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin


class Main : JavaPlugin(), Listener {
    override fun onEnable() {
        kommand {
            register("aphelios") {
                executes {
                    player.inventory.setItem(0, ItemStack(Material.GREEN_DYE).apply {
                        editMeta {
                            it.displayName(text("무기 별 스킬 이름(임시)"))
                            it.lore(mutableListOf(text("무기 별 설명(임시)")) as List<Component>?)
                        }
                    })

                    player.inventory.setItem(1, ItemStack(Material.YELLOW_DYE).apply {
                        editMeta {
                            it.displayName(text("위상 변화"))
                            it.lore(mutableListOf(text("주 무기와 보조 무기를 교체하여 장착합니다.")) as List<Component>?)
                        }
                    })

                    player.inventory.setItem(2, ItemStack(Material.ORANGE_DYE).apply {
                        editMeta {
                            it.displayName(text("무기 교체 시스템"))
                            it.lore(mutableListOf(text("다음으로 올 무기를 보여줍니다.")) as List<Component>?)
                        }
                    })

                    player.inventory.setItem(3, ItemStack(Material.RED_DYE).apply {
                        editMeta {
                            it.displayName(text("월광포화"))
                            it.lore(mutableListOf(text("무기 별 설명(임시)")) as List<Component>?)
                        }
                    })

                }
            }
        }
        this.server.pluginManager.registerEvents(this, this)
    }



    @EventHandler
    fun itemMove(e: InventoryPickupItemEvent) {
        logger.info(e.item.name)
        if (e.item.name == "월광포화" ||
            e.item.name == "위상 변화" ||
            e.item.name == "무기 교체 시스템" ||
            e.item.name == "무기 별 스킬 이름(임시)") {
            e.isCancelled = true
        }
    }

    @EventHandler
    fun onDrop(e: PlayerDropItemEvent) {
        val p = e.player
        if (e.itemDrop.itemStack.itemMeta.isUnbreakable) {
            e.isCancelled = true
        }
    }

    @EventHandler
    fun onClick(e:InventoryClickEvent) {

        if (e.currentItem.toString().contains("월광포화") || e.cursor.toString().contains("월광포화")) { e.isCancelled = true }
        else if (e.currentItem.toString().contains("위상 변화") || e.cursor.toString().contains("위상 변화")) { e.isCancelled = true }
        else if (e.currentItem.toString().contains("무기 교체 시스템") || e.cursor.toString().contains("무기 교체 시스템")) { e.isCancelled = true }
        else if (e.currentItem.toString().contains("무기 별 스킬 이름(임시)") || e.cursor.toString().contains("무기 별 스킬 이름(임시)")) { e.isCancelled = true }
    }


    

}

