package huix.infinity.init;

import huix.infinity.common.world.food.IFWFoods;
import huix.infinity.common.world.food.RebuildFoods;
import huix.infinity.common.world.item.IFWItems;
import huix.infinity.util.ReplaceHelper;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;

@EventBusSubscriber(modid = InfinityWay.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class IFWLoad {

    @SubscribeEvent
    public static void injectFood(final FMLLoadCompleteEvent event) {
        ReplaceHelper.foodOverride(Items.APPLE, RebuildFoods.APPLE);
        ReplaceHelper.foodAdd(Items.APPLE, IFWFoods.apple);
        ReplaceHelper.foodOverride(Items.BREAD, RebuildFoods.BREAD);
        ReplaceHelper.foodOverride(Items.PORKCHOP, RebuildFoods.PORKCHOP);
        ReplaceHelper.foodAdd(Items.PORKCHOP, IFWFoods.porkchop);
        ReplaceHelper.foodOverride(Items.COOKED_PORKCHOP, RebuildFoods.COOKED_PORKCHOP);
        ReplaceHelper.foodAdd(Items.COOKED_PORKCHOP, IFWFoods.cooked_porkchop);
        ReplaceHelper.foodOverride(Items.ENCHANTED_GOLDEN_APPLE, RebuildFoods.ENCHANTED_GOLDEN_APPLE);
        ReplaceHelper.foodAdd(Items.ENCHANTED_GOLDEN_APPLE, IFWFoods.enchanted_golden_apple);
        ReplaceHelper.foodAdd(Items.COD, IFWFoods.cod);
        ReplaceHelper.foodAdd(Items.SALMON, IFWFoods.salmon);
        ReplaceHelper.foodOverride(Items.PUFFERFISH, RebuildFoods.PUFFERFISH);
        ReplaceHelper.foodAdd(Items.COOKED_COD, IFWFoods.cooked_cod);
        ReplaceHelper.foodOverride(Items.COOKED_SALMON, RebuildFoods.COOKED_SALMON);
        ReplaceHelper.foodAdd(Items.COOKED_SALMON, IFWFoods.salmon);
        ReplaceHelper.foodOverride(Items.COOKIE, RebuildFoods.COOKIE);
        ReplaceHelper.foodAdd(Items.COOKIE, IFWFoods.cookie);
        ReplaceHelper.foodOverride(Items.MELON_SLICE, RebuildFoods.MELON_SLICE);
        ReplaceHelper.foodAdd(Items.MELON_SLICE, IFWFoods.melon_slice);
        ReplaceHelper.foodOverride(Items.DRIED_KELP, RebuildFoods.DRIED_KELP);
        ReplaceHelper.foodAdd(Items.DRIED_KELP, IFWFoods.dried_kelp);
        ReplaceHelper.foodOverride(Items.BEEF, RebuildFoods.BEEF);
        ReplaceHelper.foodAdd(Items.BEEF, IFWFoods.beef);
        ReplaceHelper.foodOverride(Items.COOKED_BEEF, RebuildFoods.COOKED_BEEF);
        ReplaceHelper.foodAdd(Items.COOKED_BEEF, IFWFoods.cooked_beef);
        ReplaceHelper.foodOverride(Items.CHICKEN, RebuildFoods.CHICKEN);
        ReplaceHelper.foodAdd(Items.CHICKEN, IFWFoods.chicken);
        ReplaceHelper.foodAdd(Items.COOKED_CHICKEN, IFWFoods.chicken);
        ReplaceHelper.foodOverride(Items.ROTTEN_FLESH, RebuildFoods.ROTTEN_FLESH);
        ReplaceHelper.foodAdd(Items.ROTTEN_FLESH, IFWFoods.rotten_flesh);
        ReplaceHelper.foodOverride(Items.SPIDER_EYE, RebuildFoods.SPIDER_EYE);
        ReplaceHelper.foodAdd(Items.SPIDER_EYE, IFWFoods.spider_eye);
        ReplaceHelper.foodOverride(Items.CARROT, RebuildFoods.CARROT);
        ReplaceHelper.foodAdd(Items.CARROT, IFWFoods.carrot);
        ReplaceHelper.foodOverride(Items.BAKED_POTATO, RebuildFoods.BAKED_POTATO);
        ReplaceHelper.foodOverride(Items.POISONOUS_POTATO, RebuildFoods.POISONOUS_POTATO);
        ReplaceHelper.foodOverride(Items.GOLDEN_CARROT, RebuildFoods.GOLDEN_CARROT);
        ReplaceHelper.foodAdd(Items.GOLDEN_CARROT, IFWFoods.golden_carror);
        ReplaceHelper.foodOverride(Items.PUMPKIN_PIE, RebuildFoods.PUMPKIN_PIE);
        ReplaceHelper.foodAdd(Items.PUMPKIN_PIE, IFWFoods.pumpkin_pie);
        ReplaceHelper.foodOverride(Items.RABBIT, RebuildFoods.RABBIT);
        ReplaceHelper.foodAdd(Items.RABBIT, IFWFoods.rabbit);
        ReplaceHelper.foodOverride(Items.COOKED_RABBIT, RebuildFoods.COOKED_RABBIT);
        ReplaceHelper.foodAdd(Items.COOKED_RABBIT, IFWFoods.cooked_rabbit);
        ReplaceHelper.foodAdd(Items.RABBIT_STEW, IFWFoods.rabbit_stew);
        ReplaceHelper.foodOverride(Items.MUTTON, RebuildFoods.MUTTON);
        ReplaceHelper.foodAdd(Items.MUTTON, IFWFoods.mutton);
        ReplaceHelper.foodOverride(Items.COOKED_MUTTON, RebuildFoods.COOKED_MUTTON);
        ReplaceHelper.foodAdd(Items.COOKED_MUTTON, IFWFoods.cooked_mutton);
        ReplaceHelper.foodOverride(Items.BEETROOT, RebuildFoods.BEETROOT);
        ReplaceHelper.foodAdd(Items.BEETROOT, IFWFoods.beefroot);
        ReplaceHelper.foodAdd(Items.BEETROOT_SOUP, IFWFoods.beefroot_soup);
        ReplaceHelper.foodOverride(Items.SWEET_BERRIES, RebuildFoods.SWEET_BERRIES);
        ReplaceHelper.foodAdd(Items.SWEET_BERRIES, IFWFoods.sweet_berries);
        ReplaceHelper.foodOverride(Items.HONEY_BOTTLE, RebuildFoods.HONEY_BOTTLE);
        ReplaceHelper.foodAdd(Items.HONEY_BOTTLE, IFWFoods.honey_bottle);
        ReplaceHelper.foodOverride(Items.POTATO, RebuildFoods.POTATO);
        ReplaceHelper.foodOverride(Items.GOLDEN_APPLE, RebuildFoods.GOLDEN_APPLE);
        ReplaceHelper.foodAdd(Items.GOLDEN_APPLE, IFWFoods.golden_apple);
        ReplaceHelper.foodOverride(Items.GLOW_BERRIES, RebuildFoods.GLOW_BERRIES);
        ReplaceHelper.foodOverride(Items.WHEAT_SEEDS, IFWFoods.wheat_seeds);
        ReplaceHelper.foodAdd(Items.MILK_BUCKET, IFWFoods.ifw_milk_bucket);
        ReplaceHelper.foodOverride(Items.MILK_BUCKET, IFWFoods.milk_bucket);
        ReplaceHelper.foodOverride(Items.BROWN_MUSHROOM, IFWFoods.brown_mushroom);
        ReplaceHelper.foodOverride(Items.RED_MUSHROOM, IFWFoods.red_mushroom);
        ReplaceHelper.foodOverride(Items.PUMPKIN_SEEDS, IFWFoods.pumpkin_seed);
        ReplaceHelper.foodAdd(Items.SUGAR, IFWFoods.ifw_sugar);
        ReplaceHelper.foodOverride(Items.SUGAR, IFWFoods.sugar);
        ReplaceHelper.foodOverride(Items.EGG, IFWFoods.egg);
        ReplaceHelper.foodAdd(Items.EGG, IFWFoods.ifw_egg);
        ReplaceHelper.foodOverride(Items.WHEAT_SEEDS, IFWFoods.wheat_seeds);
        ReplaceHelper.foodAdd(Items.MILK_BUCKET, IFWFoods.ifw_milk_bucket);
        ReplaceHelper.foodOverride(Items.WHEAT_SEEDS, IFWFoods.wheat_seeds);
        ReplaceHelper.foodAdd(Items.MILK_BUCKET, IFWFoods.ifw_milk_bucket);
        ReplaceHelper.foodOverride(Items.NETHER_WART, IFWFoods.nether_wart);
        ReplaceHelper.foodOverride(Items.MELON_SEEDS, IFWFoods.melon_seed);
        ReplaceHelper.foodOverride(Items.BEETROOT_SEEDS, IFWFoods.beetroot_seeds);


        ReplaceHelper.foodAdd(IFWItems.salad.get(), IFWFoods.ifw_salad);
        ReplaceHelper.foodAdd(IFWItems.milk_bowl.get(), IFWFoods.ifw_milk_bowl);
        ReplaceHelper.foodAdd(IFWItems.water_bowl.get(), IFWFoods.ifw_bowl_water);
        ReplaceHelper.foodAdd(IFWItems.cheese.get(), IFWFoods.ifw_cheese);
        ReplaceHelper.foodAdd(IFWItems.chocolate.get(), IFWFoods.ifw_chocolate);
        ReplaceHelper.foodAdd(IFWItems.cereal.get(), IFWFoods.ifw_cereal);

        ReplaceHelper.foodAdd(IFWItems.pumpkin_soup.get(), IFWFoods.ifw_pumpkin_soup);
        ReplaceHelper.foodAdd(IFWItems.mushroom_soup_cream.get(), IFWFoods.ifw_mushroom_soup_cream);
        ReplaceHelper.foodAdd(IFWItems.vegetable_soup.get(), IFWFoods.ifw_vegetable_soup);
        ReplaceHelper.foodAdd(IFWItems.vegetable_soup_cream.get(), IFWFoods.ifw_vegetable_soup_cream);
        ReplaceHelper.foodAdd(IFWItems.chicken_soup.get(), IFWFoods.ifw_chicken_soup);
        ReplaceHelper.foodAdd(IFWItems.beef_stew.get(), IFWFoods.ifw_beef_stew);
        ReplaceHelper.foodAdd(IFWItems.porridge.get(), IFWFoods.ifw_porridge);
        ReplaceHelper.foodAdd(IFWItems.sorbet.get(), IFWFoods.ifw_sorbet);
        ReplaceHelper.foodAdd(IFWItems.mashed_potato.get(), IFWFoods.ifw_mashed_potato);
        ReplaceHelper.foodAdd(IFWItems.ice_cream.get(), IFWFoods.ifw_ice_cream);
        ReplaceHelper.foodAdd(IFWItems.orange.get(), IFWFoods.ifw_orange);
        ReplaceHelper.foodAdd(IFWItems.banana.get(), IFWFoods.ifw_banana);
        ReplaceHelper.foodAdd(IFWItems.cooked_worm.get(), IFWFoods.ifw_cooked_worm);
        ReplaceHelper.foodAdd(IFWItems.worm.get(), IFWFoods.ifw_worm);
    }
}
