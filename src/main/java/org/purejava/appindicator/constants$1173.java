// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1173 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1173() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_mount_unmount_with_operation",
        constants$380.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_mount_unmount_with_operation_finish",
        constants$12.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_mount_eject_with_operation$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_mount_eject_with_operation",
        constants$380.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_mount_eject_with_operation_finish",
        constants$12.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_mount_get_sort_key",
        constants$5.const$2
    );
}


