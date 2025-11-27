package net.lunavicta.thebiomesbetween.item.custom;

import net.lunavicta.thebiomesbetween.TheBiomesBetween;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheBiomesBetween.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
