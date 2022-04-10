package dk.sdu.mmmi.cbse.core.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall
{
    @Override
    public void restored()
    {
        Game game = new Game();
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "NetbeansLab1";
        cfg.width = 1280;
        cfg.height = 720;
        cfg.useGL30 = false;
        cfg.resizable = false;
        new LwjglApplication(game, cfg);
    }

}
