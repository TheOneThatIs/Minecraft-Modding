package net.theonethatis.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.theonethatis.testmod.TestMod;

public class ModItems {
	public static final Item TEST_ITEM = registerItem("test_item", new Item(new FabricItemSettings().group(ModItemGroup.TAB_TEST_MOD)));
	public static final Item TEST_ITEM2 = registerItem("test_item2", new Item(new FabricItemSettings().group(ModItemGroup.TAB_TEST_MOD)));

	public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings().group(ModItemGroup.TAB_TEST_MOD)));
	public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings().group(ModItemGroup.TAB_TEST_MOD)));

	private static Item registerItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
	}
	public static void registerModItems(){
		TestMod.LOGGER.debug("Mod Item Registration [" + TestMod.MOD_ID + "]");
	}
}
