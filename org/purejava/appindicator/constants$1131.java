// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1131 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1131() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_list_model_get_object",
        constants$21.const$3
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_list_model_items_changed",
        constants$1131.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_list_store_get_type",
        constants$3.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_LONG.withName("g_type")
            ).withName("g_type_class"),
            RuntimeHelper.POINTER.withName("construct_properties"),
            RuntimeHelper.POINTER.withName("constructor"),
            RuntimeHelper.POINTER.withName("set_property"),
            RuntimeHelper.POINTER.withName("get_property"),
            RuntimeHelper.POINTER.withName("dispose"),
            RuntimeHelper.POINTER.withName("finalize"),
            RuntimeHelper.POINTER.withName("dispatch_properties_changed"),
            RuntimeHelper.POINTER.withName("notify"),
            RuntimeHelper.POINTER.withName("constructed"),
            JAVA_LONG.withName("flags"),
            JAVA_LONG.withName("n_construct_properties"),
            RuntimeHelper.POINTER.withName("pspecs"),
            JAVA_LONG.withName("n_pspecs"),
            MemoryLayout.sequenceLayout(3, RuntimeHelper.POINTER).withName("pdummy")
        ).withName("parent_class")
    ).withName("GListStoreClass");
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_list_store_new",
        constants$63.const$3
    );
}


