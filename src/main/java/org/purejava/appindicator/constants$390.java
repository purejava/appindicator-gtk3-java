// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$390 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$390() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_option_group_set_translate_func",
        constants$42.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_option_group_set_translation_domain",
        constants$13.const$4
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(8, RuntimeHelper.POINTER).withName("dummy")
    ).withName("_GPathBuf");
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_path_buf_new",
        constants$35.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_path_buf_new_from_path",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_path_buf_init",
        constants$5.const$2
    );
}


