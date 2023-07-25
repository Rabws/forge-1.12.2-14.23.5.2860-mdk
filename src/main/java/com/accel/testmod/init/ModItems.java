package com.accel.testmod.init;

import com.accel.testmod.accelmod;
import com.accel.testmod.base.item.moditems;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.creativetab.CreativeTabs.FOOD;


public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item demo01 = new moditems("demo01", "demo01", FOOD);
}
