// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1170 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1170() {}
    static final FunctionDescriptor gdk_gl_context_set_forward_compatible$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_gl_context_set_forward_compatible$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_set_forward_compatible",
        constants$1170.gdk_gl_context_set_forward_compatible$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_get_forward_compatible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_get_forward_compatible$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_forward_compatible",
        constants$1170.gdk_gl_context_get_forward_compatible$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_set_use_es$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_gl_context_set_use_es$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_set_use_es",
        constants$1170.gdk_gl_context_set_use_es$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_get_use_es$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_get_use_es$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_use_es",
        constants$1170.gdk_gl_context_get_use_es$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_realize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_realize$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_realize",
        constants$1170.gdk_gl_context_realize$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_make_current$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_make_current$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_make_current",
        constants$1170.gdk_gl_context_make_current$FUNC
    );
}


