package wisniowa.tc.Singleton;

public class ResourceManager {
    private static ResourceManager instance = null;

    private ResourceManager() {
        // Prywatny konstruktor zapewniający, że nie można utworzyć instancji poza klasą.
    }

    public static ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }
    // Metody zarządzające zasobami, np. ładowanie, zapisywanie
}