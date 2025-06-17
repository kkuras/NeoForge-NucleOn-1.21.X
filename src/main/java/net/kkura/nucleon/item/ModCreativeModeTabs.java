package net.kkura.nucleon.item;

import net.kkura.nucleon.NucleonMod;
import net.kkura.nucleon.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NucleonMod.MOD_ID);

    public static final Supplier<CreativeModeTab> NUCLEON_ITEMS_TAB = CREATIVE_MODE_TAB.register("nucleon_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NIOBIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.tutorialmod.nucleon_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NIOBIUM_INGOT);


                    }).build());

    public static final Supplier<CreativeModeTab> NUCLEON_BLOCK_TAB = CREATIVE_MODE_TAB.register("nucleon_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.FUSION_CASING.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(NucleonMod.MOD_ID, "nucleon_items_tab"))
                    .title(Component.translatable("creativetab.tutorialmod.nucleon_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.FUSION_CASING);





                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
