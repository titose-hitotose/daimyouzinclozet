package titose.daimyouzinclozet.init;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import titose.daimyouzinclozet.init.items.armor.Item_Armor1;
import titose.daimyouzinclozet.init.items.armor.Item_Armor2;
import titose.daimyouzinclozet.init.items.armor.Item_Armor3;
import titose.daimyouzinclozet.init.items.armor.Item_Armor4;



public class DaimyouzinClozetArmor {

	public static Item item_armor1_helmet,item_armor1_chestplate,item_armor1_boots;
	public static Item item_armor2_helmet,item_armor2_chestplate,item_armor2_boots;
	public static Item item_armor3_helmet,item_armor3_chestplate,item_armor3_boots;
	public static Item item_armor4_helmet,item_armor4_chestplate,item_armor4_boots;

	public static void init() {
		//アイテムのインスタンス(実体)生成

		item_armor1_helmet = new Item_Armor1(1,EntityEquipmentSlot.HEAD).setRegistryName("item_armor1_helmet").setUnlocalizedName("item_armor1_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor1_chestplate = new Item_Armor1(1,EntityEquipmentSlot.CHEST).setRegistryName("item_armor1_chestplate").setUnlocalizedName("item_armor1_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor1_boots = new Item_Armor1(1,EntityEquipmentSlot.FEET).setRegistryName("item_armor1_boots").setUnlocalizedName("item_armor1_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor2_helmet = new Item_Armor2(2,EntityEquipmentSlot.HEAD).setRegistryName("item_armor2_helmet").setUnlocalizedName("item_armor2_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor2_chestplate = new Item_Armor2(2,EntityEquipmentSlot.CHEST).setRegistryName("item_armor2_chestplate").setUnlocalizedName("item_armor2_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor2_boots = new Item_Armor2(2,EntityEquipmentSlot.FEET).setRegistryName("item_armor2_boots").setUnlocalizedName("item_armor2_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor3_helmet = new Item_Armor3(3,EntityEquipmentSlot.HEAD).setRegistryName("item_armor3_helmet").setUnlocalizedName("item_armor3_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor3_chestplate = new Item_Armor3(3,EntityEquipmentSlot.CHEST).setRegistryName("item_armor3_chestplate").setUnlocalizedName("item_armor3_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor3_boots = new Item_Armor3(3,EntityEquipmentSlot.FEET).setRegistryName("item_armor3_boots").setUnlocalizedName("item_armor3_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor4_helmet = new Item_Armor4(4,EntityEquipmentSlot.HEAD).setRegistryName("item_armor4_helmet").setUnlocalizedName("item_armor4_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor4_chestplate = new Item_Armor4(4,EntityEquipmentSlot.CHEST).setRegistryName("item_armor4_chestplate").setUnlocalizedName("item_armor4_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor4_boots = new Item_Armor4(4,EntityEquipmentSlot.FEET).setRegistryName("item_armor4_boots").setUnlocalizedName("item_armor4_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);
	}
	public static void register() {
		registerItem(item_armor1_helmet);
		registerItem(item_armor1_chestplate);
		registerItem(item_armor1_boots);

		registerItem(item_armor2_helmet);
		registerItem(item_armor2_chestplate);
		registerItem(item_armor2_boots);

		registerItem(item_armor3_helmet);
		registerItem(item_armor3_chestplate);
		registerItem(item_armor3_boots);

		registerItem(item_armor4_helmet);
		registerItem(item_armor4_chestplate);
		registerItem(item_armor4_boots);
	}
	public static void registerItem(Item item) {
		RegistrationHandler.ITEMS.add(item);
	}

	public static void registerRenders() {
		//アイテムのモデルを登録
		registerRender(item_armor1_helmet);
		registerRender(item_armor1_chestplate);
		registerRender(item_armor1_boots);

		registerRender(item_armor2_helmet);
		registerRender(item_armor2_chestplate);
		registerRender(item_armor2_boots);

		registerRender(item_armor3_helmet);
		registerRender(item_armor3_chestplate);
		registerRender(item_armor3_boots);

		registerRender(item_armor4_helmet);
		registerRender(item_armor4_chestplate);
		registerRender(item_armor4_boots);
	}
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}

	@Mod.EventBusSubscriber(modid = titose.daimyouzinclozet.main.Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Item> ITEMS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {

			DaimyouzinClozetArmor.init();
			DaimyouzinClozetArmor.register();
			ITEMS.stream().forEach(item -> event.getRegistry().register(item));
		}
	}


}

