// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1929 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1929() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gdk_keymap_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gdk_keymap_get_default",
        constants$35.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gdk_keymap_get_for_display",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gdk_keymap_lookup_key",
        constants$9.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gdk_keymap_translate_keyboard_state",
        constants$1929.const$4
    );
}


