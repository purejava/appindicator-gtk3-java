// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3009 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3009() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_range_get_round_digits",
        constants$10.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("display_name"),
        RuntimeHelper.POINTER.withName("description"),
        RuntimeHelper.POINTER.withName("mime_type"),
        RuntimeHelper.POINTER.withName("app_name"),
        RuntimeHelper.POINTER.withName("app_exec"),
        RuntimeHelper.POINTER.withName("groups"),
        JAVA_INT.withName("is_private"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GtkRecentData");
    static final VarHandle const$2 = constants$3009.const$1.varHandle(MemoryLayout.PathElement.groupElement("display_name"));
    static final VarHandle const$3 = constants$3009.const$1.varHandle(MemoryLayout.PathElement.groupElement("description"));
    static final VarHandle const$4 = constants$3009.const$1.varHandle(MemoryLayout.PathElement.groupElement("mime_type"));
    static final VarHandle const$5 = constants$3009.const$1.varHandle(MemoryLayout.PathElement.groupElement("app_name"));
}

