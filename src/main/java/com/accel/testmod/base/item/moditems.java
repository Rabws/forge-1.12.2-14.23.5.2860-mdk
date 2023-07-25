package com.accel.testmod.base.item;

import com.accel.testmod.accelmod;
import com.accel.testmod.init.ModItems;
import com.accel.testmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class moditems extends Item implements IHasModel {

    public moditems(String UnlocalizedNmae, String RegistryName, CreativeTabs tab){
        setUnlocalizedName(UnlocalizedNmae);
        setCreativeTab(tab);
        setRegistryName(RegistryName);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        accelmod.proxy.registerItemRender(this, 0, "inventory");
    }
}
