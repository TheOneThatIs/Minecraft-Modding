package net.theonethatis.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.theonethatis.testmod.TestMod;

public class ModItemGroup {
    public static final ItemGroup TAB_TEST_MOD = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "tab_test_mod"), ()-> new ItemStack((ModItems.TEST_ITEM)));
}
