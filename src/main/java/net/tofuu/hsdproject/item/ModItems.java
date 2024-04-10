package net.tofuu.hsdproject.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tofuu.hsdproject.HonorsSoftwareDevProject;

public class ModItems {
    public static final Item stone_Wand = registerItem("stone_wand", new Item(new FabricItemSettings()));
    public static final Item iron_Wand = registerItem("iron_wand", new Item(new FabricItemSettings()));
    public static final Item diamond_Wand = registerItem("diamond_wand", new Item(new FabricItemSettings()));
    public static final Item netherite_Wand = registerItem("netherite_wand", new Item(new FabricItemSettings()));
    public static final Item creative_Wand = registerItem("creative_wand", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(stone_Wand);
        entries.add(iron_Wand);
        entries.add(diamond_Wand);
        entries.add(netherite_Wand);
        entries.add(creative_Wand);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HonorsSoftwareDevProject.MOD_ID, name),item);
    }

    public static void registerModItems(){
        HonorsSoftwareDevProject.LOGGER.info("Registering Mod Items for " + HonorsSoftwareDevProject.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
