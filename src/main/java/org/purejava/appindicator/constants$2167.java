// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2167 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2167() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkApplicationClass.window_added.class, "apply", constants$13.const$4);
    static final VarHandle const$1 = constants$2166.const$5.varHandle(MemoryLayout.PathElement.groupElement("window_added"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GtkApplicationClass.window_removed.class, "apply", constants$13.const$4);
    static final VarHandle const$3 = constants$2166.const$5.varHandle(MemoryLayout.PathElement.groupElement("window_removed"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_application_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_application_new",
        constants$21.const$3
    );
}

