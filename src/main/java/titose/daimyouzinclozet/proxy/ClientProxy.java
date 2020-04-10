package titose.daimyouzinclozet.proxy;



import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import titose.daimyouzinclozet.init.DaimyouzinClozetArmor;
import titose.daimyouzinclozet.init.DaimyouzinClozetBlocks;
import titose.daimyouzinclozet.init.DaimyouzinClozetItems;
import titose.daimyouzinclozet.main.Reference;



public class ClientProxy extends CommonProxy{

	public static boolean rendering = false;
	public static Entity renderEntity = null;
	public static Entity backupEntity = null;

	/* エンティティの登録、コンフィグ読込など
	* Register Entity and Config. */
	@Override
	public void preInit() { }

	/* レシピ・鉱石などの追加 Register Recipe and Ore. */
	@Override
	public void init() { }

	/* 他Modとの連携 Cooperation with other Mod. */
	@Override
	public void postInit() { }

	/* シングルプレイかどうか Single play or not? */
	@Override
	public boolean isSinglePlayer() {
		return Minecraft.getMinecraft().isSingleplayer();
	}

	/* サーバープレイかどうか Sever play or not? */
	@Override
	public boolean isDedicatedServer() {
		return false;
	}


    /* ------------------------------------------------------------------------
     * ここから From here. ↓ */

	/* ドロップ時やインベントリにおける、アイテムやアイテムブロックの描画を登録する【内部クラス】
	 * Register rendering of Items and ItemBlocks in drop and inventory. 【Inner Classs】 */
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			DaimyouzinClozetBlocks.registerRenders();
			DaimyouzinClozetArmor.registerRenders();
			DaimyouzinClozetItems.registerRenders();



		}

	}





}