package de.kaffeekirsche.cherrycoffee.datagen;

import de.kaffeekirsche.cherrycoffee.registry.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class CherryBlockLootTables extends BlockLoot  {
    @Override
    protected void addTables() {

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
