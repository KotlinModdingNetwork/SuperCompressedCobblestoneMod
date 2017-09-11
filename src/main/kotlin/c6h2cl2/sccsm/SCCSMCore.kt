package c6h2cl2.sccsm

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.Mod.Instance
import net.minecraftforge.fml.common.Mod.Metadata
import net.minecraftforge.fml.common.ModMetadata
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

/**
 * @author C6H2Cl2
 */

@Mod(modid = MODID, name = NAME, version = VERSION, dependencies = DEPENDENCIES, useMetadata = true)
class SCCSMCore {

    companion object {
        @JvmStatic
        @Metadata
        lateinit var meta: ModMetadata

        @JvmStatic
        @Instance
        lateinit var INSTANCE: SCCSMCore
    }

    @EventHandler
    fun preinit(event: FMLPreInitializationEvent) {
        loadMeta()
        SCCSMRegistry.preinit(event)
    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
        SCCSMRegistry.init(event)
    }

    @EventHandler
    fun postinit(event: FMLPostInitializationEvent) {
        SCCSMRegistry.postinit(event)
    }

    private fun loadMeta() {
        meta.autogenerated = false
        meta.authorList.add("C6H2Cl2")
        meta.authorList.add("Kamesuta")
    }
}