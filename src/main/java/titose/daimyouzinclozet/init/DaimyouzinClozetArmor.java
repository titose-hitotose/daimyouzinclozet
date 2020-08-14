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
import titose.daimyouzinclozet.init.items.armor.Item_Armor10;
import titose.daimyouzinclozet.init.items.armor.Item_Armor11;
import titose.daimyouzinclozet.init.items.armor.Item_Armor12;
import titose.daimyouzinclozet.init.items.armor.Item_Armor13;
import titose.daimyouzinclozet.init.items.armor.Item_Armor14;
import titose.daimyouzinclozet.init.items.armor.Item_Armor15;
import titose.daimyouzinclozet.init.items.armor.Item_Armor2;
import titose.daimyouzinclozet.init.items.armor.Item_Armor3;
import titose.daimyouzinclozet.init.items.armor.Item_Armor4;
import titose.daimyouzinclozet.init.items.armor.Item_Armor5;
import titose.daimyouzinclozet.init.items.armor.Item_Armor6;
import titose.daimyouzinclozet.init.items.armor.Item_Armor7;
import titose.daimyouzinclozet.init.items.armor.Item_Armor8;
import titose.daimyouzinclozet.init.items.armor.Item_Armor9;



public class DaimyouzinClozetArmor {

	public static Item item_armor1_helmet,item_armor1_chestplate,item_armor1_boots;
	public static Item item_armor2_helmet,item_armor2_chestplate,item_armor2_boots;
	public static Item item_armor3_helmet,item_armor3_chestplate,item_armor3_boots;
	public static Item item_armor4_helmet,item_armor4_chestplate,item_armor4_boots;
	public static Item item_armor5_helmet,item_armor5_chestplate,item_armor5_boots;
	public static Item item_armor6_helmet,item_armor6_chestplate,item_armor6_boots;
	public static Item item_armor7_helmet,item_armor7_chestplate,item_armor7_boots;
	public static Item item_armor8_helmet,item_armor8_chestplate,item_armor8_boots;
	public static Item item_armor9_helmet,item_armor9_chestplate,item_armor9_boots;
	public static Item item_armor10_helmet,item_armor10_chestplate,item_armor10_boots;
	public static Item item_armor11_helmet,item_armor11_chestplate,item_armor11_boots;
	public static Item item_armor12_helmet,item_armor12_chestplate,item_armor12_boots;
	public static Item item_armor13_helmet,item_armor13_chestplate,item_armor13_boots;
	public static Item item_armor14_helmet,item_armor14_chestplate,item_armor14_boots;
	public static Item item_armor15_helmet,item_armor15_chestplate,item_armor15_boots;


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

