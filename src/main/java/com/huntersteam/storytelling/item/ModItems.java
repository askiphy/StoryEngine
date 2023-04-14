package com.huntersteam.storytelling.item;

import com.huntersteam.storytelling.Storytelling;
import com.huntersteam.storytelling.item.custom.ManaShard;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Storytelling.MOD_ID);

    public static final RegistryObject<Item> MANA_SHARD = ITEMS.register("mana_shard",
            () -> new ManaShard(new Item.Properties().group(ModItemGroup.STORYTELLING_GROUP).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ZENHUNT_HEAD = ITEMS.register("zenhunt_head",
            () -> new Item(new Item.Properties().group(ModItemGroup.STORYTELLING_GROUP).rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
