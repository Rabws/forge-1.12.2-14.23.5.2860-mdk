package com.accel.testmod;

import com.accel.testmod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import static net.minecraft.creativetab.CreativeTabs.BUILDING_BLOCKS;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.MC_VERSION)
public class accelmod
{
    @Mod.Instance(Reference.MOD_ID)
    public static accelmod instance;
    public static final String MODID = "AccelM1";
    public static final String NAME = "AccelM1";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    @SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
    public static CommonProxy proxy;
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        System.out.println("Hello, Minecraft Mod W!");
        proxy.Init(event);
    }
}
