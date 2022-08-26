package net.theonethatis.testmod.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.theonethatis.testmod.TestMod;
import net.theonethatis.testmod.item.ModItemGroup;

public class ModBlocks {
	public static final Block PEBBLELESS_DIRT = registerBlock("pebbleless_dirt", new Block(FabricBlockSettings.of(Material.SOIL).strength(0.5f).requiresTool().sounds(BlockSoundGroup.GRASS)), ModItemGroup.TAB_TEST_MOD);

	public static final Block TIN_ORE = registerBlock("tin_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.TAB_TEST_MOD);
	public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool().sounds(BlockSoundGroup.COPPER)), ModItemGroup.TAB_TEST_MOD);
	public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.TAB_TEST_MOD);

	private static Block registerBlock(String name, Block block, ItemGroup tab){
		registerBlockItem(name, block, tab);
		return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup tab){
		return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
	}

	public static void registerModBlocks(){
		TestMod.LOGGER.debug("Mod Block Registration [" + TestMod.MOD_ID + "]");
	}
}
