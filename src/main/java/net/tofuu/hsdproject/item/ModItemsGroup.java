package net.tofuu.hsdproject.item;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tofuu.hsdproject.HonorsSoftwareDevProject;
import net.tofuu.hsdproject.block.ModBlocks;

public class ModItemsGroup {
    public static final ItemGroup decorative_blocks = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HonorsSoftwareDevProject.MOD_ID, "decoBlocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.decoBlocks"))
                    .icon(() -> new ItemStack(ModItems.stone_Wand).entries((displayContext, entries) -> {
                        entries.add(ModItems.stone_Wand);
                        entries.add(ModItems.iron_Wand);
                        entries.add(ModItems.diamond_Wand);
                        entries.add(ModItems.netherite_Wand);
                        entries.add(ModItems.creative_Wand);

                        entries.add(ModBlocks.acacia_Beam);
                        entries.add(ModBlocks.acacia_Palisade);
                        entries.add(ModBlocks.acacia_Seat);
                        entries.add(ModBlocks.bamboo_Palisade);
                        entries.add(ModBlocks.bamboo_Seat);
                        entries.add(ModBlocks.bamboo_Support);
                        entries.add(ModBlocks.bar_Panel);
                        entries.add(ModBlocks.birch_Beam);
                        entries.add(ModBlocks.birch_Palisade);
                        entries.add(ModBlocks.birch_Seat);
                        entries.add(ModBlocks.birch_Support);
                        entries.add(ModBlocks.bonfire);
                        entries.add(ModBlocks.brazier);
                        entries.add(ModBlocks.brazier_Extinguished);
                        entries.add(ModBlocks.chain);
                        entries.add(ModBlocks.chandelier);
                        entries.add(ModBlocks.cherry_Beam);
                        entries.add(ModBlocks.cherry_Palisade);
                        entries.add(ModBlocks.cherry_Seat);
                        entries.add(ModBlocks.cherry_Support);
                        entries.add(ModBlocks.crimson_Beam);
                        entries.add(ModBlocks.crimson_Palisade);
                        entries.add(ModBlocks.crimson_Seat);
                        entries.add(ModBlocks.crimson_Support);
                        entries.add(ModBlocks.dark_Oak_Beam);
                        entries.add(ModBlocks.dark_Oak_Palisade);
                        entries.add(ModBlocks.dark_Oak_Seat);
                        entries.add(ModBlocks.dark_Oak_Support);
                        entries.add(ModBlocks.jungle_Beam);
                        entries.add(ModBlocks.jungle_Palisade);
                        entries.add(ModBlocks.jungle_Seat);
                        entries.add(ModBlocks.jungle_Support);
                        entries.add(ModBlocks.lattice);
                        entries.add(ModBlocks.mangrove_Beam);
                        entries.add(ModBlocks.mangrove_Palisade);
                        entries.add(ModBlocks.mangrove_Seat);
                        entries.add(ModBlocks.mangrove_Support);
                        entries.add(ModBlocks.oak_Beam);
                        entries.add(ModBlocks.oak_Palisade);
                        entries.add(ModBlocks.oak_Seat);
                        entries.add(ModBlocks.oak_Support);
                        entries.add(ModBlocks.rocky_Dirt);
                        entries.add(ModBlocks.soul_Bonfire);
                        entries.add(ModBlocks.soul_Brazier);
                        entries.add(ModBlocks.soul_Chandelier);
                        entries.add(ModBlocks.spruce_Beam);
                        entries.add(ModBlocks.spruce_Palisade);
                        entries.add(ModBlocks.spruce_Seat);
                        entries.add(ModBlocks.spruce_Support);
                        entries.add(ModBlocks.stone_Pillar);
                        entries.add(ModBlocks.thatch);
                        entries.add(ModBlocks.warped_Beam);
                        entries.add(ModBlocks.warped_Palisade);
                        entries.add(ModBlocks.warped_Seat);
                        entries.add(ModBlocks.warped_Support);

                    }).build());


    public static void registerItemGroups() {
        HonorsSoftwareDevProject.LOGGER.info("Registering Item Groups for " + HonorsSoftwareDevProject.MOD_ID);
    }
}
