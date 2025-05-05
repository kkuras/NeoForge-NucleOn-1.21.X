package net.kkura.nucleon.item;

import net.kkura.nucleon.NucleonMod;
import net.neoforged.bus.EventBus;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NucleonMod.MOD_ID);





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
