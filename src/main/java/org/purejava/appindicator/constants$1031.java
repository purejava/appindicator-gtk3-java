// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1031 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1031() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_file_mount_enclosing_volume_finish",
        constants$12.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_file_mount_mountable$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_file_mount_mountable",
        constants$380.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_file_mount_mountable_finish",
        constants$23.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_file_unmount_mountable$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_file_unmount_mountable",
        constants$281.const$5
    );
}


