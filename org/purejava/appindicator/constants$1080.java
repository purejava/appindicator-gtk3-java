// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1080 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1080() {}
    static final VarHandle const$0 = constants$1079.const$0.varHandle(MemoryLayout.PathElement.groupElement("seek"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GFileIOStreamClass.can_truncate.class, "apply", constants$10.const$5);
    static final VarHandle const$2 = constants$1079.const$0.varHandle(MemoryLayout.PathElement.groupElement("can_truncate"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GFileIOStreamClass.truncate_fn.class, "apply", constants$393.const$4);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$393.const$4
    );
    static final VarHandle const$5 = constants$1079.const$0.varHandle(MemoryLayout.PathElement.groupElement("truncate_fn"));
}


