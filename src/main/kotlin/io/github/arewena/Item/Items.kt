package io.github.arewena.Item

import net.kyori.adventure.text.Component.text
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

object Items {
    val skillItem = mutableListOf(
        ItemStack(Material.LIGHT_BLUE_DYE).apply {
            editMeta {
                it.displayName(text("달빛탄").color(NamedTextColor.GREEN))
                it.lore(mutableListOf(
                    text("원거리 공격을 가하여").color(NamedTextColor.WHITE),
                    text("처음 적중한 적에게 물리 피해를 입힌 후").color(NamedTextColor.WHITE),
                    text("표식을 남깁니다.").color(NamedTextColor.WHITE))
                            as List<net.kyori.adventure.text.Component>?)
            }
        },
        ItemStack(Material.BLUE_DYE).apply {
            editMeta {
                it.displayName(text("맹공"))
                it.lore(mutableListOf(
                    text("신속 1을 얻고,").color(NamedTextColor.WHITE),
                    text("가장 가까운 적에게 두가지 무기로").color(NamedTextColor.WHITE),
                    text("총 6번을 타격합니다.").color(NamedTextColor.WHITE))
                        as List<net.kyori.adventure.text.Component>?)
            }
        },
        ItemStack(Material.BROWN_DYE).apply {
            editMeta {
                it.displayName(text("속박의 월식"))
                it.lore(mutableListOf(
                    text("쥬변에 둔화가 걸린 적을").color(NamedTextColor.WHITE),
                    text("1초간 바로 속박합니다.").color(NamedTextColor.WHITE))
                        as List<net.kyori.adventure.text.Component>?)
            }
        },
        ItemStack(Material.CYAN_DYE).apply {
            editMeta {
                it.displayName(text("황혼파"))
                it.lore(mutableListOf(
                    text("부채꼴 범위로 화염의 파도를 발사하고,").color(NamedTextColor.WHITE),
                    text("적중한 모든 적을 보조무기로 공격합니다.").color(NamedTextColor.WHITE))
                        as List<net.kyori.adventure.text.Component>?)
            }
        },

        ItemStack(Material.MAGENTA_DYE).apply {
            editMeta {
                it.displayName(text("파수탑"))
                it.lore(mutableListOf(
                    text("보조 무기를 장착한").color(NamedTextColor.WHITE),
                    text("달빛 파수탑을 배치합니다.").color(NamedTextColor.WHITE),
                    text("20초 동안 지속되며, 적이 접근하면 활성화됩니다.").color(NamedTextColor.WHITE))
                        as List<net.kyori.adventure.text.Component>?)
            }
        }



    )


    var AAWeapon = mutableListOf(
        ItemStack(Material.BLACK_DYE, 50).apply {
            editMeta {
                it.displayName(text("만월총"))
                it.lore(mutableListOf(text("저격소총"),
                    text("완전한 달이 모습을 드러낼 때.").color(NamedTextColor.GREEN))
                        as List<net.kyori.adventure.text.Component>?)
            }
        },
        ItemStack(Material.GRAY_DYE, 50).apply {
            editMeta {
                it.displayName(text("절단검"))
                it.lore(mutableListOf(text("낫 모양 권총"),
                    text("기우는 달의 경계에, 어둠을 담아.").color(NamedTextColor.RED))
                        as List<net.kyori.adventure.text.Component>?)
            }
        },
        ItemStack(Material.LIGHT_GRAY_DYE, 50).apply {
            editMeta {
                it.displayName(text("중력포"))
                it.lore(mutableListOf(text("대포"),
                    text("똑같은 어둠속, 새로운 달이.").color(NamedTextColor.LIGHT_PURPLE))
                        as List<net.kyori.adventure.text.Component>?)
            }
        },

        ItemStack(Material.WHITE_DYE, 50).apply {
            editMeta {
                it.displayName(text("화염포"))
                it.lore(mutableListOf(text("화염 방사기"),
                    text("화염 속 달이 차오른다.").color(NamedTextColor.BLUE))
                        as List<net.kyori.adventure.text.Component>?)
            }
        },

        ItemStack(Material.BLACK_DYE, 50, 2).apply {
            editMeta {
                it.displayName(text("반월검"))
                it.lore(mutableListOf(text("투척 무기"),
                    text("완벽한 균형을 이룬 반달.").color(NamedTextColor.WHITE))
                        as List<net.kyori.adventure.text.Component>?)
            }
        }

    )


    val ItemSet = hashMapOf(
        0 to skillItem[1],

        1 to ItemStack(Material.YELLOW_DYE).apply {
            editMeta {
                it.displayName(text("위상 변화"))
                it.lore(mutableListOf(text("주 무기와 보조 무기를 교체하여 장착합니다.")) as List<net.kyori.adventure.text.Component>?)
            }
        },

        2 to ItemStack(Material.ORANGE_DYE).apply {
            editMeta {
                it.displayName(text("무기 교체 시스템"))
                it.lore(mutableListOf(text("다음으로 올 무기를 보여줍니다.")) as List<net.kyori.adventure.text.Component>?)
            }
        },

        3 to ItemStack(Material.RED_DYE).apply {
            editMeta {
                it.displayName(text("월광포화"))
                it.lore(mutableListOf(text("무기 별 설명(임시)")) as List<net.kyori.adventure.text.Component>?)
            }
        }
    )
}




