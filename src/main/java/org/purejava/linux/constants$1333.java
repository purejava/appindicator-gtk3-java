// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1333 {

    static final FunctionDescriptor gdk_gl_context_set_debug_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_gl_context_set_debug_enabled$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_set_debug_enabled",
        constants$1333.gdk_gl_context_set_debug_enabled$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_get_debug_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_get_debug_enabled$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_debug_enabled",
        constants$1333.gdk_gl_context_get_debug_enabled$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_set_forward_compatible$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_gl_context_set_forward_compatible$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_set_forward_compatible",
        constants$1333.gdk_gl_context_set_forward_compatible$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_get_forward_compatible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_get_forward_compatible$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_forward_compatible",
        constants$1333.gdk_gl_context_get_forward_compatible$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_set_use_es$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_gl_context_set_use_es$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_set_use_es",
        constants$1333.gdk_gl_context_set_use_es$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_get_use_es$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_get_use_es$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_use_es",
        constants$1333.gdk_gl_context_get_use_es$FUNC
    );
}


