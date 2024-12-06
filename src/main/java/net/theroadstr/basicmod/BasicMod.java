package net.theroadstr.basicmod;

import net.fabricmc.api.ModInitializer;

import net.theroadstr.basicmod.block.ModBlocks;
import net.theroadstr.basicmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicMod implements ModInitializer {
	public static final String MOD_ID = "basicmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}