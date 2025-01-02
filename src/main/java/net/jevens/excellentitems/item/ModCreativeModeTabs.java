package net.jevens.excellentitems.item;

import net.jevens.excellentitems.ExcellentItems;
import net.jevens.excellentitems.block.ModBlocks;
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
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExcellentItems.MOD_ID);

    public static final Supplier<CreativeModeTab> XYLITE_ITEMS_TAB = CREATIVE_MODE_TAB.register(
            "xylite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.XYLITE.get()))
                    .title(Component.translatable("creativetab.excellentitems.xylite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.XYLITE);
                        output.accept(ModItems.PHILOSOPHERS_STONE);
                    }).build());

    public static final Supplier<CreativeModeTab> XYLITE_BLOCK_TAB = CREATIVE_MODE_TAB.register(
            "xylite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.XYLITE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ExcellentItems.MOD_ID,
                            "xylite_items_tab"))
                    .title(Component.translatable("creativetab.excellentitems.xylite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.XYLITE_BLOCK);
                        output.accept(ModBlocks.XYLITE_ORE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
