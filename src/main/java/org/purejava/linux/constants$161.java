// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$161 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$161() {}
    static final FunctionDescriptor g_hostname_to_unicode$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hostname_to_unicode$MH = RuntimeHelper.downcallHandle(
        "g_hostname_to_unicode",
        constants$161.g_hostname_to_unicode$FUNC
    );
    static final FunctionDescriptor GPollFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor GPollFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GPollFunc_UP$MH = RuntimeHelper.upcallHandle(GPollFunc.class, "apply", constants$161.GPollFunc_UP$FUNC);
    static final FunctionDescriptor GPollFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GPollFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$161.GPollFunc_DOWN$FUNC
    );
    static final FunctionDescriptor g_poll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_poll$MH = RuntimeHelper.downcallHandle(
        "g_poll",
        constants$161.g_poll$FUNC
    );
    static final FunctionDescriptor g_slist_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_slist_alloc$MH = RuntimeHelper.downcallHandle(
        "g_slist_alloc",
        constants$161.g_slist_alloc$FUNC
    );
    static final FunctionDescriptor g_slist_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_free$MH = RuntimeHelper.downcallHandle(
        "g_slist_free",
        constants$161.g_slist_free$FUNC
    );
}


