package src;

import src.components.base.Frame;
import src.components.components.AbstractScreen;
import src.components.components.MainScreen;

import java.util.HashMap;
import java.util.Map;

public class App extends Frame {
    private Map<String, AbstractScreen> screens;
    public App() {
        super(
                "Java Algorithm Visualizer",
                0, 0, Config.DEVICE_WIDTH, Config.DEVICE_HEIGHT,
                Config.BACKGROUND_COLOR_APP,
                Config.MONOSPACED_BOLD_18
        );
        setIconImage(Config.LOGO.getImage());
        addScreens();
        repaint();
    }

    public void addScreens() {
        screens = new HashMap<>();
        AbstractScreen mainScreen = new MainScreen();
        addScreen(mainScreen);
    }

    public void addScreen(AbstractScreen screen) {
        add(screen);
        screens.put(screen.getClass().getSimpleName(), screen);
    }

    public Map<String, AbstractScreen> getScreens() {
        return screens;
    }
}
