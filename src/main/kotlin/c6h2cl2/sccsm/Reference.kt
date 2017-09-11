package c6h2cl2.sccsm

/**
 * @author C6H2Cl2
 * @author Kamesuta
 */
// ※Gradleから変数の書き換えを行うため、グローバル定数はご利用いただけません。
object Reference {
    const val MODID = "sccsm"
    const val NAME = "SuperCompressedCobblestoneMod"
    const val VERSION = "{version}"
    const val FORGE = "{forgeversion}"
    const val MINECRAFT = "{mcversion}"
    const val DEPENDENCIES = "required-after:forgelin"
    const val PROXY_SERVER = "c6h2cl2.sccsm.CommonProxy"
    const val PROXY_CLIENT = "c6h2cl2.sccsm.ClientProxy"
    const val GUI_FACTORY = "c6h2cl2.sccsm.gui.config.ConfigGuiFactory"
}