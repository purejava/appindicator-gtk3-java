// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3057 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3057() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkScrollableInterface.get_border.class, "apply", constants$9.const$0);
    static final VarHandle const$1 = constants$3056.const$5.varHandle(MemoryLayout.PathElement.groupElement("get_border"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_scrollable_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_scrollable_get_hadjustment",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_scrollable_set_hadjustment",
        constants$13.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_scrollable_get_vadjustment",
        constants$5.const$2
    );
}


