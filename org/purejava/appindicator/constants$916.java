// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$916 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$916() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GDBusObjectManagerClientClass.interface_proxy_signal.class, "apply", constants$338.const$3);
    static final VarHandle const$1 = constants$915.const$5.varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_signal"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GDBusObjectManagerClientClass.interface_proxy_properties_changed.class, "apply", constants$331.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$331.const$1
    );
    static final VarHandle const$4 = constants$915.const$5.varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_properties_changed"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_get_type",
        constants$3.const$5
    );
}


