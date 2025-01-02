package net.jevens.excellentitems.item;

import net.jevens.excellentitems.ExcellentItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ExcellentItems.MOD_ID);

    public static final DeferredItem<Item> XYLITE = ITEMS.register("xylite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHILOSOPHERS_STONE = ITEMS.register(
            "philosophers_stone", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
