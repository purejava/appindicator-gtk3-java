// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$553 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$553() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(GTypeClassCacheFunc.class, "apply", constants$9.const$0);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(GTypeInterfaceCheckFunc.class, "apply", constants$13.const$4);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("class_size"),
        MemoryLayout.paddingLayout(6),
        RuntimeHelper.POINTER.withName("base_init"),
        RuntimeHelper.POINTER.withName("base_finalize"),
        RuntimeHelper.POINTER.withName("class_init"),
        RuntimeHelper.POINTER.withName("class_finalize"),
        RuntimeHelper.POINTER.withName("class_data"),
        JAVA_SHORT.withName("instance_size"),
        JAVA_SHORT.withName("n_preallocs"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("instance_init"),
        RuntimeHelper.POINTER.withName("value_table")
    ).withName("_GTypeInfo");
    static final VarHandle const$3 = constants$553.const$2.varHandle(MemoryLayout.PathElement.groupElement("class_size"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GTypeInfo.base_init.class, "apply", constants$13.const$1);
    static final VarHandle const$5 = constants$553.const$2.varHandle(MemoryLayout.PathElement.groupElement("base_init"));
}


