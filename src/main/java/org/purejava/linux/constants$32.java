// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$32 {

    static final FunctionDescriptor g_intern_static_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_intern_static_string$MH = RuntimeHelper.downcallHandle(
        "g_intern_static_string",
        constants$32.g_intern_static_string$FUNC
    );
    static final FunctionDescriptor GErrorInitFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GErrorInitFunc$MH = RuntimeHelper.downcallHandle(
        constants$32.GErrorInitFunc$FUNC
    );
    static final FunctionDescriptor GErrorCopyFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GErrorCopyFunc$MH = RuntimeHelper.downcallHandle(
        constants$32.GErrorCopyFunc$FUNC
    );
    static final FunctionDescriptor GErrorClearFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
}

