package de.kaffeekirsche.cherrycoffee.registry;

import de.kaffeekirsche.cherrycoffee.CherryCoffee;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, CherryCoffee.MODID);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
