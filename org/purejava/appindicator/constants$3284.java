// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3284 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3284() {}
    static final VarHandle const$0 = constants$3283.const$0.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GtkColorSelectionDialogClass._gtk_reserved4.class, "apply", constants$7.const$5);
    static final VarHandle const$2 = constants$3283.const$0.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_color_selection_dialog_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_color_selection_dialog_new",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_color_selection_dialog_get_color_selection",
        constants$5.const$2
    );
}


