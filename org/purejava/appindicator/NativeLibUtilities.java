package org.purejava.appindicator;

public class NativeLibUtilities {
    public static boolean isLoadedNativeLib() {
        return RuntimeHelper.isLoaded();
    }
}
