// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$886 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$886() {}
    static final VarHandle const$0 = constants$885.const$3.varHandle(MemoryLayout.PathElement.groupElement("interfaces"));
    static final VarHandle const$1 = constants$885.const$3.varHandle(MemoryLayout.PathElement.groupElement("nodes"));
    static final VarHandle const$2 = constants$885.const$3.varHandle(MemoryLayout.PathElement.groupElement("annotations"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dbus_annotation_info_lookup",
        constants$5.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_interface_info_lookup_method",
        constants$5.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dbus_interface_info_lookup_signal",
        constants$5.const$5
    );
}

