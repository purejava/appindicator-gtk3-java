// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1365 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1365() {}
    static final VarHandle const$0 = constants$1364.const$2.varHandle(MemoryLayout.PathElement.groupElement("verify_chain"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GTlsDatabaseClass.verify_chain_async.class, "apply", constants$1365.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$1365.const$1
    );
    static final VarHandle const$4 = constants$1364.const$2.varHandle(MemoryLayout.PathElement.groupElement("verify_chain_async"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GTlsDatabaseClass.verify_chain_finish.class, "apply", constants$12.const$2);
}


