// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$312 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$312() {}
    static final FunctionDescriptor g_strv_builder_add_many$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strv_builder_add_many$MH = RuntimeHelper.downcallHandleVariadic(
        "g_strv_builder_add_many",
        constants$312.g_strv_builder_add_many$FUNC
    );
    static final FunctionDescriptor g_strv_builder_end$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strv_builder_end$MH = RuntimeHelper.downcallHandle(
        "g_strv_builder_end",
        constants$312.g_strv_builder_end$FUNC
    );
    static final FunctionDescriptor __errno_location$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __errno_location$MH = RuntimeHelper.downcallHandle(
        "__errno_location",
        constants$312.__errno_location$FUNC
    );
    static final FunctionDescriptor GTestFunc$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor GTestFunc_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle GTestFunc_UP$MH = RuntimeHelper.upcallHandle(GTestFunc.class, "apply", constants$312.GTestFunc_UP$FUNC);
    static final FunctionDescriptor GTestFunc_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle GTestFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$312.GTestFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GTestDataFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GTestDataFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTestDataFunc_UP$MH = RuntimeHelper.upcallHandle(GTestDataFunc.class, "apply", constants$312.GTestDataFunc_UP$FUNC);
}


