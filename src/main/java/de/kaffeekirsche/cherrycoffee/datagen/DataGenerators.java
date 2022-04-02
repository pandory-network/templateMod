package de.kaffeekirsche.cherrycoffee.datagen;

import de.kaffeekirsche.cherrycoffee.CherryCoffee;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CherryCoffee.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        generator.addProvider(new CherryRecipeProvider(generator));
        generator.addProvider(new CherryLootTableProvider(generator));
    }
}
