// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1334 {

    static final FunctionDescriptor gdk_gl_context_realize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_realize$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_realize",
        constants$1334.gdk_gl_context_realize$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_make_current$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_make_current$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_make_current",
        constants$1334.gdk_gl_context_make_current$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_get_current$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_gl_context_get_current$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_current",
        constants$1334.gdk_gl_context_get_current$FUNC
    );
    static final FunctionDescriptor gdk_gl_context_clear_current$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_gl_context_clear_current$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_clear_current",
        constants$1334.gdk_gl_context_clear_current$FUNC
    );
    static final FunctionDescriptor gdk_keymap_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_keymap_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_keymap_get_type",
        constants$1334.gdk_keymap_get_type$FUNC
    );
    static final FunctionDescriptor gdk_keymap_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_keymap_get_default$MH = RuntimeHelper.downcallHandle(
        "gdk_keymap_get_default",
        constants$1334.gdk_keymap_get_default$FUNC
    );
}

