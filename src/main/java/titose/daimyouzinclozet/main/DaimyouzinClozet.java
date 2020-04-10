package titose.daimyouzinclozet.main;

import java.util.logging.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import titose.daimyouzinclozet.proxy.CommonProxy;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME,
version = Reference.MOD_VERSION)


public class DaimyouzinClozet {

	 /* クラス(設計書)をインスタンス(製品)にする Change Class to Instance. */
    @Instance
    public static DaimyouzinClozet instance;

    /* プロキシの登録 Register Proxy. */
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
                serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    /* エラーログの出力 Output Error log. */
    public static Logger logger;



    /* エンティティの登録、コンフィグ読込など
    * Register Entity and Config. */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();




    }

    /* 他Modとの連携 Cooperation with other Mod. */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();

    }



}
