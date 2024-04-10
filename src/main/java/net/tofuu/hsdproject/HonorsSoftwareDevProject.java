package net.tofuu.hsdproject;

import net.fabricmc.api.ModInitializer;

import net.tofuu.hsdproject.block.ModBlocks;
import net.tofuu.hsdproject.item.ModItems;
import net.tofuu.hsdproject.item.ModItemsGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HonorsSoftwareDevProject implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "honorssoftwaredevproject";
    public static final Logger LOGGER = LoggerFactory.getLogger("honorssoftwaredevproject");

	@Override
	public void onInitialize() {
		ModItemsGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}