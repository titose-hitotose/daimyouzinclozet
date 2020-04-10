package titose.daimyouzinclozet.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DaimyouzinClozetTabs {

	public static final CreativeTabs doresuup = new CreativeTabs("doresuup") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(DaimyouzinClozetArmor.item_armor1_chestplate);
		}

	};

	public static final CreativeTabs komono = new CreativeTabs("komono") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(DaimyouzinClozetBlocks.akusesutando1);
		}

	};
}
