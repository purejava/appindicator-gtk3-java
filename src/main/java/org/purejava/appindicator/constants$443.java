// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$443 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$443() {}
    static final FunctionDescriptor g_weak_ref_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_weak_ref_get$MH = RuntimeHelper.downcallHandle(
        "g_weak_ref_get",
        constants$443.g_weak_ref_get$FUNC
    );
    static final FunctionDescriptor g_weak_ref_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_weak_ref_set$MH = RuntimeHelper.downcallHandle(
        "g_weak_ref_set",
        constants$443.g_weak_ref_set$FUNC
    );
    static final FunctionDescriptor GBindingTransformFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GBindingTransformFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBindingTransformFunc_UP$MH = RuntimeHelper.upcallHandle(GBindingTransformFunc.class, "apply", constants$443.GBindingTransformFunc_UP$FUNC);
    static final FunctionDescriptor GBindingTransformFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBindingTransformFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$443.GBindingTransformFunc_DOWN$FUNC
    );
    static final FunctionDescriptor g_binding_flags_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_binding_flags_get_type$MH = RuntimeHelper.downcallHandle(
        "g_binding_flags_get_type",
        constants$443.g_binding_flags_get_type$FUNC
    );
    static final FunctionDescriptor g_binding_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_binding_get_type$MH = RuntimeHelper.downcallHandle(
        "g_binding_get_type",
        constants$443.g_binding_get_type$FUNC
    );
}


