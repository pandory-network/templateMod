package de.kaffeekirsche.cherrycoffee.registry;

import de.kaffeekirsche.cherrycoffee.CherryCoffee;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CherryCoffee.MODID);

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