		item_armor5_helmet = new Item_Armor5(5,EntityEquipmentSlot.HEAD).setRegistryName("item_armor5_helmet").setUnlocalizedName("item_armor5_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor5_chestplate = new Item_Armor5(5,EntityEquipmentSlot.CHEST).setRegistryName("item_armor5_chestplate").setUnlocalizedName("item_armor5_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor5_boots = new Item_Armor5(5,EntityEquipmentSlot.FEET).setRegistryName("item_armor5_boots").setUnlocalizedName("item_armor5_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor6_helmet = new Item_Armor6(6,EntityEquipmentSlot.HEAD).setRegistryName("item_armor6_helmet").setUnlocalizedName("item_armor6_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor6_chestplate = new Item_Armor6(6,EntityEquipmentSlot.CHEST).setRegistryName("item_armor6_chestplate").setUnlocalizedName("item_armor6_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor6_boots = new Item_Armor6(6,EntityEquipmentSlot.FEET).setRegistryName("item_armor6_boots").setUnlocalizedName("item_armor6_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor7_helmet = new Item_Armor7(7,EntityEquipmentSlot.HEAD).setRegistryName("item_armor7_helmet").setUnlocalizedName("item_armor7_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor7_chestplate = new Item_Armor7(7,EntityEquipmentSlot.CHEST).setRegistryName("item_armor7_chestplate").setUnlocalizedName("item_armor7_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor7_boots = new Item_Armor7(7,EntityEquipmentSlot.FEET).setRegistryName("item_armor7_boots").setUnlocalizedName("item_armor7_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor8_helmet = new Item_Armor8(8,EntityEquipmentSlot.HEAD).setRegistryName("item_armor8_helmet").setUnlocalizedName("item_armor8_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor8_chestplate = new Item_Armor8(8,EntityEquipmentSlot.CHEST).setRegistryName("item_armor8_chestplate").setUnlocalizedName("item_armor8_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor8_boots = new Item_Armor8(8,EntityEquipmentSlot.FEET).setRegistryName("item_armor8_boots").setUnlocalizedName("item_armor8_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor9_helmet = new Item_Armor9(9,EntityEquipmentSlot.HEAD).setRegistryName("item_armor9_helmet").setUnlocalizedName("item_armor9_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor9_chestplate = new Item_Armor9(9,EntityEquipmentSlot.CHEST).setRegistryName("item_armor9_chestplate").setUnlocalizedName("item_armor9_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor9_boots = new Item_Armor9(9,EntityEquipmentSlot.FEET).setRegistryName("item_armor9_boots").setUnlocalizedName("item_armor9_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor10_helmet = new Item_Armor10(10,EntityEquipmentSlot.HEAD).setRegistryName("item_armor10_helmet").setUnlocalizedName("item_armor10_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor10_chestplate = new Item_Armor10(10,EntityEquipmentSlot.CHEST).setRegistryName("item_armor10_chestplate").setUnlocalizedName("item_armor10_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor10_boots = new Item_Armor10(10,EntityEquipmentSlot.FEET).setRegistryName("item_armor10_boots").setUnlocalizedName("item_armor10_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor11_helmet = new Item_Armor11(11,EntityEquipmentSlot.HEAD).setRegistryName("item_armor11_helmet").setUnlocalizedName("item_armor11_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor11_chestplate = new Item_Armor11(11,EntityEquipmentSlot.CHEST).setRegistryName("item_armor11_chestplate").setUnlocalizedName("item_armor11_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor11_boots = new Item_Armor11(11,EntityEquipmentSlot.FEET).setRegistryName("item_armor11_boots").setUnlocalizedName("item_armor11_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor12_helmet = new Item_Armor12(12,EntityEquipmentSlot.HEAD).setRegistryName("item_armor12_helmet").setUnlocalizedName("item_armor12_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor12_chestplate = new Item_Armor12(12,EntityEquipmentSlot.CHEST).setRegistryName("item_armor12_chestplate").setUnlocalizedName("item_armor12_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor12_boots = new Item_Armor12(12,EntityEquipmentSlot.FEET).setRegistryName("item_armor12_boots").setUnlocalizedName("item_armor12_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor13_helmet = new Item_Armor13(13,EntityEquipmentSlot.HEAD).setRegistryName("item_armor13_helmet").setUnlocalizedName("item_armor13_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor13_chestplate = new Item_Armor13(13,EntityEquipmentSlot.CHEST).setRegistryName("item_armor13_chestplate").setUnlocalizedName("item_armor13_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor13_boots = new Item_Armor13(13,EntityEquipmentSlot.FEET).setRegistryName("item_armor13_boots").setUnlocalizedName("item_armor13_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor14_helmet = new Item_Armor14(14,EntityEquipmentSlot.HEAD).setRegistryName("item_armor14_helmet").setUnlocalizedName("item_armor14_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor14_chestplate = new Item_Armor14(14,EntityEquipmentSlot.CHEST).setRegistryName("item_armor14_chestplate").setUnlocalizedName("item_armor14_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor14_boots = new Item_Armor14(14,EntityEquipmentSlot.FEET).setRegistryName("item_armor14_boots").setUnlocalizedName("item_armor14_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);

		item_armor15_helmet = new Item_Armor15(15,EntityEquipmentSlot.HEAD).setRegistryName("item_armor15_helmet").setUnlocalizedName("item_armor15_helmet").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor15_chestplate = new Item_Armor15(15,EntityEquipmentSlot.CHEST).setRegistryName("item_armor15_chestplate").setUnlocalizedName("item_armor15_chestplate").setCreativeTab(DaimyouzinClozetTabs.doresuup);
		item_armor15_boots = new Item_Armor15(15,EntityEquipmentSlot.FEET).setRegistryName("item_armor15_boots").setUnlocalizedName("item_armor15_boots").setCreativeTab(DaimyouzinClozetTabs.doresuup);
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

		registerItem(item_armor5_helmet);
		registerItem(item_armor5_chestplate);
		registerItem(item_armor5_boots);

		registerItem(item_armor6_helmet);
		registerItem(item_armor6_chestplate);
		registerItem(item_armor6_boots);

		registerItem(item_armor7_helmet);
		registerItem(item_armor7_chestplate);
		registerItem(item_armor7_boots);

		registerItem(item_armor8_helmet);
		registerItem(item_armor8_chestplate);
		registerItem(item_armor8_boots);

		registerItem(item_armor9_helmet);
		registerItem(item_armor9_chestplate);
		registerItem(item_armor9_boots);

		registerItem(item_armor10_helmet);
		registerItem(item_armor10_chestplate);
		registerItem(item_armor10_boots);

		registerItem(item_armor11_helmet);
		registerItem(item_armor11_chestplate);
		registerItem(item_armor11_boots);

		registerItem(item_armor12_helmet);
		registerItem(item_armor12_chestplate);
		registerItem(item_armor12_boots);

		registerItem(item_armor13_helmet);
		registerItem(item_armor13_chestplate);
		registerItem(item_armor13_boots);

		registerItem(item_armor14_helmet);
		registerItem(item_armor14_chestplate);
		registerItem(item_armor14_boots);

		registerItem(item_armor15_helmet);
		registerItem(item_armor15_chestplate);
		registerItem(item_armor15_boots);
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

		registerRender(item_armor5_helmet);
		registerRender(item_armor5_chestplate);
		registerRender(item_armor5_boots);

		registerRender(item_armor6_helmet);
		registerRender(item_armor6_chestplate);
		registerRender(item_armor6_boots);

		registerRender(item_armor7_helmet);
		registerRender(item_armor7_chestplate);
		registerRender(item_armor7_boots);

		registerRender(item_armor8_helmet);
		registerRender(item_armor8_chestplate);
		registerRender(item_armor8_boots);

		registerRender(item_armor9_helmet);
		registerRender(item_armor9_chestplate);
		registerRender(item_armor9_boots);

		registerRender(item_armor10_helmet);
		registerRender(item_armor10_chestplate);
		registerRender(item_armor10_boots);

		registerRender(item_armor11_helmet);
		registerRender(item_armor11_chestplate);
		registerRender(item_armor11_boots);

		registerRender(item_armor12_helmet);
		registerRender(item_armor12_chestplate);
		registerRender(item_armor12_boots);

		registerRender(item_armor13_helmet);
		registerRender(item_armor13_chestplate);
		registerRender(item_armor13_boots);

		registerRender(item_armor14_helmet);
		registerRender(item_armor14_chestplate);
		registerRender(item_armor14_boots);

		registerRender(item_armor15_helmet);
		registerRender(item_armor15_chestplate);
		registerRender(item_armor15_boots);
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

