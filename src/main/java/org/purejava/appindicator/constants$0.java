// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_error_free",
        constants$0.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid();
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(GCallback.class, "apply", constants$0.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$0.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_object_set_data_full$destroy.class, "apply", constants$0.const$0);
}


