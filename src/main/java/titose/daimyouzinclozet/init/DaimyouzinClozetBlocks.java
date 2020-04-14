package titose.daimyouzinclozet.init;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import titose.daimyouzinclozet.init.blocks.Akusesutando1;
import titose.daimyouzinclozet.init.blocks.Akusesutando2;
import titose.daimyouzinclozet.init.blocks.Fuku1;
import titose.daimyouzinclozet.main.Reference;

public class DaimyouzinClozetBlocks {
	 /* 追加するブロックの宣言 Declare blocks to add. */

    public static Block akusesutando1;
    public static Block akusesutando2;
    public static Block fuku1;


    /* ブロックのインスタンスを生成 Instantiate blocks. */
    public static void init() {

        akusesutando1 = new Akusesutando1().setRegistryName("akusesutando1")
        		.setUnlocalizedName("akusesutando1").setCreativeTab(DaimyouzinClozetTabs.komono);
        akusesutando2 = new Akusesutando2().setRegistryName("akusesutando2")
        		.setUnlocalizedName("akusesutando2").setCreativeTab(DaimyouzinClozetTabs.komono);
        fuku1 = new Fuku1().setRegistryName("fuku1")
        		.setUnlocalizedName("fuku1").setCreativeTab(DaimyouzinClozetTabs.komono);

    }


    /* ブロックを登録する、ここから Register Blocks. From here. ↓*/
    public static void register() {
        registerBlockNotItem(akusesutando1);
        registerBlockNotItem(akusesutando2);
        registerBlockNotItem(fuku1);


    }


    /** ブロックの登録 Register Blocks. **/
    public static void registerBlockNotItem(Block block) {
        registerBlockNotItem(block, new ItemBlock(block));
    }

    /** アイテムブロックの登録 Register ItemBlocks. **/
    public static void registerBlockNotItem(Block block, ItemBlock item) {
        RegistrationHandler.BLOCKS.add(block);
        item.setRegistryName(block.getRegistryName());
        DaimyouzinClozetItems.RegistrationHandler.ITEMS.add(item);
    }

    /*ここまで So far↑ */


    /* ドロップ時やインベントリにおける、アイテムブロックの描画を登録。ここから↓
    * Register rendering of ItemBlocks in drop and inventory. From here↓*/
    public static void registerRenders() {
        registerRender(akusesutando1);
        registerRender(akusesutando2);
        registerRender(fuku1);

    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }


    /*ここまで So far↑ */


    /* ------------------------------------------------------------------------
     * ここから From here. ↓ */

    /* ブロックの登録を行う【内部クラス】
     * Register blocks 【Inner Class】 */
    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
    public static class RegistrationHandler {

        public static final List<Block> BLOCKS = new LinkedList<>();

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Block> event) {

            DaimyouzinClozetBlocks.init();
            DaimyouzinClozetBlocks.register();
            BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
        }
    }

}