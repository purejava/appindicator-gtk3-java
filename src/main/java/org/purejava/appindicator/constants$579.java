// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$579 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$579() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_value_dup_param",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_value_take_param",
        constants$13.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_value_set_param_take_ownership",
        constants$13.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_param_spec_get_default_value",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_param_spec_get_name_quark",
        constants$10.const$5
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("instance_size"),
        JAVA_SHORT.withName("n_preallocs"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("instance_init"),
        JAVA_LONG.withName("value_type"),
        RuntimeHelper.POINTER.withName("finalize"),
        RuntimeHelper.POINTER.withName("value_set_default"),
        RuntimeHelper.POINTER.withName("value_validate"),
        RuntimeHelper.POINTER.withName("values_cmp")
    ).withName("_GParamSpecTypeInfo");
}


