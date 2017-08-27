package c6h2cl2.sccsm

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

/**
 * @author C6H2Cl2
 */
object SCCSMRegistry {
    val tabSCCSM = object : CreativeTabs("sccsm") {
        override fun getTabIconItem(): Item {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    fun preinit(event: FMLPreInitializationEvent) {

    }

    fun init(event: FMLInitializationEvent) {

    }

    fun postinit(event: FMLPostInitializationEvent) {

    }
}