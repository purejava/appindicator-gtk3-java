// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1003 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1003() {}
    static final VarHandle const$0 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_finish"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GFileIface.replace_readwrite.class, "apply", constants$989.const$4);
    static final VarHandle const$2 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GFileIface.replace_readwrite_async.class, "apply", constants$990.const$2);
    static final VarHandle const$4 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_async"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GFileIface.replace_readwrite_finish.class, "apply", constants$23.const$0);
}


