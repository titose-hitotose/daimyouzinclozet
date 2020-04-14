package titose.daimyouzinclozet.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class DaimyouzinClozetArmorMaterial {

	public static ArmorMaterial item_armor1 = EnumHelper
			.addArmorMaterial("item_armor1", "daimyouzinclozet:item_armor1", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static ArmorMaterial item_armor2 = EnumHelper
			.addArmorMaterial("item_armor2", "daimyouzinclozet:item_armor2", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static ArmorMaterial item_armor3 = EnumHelper
			.addArmorMaterial("item_armor3", "daimyouzinclozet:item_armor3", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static ArmorMaterial item_armor4 = EnumHelper
			.addArmorMaterial("item_armor4", "daimyouzinclozet:item_armor4", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	/* .addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	 * name "Material名"
	 * textureName テクスチャの名前 "Modid:pngファイル名の_layer前まで"
	 * durability 防具の耐久度 革5 鉄15 金7 ダイヤモンド33
	 * reductionAmounts 各部の防御ポイント 革{ 1, 2, 3, 1 }、鉄{ 2, 5, 6, 2 }、金{ 1, 3, 5, 2 }、ダイヤモンド{ 3, 6, 8, 3 }
	 * enchantability 数値が大きいほど良いエンチャントが付き易い 革15、鉄9、金25、ダイヤモンド10
	 * soundOnEquip 効果音
	 * toughness タフネス、ダメージカット率をより上げる デフォルト0 ダイヤモンドのみ2 */


}
