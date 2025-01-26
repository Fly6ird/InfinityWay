package huix.infinity.common.world.item;

import huix.infinity.common.world.food.IFWFoods;
import huix.infinity.init.InfinityWay;
import huix.infinity.common.world.item.tier.EnumTier;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IFWItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(InfinityWay.MOD_ID);



    public static final DeferredItem<Item> flint_shard =
            ITEMS.registerSimpleItem("flint_shard", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> obsidian_shard =
            ITEMS.registerSimpleItem("obsidian_shard", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> emerald_shard =
            ITEMS.registerSimpleItem("emerald_shard", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> diamond_shard =
            ITEMS.registerSimpleItem("diamond_shard", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> glass_shard =
            ITEMS.registerSimpleItem("glass_shard", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> quartz_shard =
            ITEMS.registerSimpleItem("quartz_shard", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> sinew =
            ITEMS.registerSimpleItem("sinew", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> wooden_shovel =
            ITEMS.register("wooden_shovel", item -> new ShovelTool(EnumTier.WOOD, 400,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.WOOD,1.0F, -3.0F))));
    public static final DeferredItem<Item> wooden_cudgel =
            ITEMS.register("wooden_cudgel", item -> new ClubWeapon(EnumTier.WOOD, 1000,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.WOOD,3.0F, -2.4F))));
    public static final DeferredItem<Item> flint_hatchet =
            ITEMS.register("flint_hatchet", item -> new HatchetTool(EnumTier.FLINT, 360,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.FLINT,1.5F, -3.0F))));
    public static final DeferredItem<Item> flint_knife =
            ITEMS.register("flint_knife", item -> new KnifeWeapon(EnumTier.FLINT, 400,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.FLINT,2.5F, 0.0F))));
    public static final DeferredItem<Item> flint_shovel =
            ITEMS.register("flint_shovel", item -> new ShovelTool(EnumTier.FLINT, 400,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.FLINT,1.5F, -3.0F))));
    public static final DeferredItem<Item> flint_axe =
            ITEMS.register("flint_axe", item -> new AxeTool(EnumTier.FLINT, 1200.0F,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.FLINT,2.0F, -3.0F))));
    public static final DeferredItem<Item> raw_adamantium =
            ITEMS.registerSimpleItem("raw_adamantium", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> raw_mithril =
            ITEMS.registerSimpleItem("raw_mithril", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> raw_silver =
            ITEMS.registerSimpleItem("raw_silver", new Item.Properties().stacksTo(16));
    public static final DeferredItem<Item> adamantium_ingot =
            ITEMS.registerSimpleItem("adamantium_ingot", new Item.Properties().stacksTo(8));
    public static final DeferredItem<Item> adamantium_nugget =
            ITEMS.registerSimpleItem("adamantium_nugget", new Item.Properties());
    public static final DeferredItem<Item> adamantium_shears =
            ITEMS.register("adamantium_shears", item -> new ShearsWeapon(EnumTier.ADAMANTIUM,
                    new Item.Properties().component(DataComponents.TOOL, ShearsWeapon.createToolProperties())));
    public static final DeferredItem<Item> adamantium_shovel =
            ITEMS.register("adamantium_shovel", item -> new ShovelTool(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.ADAMANTIUM,1.0F, -3.0F))));
    public static final DeferredItem<Item> adamantium_hoe =
            ITEMS.register("adamantium_hoe", item -> new HoeTool(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(HoeTool.createAttributes(EnumTier.ADAMANTIUM,0F, -2.1F))));
    public static final DeferredItem<Item> adamantium_sword =
            ITEMS.register("adamantium_sword", item -> new SwordWeapon(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.ADAMANTIUM,4.0F, -2.4F))));
    public static final DeferredItem<Item> adamantium_pickaxe =
            ITEMS.register("adamantium_pickaxe", item -> new PickaxeTool(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.ADAMANTIUM, 2, -2.7F))));
    public static final DeferredItem<Item> adamantium_axe =
            ITEMS.register("adamantium_axe", item -> new AxeTool(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(AxeTool.createAttributes(EnumTier.ADAMANTIUM,3.0F, -3.1F))));
    public static final DeferredItem<Item> adamantium_scythe =
            ITEMS.register("adamantium_scythe", item -> new ScytheTool(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(ScytheTool.createAttributes(EnumTier.ADAMANTIUM,1.0F, -2.6F))));
    public static final DeferredItem<Item> adamantium_mattock =
            ITEMS.register("adamantium_mattock", item -> new MattockTool(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(MattockTool.createAttributes(EnumTier.ADAMANTIUM,0F, -2.6F))));
    public static final DeferredItem<Item> adamantium_battle_axe =
            ITEMS.register("adamantium_battle_axe", item -> new BattleAxeTool(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(BattleAxeTool.createAttributes(EnumTier.ADAMANTIUM,4.0F, -2.8F))));
    public static final DeferredItem<Item> adamantium_war_hammer =
            ITEMS.register("adamantium_war_hammer", item -> new WarHammerTool(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(WarHammerTool.createAttributes(EnumTier.ADAMANTIUM,4.0F, -2.8F))));
    public static final DeferredItem<Item> adamantium_dagger =
            ITEMS.register("adamantium_dagger", item -> new DaggerWeapon(EnumTier.ADAMANTIUM,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.ADAMANTIUM,4.0F, -1.5F))));
    public static final DeferredItem<Item> ancient_metal_ingot =
            ITEMS.registerSimpleItem("ancient_metal_ingot", new Item.Properties().stacksTo(8));
    public static final DeferredItem<Item> ancient_metal_nugget =
            ITEMS.registerSimpleItem("ancient_metal_nugget", new Item.Properties());
    public static final DeferredItem<Item> ancient_metal_shears =
            ITEMS.register("ancient_metal_shears", item -> new ShearsWeapon(EnumTier.ANCIENT_METAL,
                    new Item.Properties().component(DataComponents.TOOL, ShearsWeapon.createToolProperties())));
    public static final DeferredItem<Item> ancient_metal_shovel =
            ITEMS.register("ancient_metal_shovel", item -> new ShovelTool(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.ANCIENT_METAL,1.0F, -3.0F))));
    public static final DeferredItem<Item> ancient_metal_hoe =
            ITEMS.register("ancient_metal_hoe", item -> new HoeTool(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(HoeTool.createAttributes(EnumTier.ANCIENT_METAL,0F, -2.1F))));
    public static final DeferredItem<Item> ancient_metal_sword =
            ITEMS.register("ancient_metal_sword", item -> new SwordWeapon(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.ANCIENT_METAL,4.0F, -2.4F))));
    public static final DeferredItem<Item> ancient_metal_pickaxe =
            ITEMS.register("ancient_metal_pickaxe", item -> new PickaxeTool(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.ANCIENT_METAL, 2, -2.7F))));
    public static final DeferredItem<Item> ancient_metal_axe =
            ITEMS.register("ancient_metal_axe", item -> new AxeTool(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(AxeTool.createAttributes(EnumTier.ANCIENT_METAL,3.0F, -3.1F))));
    public static final DeferredItem<Item> ancient_metal_scythe =
            ITEMS.register("ancient_metal_scythe", item -> new ScytheTool(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(ScytheTool.createAttributes(EnumTier.ANCIENT_METAL,1.0F, -2.6F))));
    public static final DeferredItem<Item> ancient_metal_mattock =
            ITEMS.register("ancient_metal_mattock", item -> new MattockTool(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(MattockTool.createAttributes(EnumTier.ANCIENT_METAL,0F, -2.6F))));
    public static final DeferredItem<Item> ancient_metal_battle_axe =
            ITEMS.register("ancient_metal_battle_axe", item -> new BattleAxeTool(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(BattleAxeTool.createAttributes(EnumTier.ANCIENT_METAL,4.0F, -2.8F))));
    public static final DeferredItem<Item> ancient_metal_war_hammer =
            ITEMS.register("ancient_metal_war_hammer", item -> new WarHammerTool(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(WarHammerTool.createAttributes(EnumTier.ANCIENT_METAL,4.0F, -2.8F))));
    public static final DeferredItem<Item> ancient_metal_dagger =
            ITEMS.register("ancient_metal_dagger", item -> new DaggerWeapon(EnumTier.ANCIENT_METAL,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.ANCIENT_METAL,4.0F, -1.5F))));
    public static final DeferredItem<Item> mithril_ingot =
            ITEMS.registerSimpleItem("mithril_ingot", new Item.Properties().stacksTo(8));
    public static final DeferredItem<Item> mithril_nugget =
            ITEMS.registerSimpleItem("mithril_nugget", new Item.Properties());
    public static final DeferredItem<Item> mithril_shears =
            ITEMS.register("mithril_shears", item -> new ShearsWeapon(EnumTier.MITHRIL,
                    new Item.Properties().component(DataComponents.TOOL, ShearsWeapon.createToolProperties())));
    public static final DeferredItem<Item> mithril_shovel =
            ITEMS.register("mithril_shovel", item -> new ShovelTool(EnumTier.MITHRIL,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.MITHRIL,1.0F, -3.0F))));
    public static final DeferredItem<Item> mithril_hoe =
            ITEMS.register("mithril_hoe", item -> new HoeTool(EnumTier.MITHRIL,
                    new Item.Properties().attributes(HoeTool.createAttributes(EnumTier.MITHRIL,0F, -2.1F))));
    public static final DeferredItem<Item> mithril_sword =
            ITEMS.register("mithril_sword", item -> new SwordWeapon(EnumTier.MITHRIL,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.MITHRIL,4.0F, -2.4F))));
    public static final DeferredItem<Item> mithril_pickaxe =
            ITEMS.register("mithril_pickaxe", item -> new PickaxeTool(EnumTier.MITHRIL,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.MITHRIL, 2, -2.7F))));
    public static final DeferredItem<Item> mithril_axe =
            ITEMS.register("mithril_axe", item -> new AxeTool(EnumTier.MITHRIL,
                    new Item.Properties().attributes(AxeTool.createAttributes(EnumTier.MITHRIL,3.0F, -3.1F))));
    public static final DeferredItem<Item> mithril_scythe =
            ITEMS.register("mithril_scythe", item -> new ScytheTool(EnumTier.MITHRIL,
                    new Item.Properties().attributes(ScytheTool.createAttributes(EnumTier.MITHRIL,1.0F, -2.6F))));
    public static final DeferredItem<Item> mithril_mattock =
            ITEMS.register("mithril_mattock", item -> new MattockTool(EnumTier.MITHRIL,
                    new Item.Properties().attributes(MattockTool.createAttributes(EnumTier.MITHRIL,0F, -2.6F))));
    public static final DeferredItem<Item> mithril_battle_axe =
            ITEMS.register("mithril_battle_axe", item -> new BattleAxeTool(EnumTier.MITHRIL,
                    new Item.Properties().attributes(BattleAxeTool.createAttributes(EnumTier.MITHRIL,4.0F, -2.8F))));
    public static final DeferredItem<Item> mithril_war_hammer =
            ITEMS.register("mithril_war_hammer", item -> new WarHammerTool(EnumTier.MITHRIL,
                    new Item.Properties().attributes(WarHammerTool.createAttributes(EnumTier.MITHRIL,4.0F, -2.8F))));
    public static final DeferredItem<Item> mithril_dagger =
            ITEMS.register("mithril_dagger", item -> new DaggerWeapon(EnumTier.MITHRIL,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.MITHRIL,4.0F, -1.5F))));
    public static final DeferredItem<Item> silver_ingot =
            ITEMS.registerSimpleItem("silver_ingot", new Item.Properties().stacksTo(8));
    public static final DeferredItem<Item> silver_nugget =
            ITEMS.registerSimpleItem("silver_nugget", new Item.Properties());
    public static final DeferredItem<Item> silver_shears =
            ITEMS.register("silver_shears", item -> new ShearsWeapon(EnumTier.SILVER,
                    new Item.Properties().component(DataComponents.TOOL, ShearsWeapon.createToolProperties())));
    public static final DeferredItem<Item> silver_shovel =
            ITEMS.register("silver_shovel", item -> new ShovelTool(EnumTier.SILVER,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.SILVER,1.0F, -3.0F))));
    public static final DeferredItem<Item> silver_hoe =
            ITEMS.register("silver_hoe", item -> new HoeTool(EnumTier.SILVER,
                    new Item.Properties().attributes(HoeTool.createAttributes(EnumTier.SILVER,0F, -2.1F))));
    public static final DeferredItem<Item> silver_sword =
            ITEMS.register("silver_sword", item -> new SwordWeapon(EnumTier.SILVER,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.SILVER,4.0F, -2.4F))));
    public static final DeferredItem<Item> silver_pickaxe =
            ITEMS.register("silver_pickaxe", item -> new PickaxeTool(EnumTier.SILVER,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.SILVER, 2, -2.7F))));
    public static final DeferredItem<Item> silver_axe =
            ITEMS.register("silver_axe", item -> new AxeTool(EnumTier.SILVER,
                    new Item.Properties().attributes(AxeTool.createAttributes(EnumTier.SILVER,3.0F, -3.1F))));
    public static final DeferredItem<Item> silver_scythe =
            ITEMS.register("silver_scythe", item -> new ScytheTool(EnumTier.SILVER,
                    new Item.Properties().attributes(ScytheTool.createAttributes(EnumTier.SILVER,1.0F, -2.6F))));
    public static final DeferredItem<Item> silver_mattock =
            ITEMS.register("silver_mattock", item -> new MattockTool(EnumTier.SILVER,
                    new Item.Properties().attributes(MattockTool.createAttributes(EnumTier.SILVER,0F, -2.6F))));
    public static final DeferredItem<Item> silver_battle_axe =
            ITEMS.register("silver_battle_axe", item -> new BattleAxeTool(EnumTier.SILVER,
                    new Item.Properties().attributes(BattleAxeTool.createAttributes(EnumTier.SILVER,4.0F, -2.8F))));
    public static final DeferredItem<Item> silver_war_hammer =
            ITEMS.register("silver_war_hammer", item -> new WarHammerTool(EnumTier.SILVER,
                    new Item.Properties().attributes(WarHammerTool.createAttributes(EnumTier.SILVER,4.0F, -2.8F))));
    public static final DeferredItem<Item> silver_dagger =
            ITEMS.register("silver_dagger", item -> new DaggerWeapon(EnumTier.SILVER,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.SILVER,4.0F, -1.5F))));
    public static final DeferredItem<Item> copper_nugget =
            ITEMS.registerSimpleItem("copper_nugget", new Item.Properties().stacksTo(64));
    public static final DeferredItem<Item> copper_shears =
            ITEMS.register("copper_shears", item -> new ShearsWeapon(EnumTier.COPPER,
                    new Item.Properties().component(DataComponents.TOOL, ShearsWeapon.createToolProperties())));
    public static final DeferredItem<Item> copper_shovel =
            ITEMS.register("copper_shovel", item -> new ShovelTool(EnumTier.COPPER,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.COPPER,1.0F, -3.0F))));
    public static final DeferredItem<Item> copper_hoe =
            ITEMS.register("copper_hoe", item -> new HoeTool(EnumTier.COPPER,
                    new Item.Properties().attributes(HoeTool.createAttributes(EnumTier.COPPER,0F, -2.1F))));
    public static final DeferredItem<Item> copper_sword =
            ITEMS.register("copper_sword", item -> new SwordWeapon(EnumTier.COPPER,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.COPPER,4.0F, -2.4F))));
    public static final DeferredItem<Item> copper_pickaxe =
            ITEMS.register("copper_pickaxe", item -> new PickaxeTool(EnumTier.COPPER,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.COPPER, 2, -2.7F))));
    public static final DeferredItem<Item> copper_axe =
            ITEMS.register("copper_axe", item -> new AxeTool(EnumTier.COPPER,
                    new Item.Properties().attributes(AxeTool.createAttributes(EnumTier.COPPER,3.0F, -3.1F))));
    public static final DeferredItem<Item> copper_scythe =
            ITEMS.register("copper_scythe", item -> new ScytheTool(EnumTier.COPPER,
                    new Item.Properties().attributes(ScytheTool.createAttributes(EnumTier.COPPER,1.0F, -2.6F))));
    public static final DeferredItem<Item> copper_mattock =
            ITEMS.register("copper_mattock", item -> new MattockTool(EnumTier.COPPER,
                    new Item.Properties().attributes(MattockTool.createAttributes(EnumTier.COPPER,0F, -2.6F))));
    public static final DeferredItem<Item> copper_battle_axe =
            ITEMS.register("copper_battle_axe", item -> new BattleAxeTool(EnumTier.COPPER,
                    new Item.Properties().attributes(BattleAxeTool.createAttributes(EnumTier.COPPER,4.0F, -2.8F))));
    public static final DeferredItem<Item> copper_war_hammer =
            ITEMS.register("copper_war_hammer", item -> new WarHammerTool(EnumTier.COPPER,
                    new Item.Properties().attributes(WarHammerTool.createAttributes(EnumTier.COPPER,4.0F, -2.8F))));
    public static final DeferredItem<Item> copper_dagger =
            ITEMS.register("copper_dagger", item -> new DaggerWeapon(EnumTier.COPPER,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.COPPER,4.0F, -1.5F))));
    public static final DeferredItem<Item> iron_shears =
            ITEMS.register("iron_shears", item -> new ShearsWeapon(EnumTier.IRON,
                    new Item.Properties().component(DataComponents.TOOL, ShearsWeapon.createToolProperties())));
    public static final DeferredItem<Item> iron_shovel =
            ITEMS.register("iron_shovel", item -> new ShovelTool(EnumTier.IRON,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.IRON,1.0F, -3.0F))));
    public static final DeferredItem<Item> iron_hoe =
            ITEMS.register("iron_hoe", item -> new HoeTool(EnumTier.IRON,
                    new Item.Properties().attributes(HoeTool.createAttributes(EnumTier.IRON,0F, -2.1F))));
    public static final DeferredItem<Item> iron_sword =
            ITEMS.register("iron_sword", item -> new SwordWeapon(EnumTier.IRON,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.IRON,4.0F, -2.4F))));
    public static final DeferredItem<Item> iron_pickaxe =
            ITEMS.register("iron_pickaxe", item -> new PickaxeTool(EnumTier.IRON,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.IRON, 2, -2.7F))));
    public static final DeferredItem<Item> iron_axe =
            ITEMS.register("iron_axe", item -> new AxeTool(EnumTier.IRON,
                    new Item.Properties().attributes(AxeTool.createAttributes(EnumTier.IRON,3.0F, -3.1F))));
    public static final DeferredItem<Item> iron_scythe =
            ITEMS.register("iron_scythe", item -> new ScytheTool(EnumTier.IRON,
                    new Item.Properties().attributes(ScytheTool.createAttributes(EnumTier.IRON,1.0F, -2.6F))));
    public static final DeferredItem<Item> iron_mattock =
            ITEMS.register("iron_mattock", item -> new MattockTool(EnumTier.IRON,
                    new Item.Properties().attributes(MattockTool.createAttributes(EnumTier.IRON,0F, -2.6F))));
    public static final DeferredItem<Item> iron_battle_axe =
            ITEMS.register("iron_battle_axe", item -> new BattleAxeTool(EnumTier.IRON,
                    new Item.Properties().attributes(BattleAxeTool.createAttributes(EnumTier.IRON,4.0F, -2.8F))));
    public static final DeferredItem<Item> iron_war_hammer =
            ITEMS.register("iron_war_hammer", item -> new WarHammerTool(EnumTier.IRON,
                    new Item.Properties().attributes(WarHammerTool.createAttributes(EnumTier.IRON,4.0F, -2.8F))));
    public static final DeferredItem<Item> iron_dagger =
            ITEMS.register("iron_dagger", item -> new DaggerWeapon(EnumTier.IRON,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.IRON,4.0F, -1.5F))));
    public static final DeferredItem<Item> gold_shears =
            ITEMS.register("gold_shears", item -> new ShearsWeapon(EnumTier.GOLD,
                    new Item.Properties().component(DataComponents.TOOL, ShearsWeapon.createToolProperties())));
    public static final DeferredItem<Item> gold_shovel =
            ITEMS.register("gold_shovel", item -> new ShovelTool(EnumTier.GOLD,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.GOLD,1.0F, -3.0F))));
    public static final DeferredItem<Item> gold_hoe =
            ITEMS.register("gold_hoe", item -> new HoeTool(EnumTier.GOLD,
                    new Item.Properties().attributes(HoeTool.createAttributes(EnumTier.GOLD,0F, -2.1F))));
    public static final DeferredItem<Item> gold_sword =
            ITEMS.register("gold_sword", item -> new SwordWeapon(EnumTier.GOLD,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.GOLD,4.0F, -2.4F))));
    public static final DeferredItem<Item> gold_pickaxe =
            ITEMS.register("gold_pickaxe", item -> new PickaxeTool(EnumTier.GOLD,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.GOLD, 2, -2.7F))));
    public static final DeferredItem<Item> gold_axe =
            ITEMS.register("gold_axe", item -> new AxeTool(EnumTier.GOLD,
                    new Item.Properties().attributes(AxeTool.createAttributes(EnumTier.GOLD,3.0F, -3.1F))));
    public static final DeferredItem<Item> gold_scythe =
            ITEMS.register("gold_scythe", item -> new ScytheTool(EnumTier.GOLD,
                    new Item.Properties().attributes(ScytheTool.createAttributes(EnumTier.GOLD,1.0F, -2.6F))));
    public static final DeferredItem<Item> gold_mattock =
            ITEMS.register("gold_mattock", item -> new MattockTool(EnumTier.GOLD,
                    new Item.Properties().attributes(MattockTool.createAttributes(EnumTier.GOLD,0F, -2.6F))));
    public static final DeferredItem<Item> gold_battle_axe =
            ITEMS.register("gold_battle_axe", item -> new BattleAxeTool(EnumTier.GOLD,
                    new Item.Properties().attributes(BattleAxeTool.createAttributes(EnumTier.GOLD,4.0F, -2.8F))));
    public static final DeferredItem<Item> gold_war_hammer =
            ITEMS.register("gold_war_hammer", item -> new WarHammerTool(EnumTier.GOLD,
                    new Item.Properties().attributes(WarHammerTool.createAttributes(EnumTier.GOLD,4.0F, -2.8F))));
    public static final DeferredItem<Item> gold_dagger =
            ITEMS.register("gold_dagger", item -> new DaggerWeapon(EnumTier.GOLD,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.GOLD,4.0F, -1.5F))));
    public static final DeferredItem<Item> rusted_iron_shears =
            ITEMS.register("rusted_iron_shears", item -> new ShearsWeapon(EnumTier.RUSTED_IRON,
                    new Item.Properties().component(DataComponents.TOOL, ShearsWeapon.createToolProperties())));
    public static final DeferredItem<Item> rusted_iron_shovel =
            ITEMS.register("rusted_iron_shovel", item -> new ShovelTool(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(ShovelTool.createAttributes(EnumTier.RUSTED_IRON,1.0F, -3.0F))));
    public static final DeferredItem<Item> rusted_iron_hoe =
            ITEMS.register("rusted_iron_hoe", item -> new HoeTool(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(HoeTool.createAttributes(EnumTier.RUSTED_IRON,0F, -2.1F))));
    public static final DeferredItem<Item> rusted_iron_sword =
            ITEMS.register("rusted_iron_sword", item -> new SwordWeapon(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(SwordWeapon.createAttributes(EnumTier.RUSTED_IRON,4.0F, -2.4F))));
    public static final DeferredItem<Item> rusted_iron_pickaxe =
            ITEMS.register("rusted_iron_pickaxe", item -> new PickaxeTool(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.RUSTED_IRON, 2, -2.7F))));
    public static final DeferredItem<Item> rusted_iron_axe =
            ITEMS.register("rusted_iron_axe", item -> new AxeTool(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(AxeTool.createAttributes(EnumTier.RUSTED_IRON,3.0F, -3.1F))));
    public static final DeferredItem<Item> rusted_iron_scythe =
            ITEMS.register("rusted_iron_scythe", item -> new ScytheTool(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(ScytheTool.createAttributes(EnumTier.RUSTED_IRON,1.0F, -2.6F))));
    public static final DeferredItem<Item> rusted_iron_mattock =
            ITEMS.register("rusted_iron_mattock", item -> new MattockTool(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(MattockTool.createAttributes(EnumTier.RUSTED_IRON,0F, -2.6F))));
    public static final DeferredItem<Item> rusted_iron_battle_axe =
            ITEMS.register("rusted_iron_battle_axe", item -> new BattleAxeTool(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(BattleAxeTool.createAttributes(EnumTier.RUSTED_IRON,4.0F, -2.8F))));
    public static final DeferredItem<Item> rusted_iron_war_hammer =
            ITEMS.register("rusted_iron_war_hammer", item -> new WarHammerTool(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(WarHammerTool.createAttributes(EnumTier.RUSTED_IRON,4.0F, -2.8F))));
    public static final DeferredItem<Item> rusted_iron_dagger =
            ITEMS.register("rusted_iron_dagger", item -> new DaggerWeapon(EnumTier.RUSTED_IRON,
                    new Item.Properties().attributes(IFWDiggerItem.createAttributes(EnumTier.RUSTED_IRON,4.0F, -1.5F))));

    //Food
    public static final DeferredItem<Item> salad =
            ITEMS.registerSimpleItem("salad", new Item.Properties().stacksTo(4).food(IFWFoods.salad));
    public static final DeferredItem<Item> milk_bowl =
            ITEMS.registerSimpleItem("milk_bowl", new Item.Properties().stacksTo(4).food(IFWFoods.milk_bowl));
    public static final DeferredItem<Item> water_bowl =
            ITEMS.registerSimpleItem("water_bowl", new Item.Properties().stacksTo(4));
    public static final DeferredItem<Item> cheese =
            ITEMS.registerSimpleItem("cheese", new Item.Properties().stacksTo(8).food(IFWFoods.cheese));
    public static final DeferredItem<Item> dough =
            ITEMS.registerSimpleItem("dough", new Item.Properties().stacksTo(8).food(IFWFoods.dough));
    public static final DeferredItem<Item> chocolate =
            ITEMS.registerSimpleItem("chocolate", new Item.Properties().stacksTo(16).food(IFWFoods.chocolate));
    public static final DeferredItem<Item> cereal =
            ITEMS.registerSimpleItem("cereal", new Item.Properties().stacksTo(4).food(IFWFoods.cereal));
    public static final DeferredItem<Item> pumpkin_soup =
            ITEMS.registerSimpleItem("pumpkin_soup", new Item.Properties().stacksTo(4).food(IFWFoods.pumpkin_soup));
    public static final DeferredItem<Item> mushroom_soup_cream =
            ITEMS.registerSimpleItem("mushroom_soup_cream", new Item.Properties().stacksTo(4).food(IFWFoods.mushroom_soup_cream));
    public static final DeferredItem<Item> vegetable_soup =
            ITEMS.registerSimpleItem("vegetable_soup", new Item.Properties().stacksTo(4).food(IFWFoods.vegetable_soup));
    public static final DeferredItem<Item> vegetable_soup_cream =
            ITEMS.registerSimpleItem("vegetable_soup_cream", new Item.Properties().stacksTo(4).food(IFWFoods.vegetable_soup_cream));
    public static final DeferredItem<Item> chicken_soup =
            ITEMS.registerSimpleItem("chicken_soup", new Item.Properties().stacksTo(4).food(IFWFoods.chicken_soup));
    public static final DeferredItem<Item> beef_stew =
            ITEMS.registerSimpleItem("beef_stew", new Item.Properties().stacksTo(4).food(IFWFoods.beef_stew));
    public static final DeferredItem<Item> porridge =
            ITEMS.registerSimpleItem("porridge", new Item.Properties().stacksTo(4).food(IFWFoods.porridge));
    public static final DeferredItem<Item> sorbet =
            ITEMS.registerSimpleItem("sorbet", new Item.Properties().stacksTo(4).food(IFWFoods.sorbet));
    public static final DeferredItem<Item> mashed_potato =
            ITEMS.registerSimpleItem("mashed_potato", new Item.Properties().stacksTo(4).food(IFWFoods.mashed_potato));
    public static final DeferredItem<Item> ice_cream =
            ITEMS.registerSimpleItem("ice_cream", new Item.Properties().stacksTo(4).food(IFWFoods.ice_cream));
    public static final DeferredItem<Item> orange =
            ITEMS.registerSimpleItem("orange", new Item.Properties().stacksTo(16).food(IFWFoods.orange));
    public static final DeferredItem<Item> banana =
            ITEMS.registerSimpleItem("banana", new Item.Properties().stacksTo(16).food(IFWFoods.banana));
    public static final DeferredItem<Item> cooked_worm =
            ITEMS.registerSimpleItem("cooked_worm", new Item.Properties().stacksTo(16).food(IFWFoods.cooked_worm));
    public static final DeferredItem<Item> worm =
            ITEMS.registerSimpleItem("worm", new Item.Properties().stacksTo(16).food(IFWFoods.worm));
}
