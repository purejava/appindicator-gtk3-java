// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$263 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$263() {}
    static final FunctionDescriptor g_set_printerr_handler$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_set_printerr_handler$MH = RuntimeHelper.downcallHandle(
        "g_set_printerr_handler",
        constants$263.g_set_printerr_handler$FUNC
    );
    static final FunctionDescriptor GOptionArgFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GOptionArgFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GOptionArgFunc_UP$MH = RuntimeHelper.upcallHandle(GOptionArgFunc.class, "apply", constants$263.GOptionArgFunc_UP$FUNC);
    static final FunctionDescriptor GOptionArgFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GOptionArgFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$263.GOptionArgFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GOptionParseFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GOptionParseFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GOptionParseFunc_UP$MH = RuntimeHelper.upcallHandle(GOptionParseFunc.class, "apply", constants$263.GOptionParseFunc_UP$FUNC);
    static final FunctionDescriptor GOptionParseFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GOptionParseFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$263.GOptionParseFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GOptionErrorFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GOptionErrorFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GOptionErrorFunc_UP$MH = RuntimeHelper.upcallHandle(GOptionErrorFunc.class, "apply", constants$263.GOptionErrorFunc_UP$FUNC);
}


