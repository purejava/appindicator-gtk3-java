// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$890 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$890() {}
    static final FunctionDescriptor hb_unicode_funcs_set_eastasian_width_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_funcs_set_eastasian_width_func$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_funcs_set_eastasian_width_func",
        constants$890.hb_unicode_funcs_set_eastasian_width_func$FUNC
    );
    static final FunctionDescriptor hb_unicode_eastasian_width$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_unicode_eastasian_width$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_eastasian_width",
        constants$890.hb_unicode_eastasian_width$FUNC
    );
    static final FunctionDescriptor hb_unicode_decompose_compatibility_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor hb_unicode_decompose_compatibility_func_t_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_decompose_compatibility_func_t_UP$MH = RuntimeHelper.upcallHandle(hb_unicode_decompose_compatibility_func_t.class, "apply", constants$890.hb_unicode_decompose_compatibility_func_t_UP$FUNC);
    static final FunctionDescriptor hb_unicode_decompose_compatibility_func_t_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_decompose_compatibility_func_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$890.hb_unicode_decompose_compatibility_func_t_DOWN$FUNC
    );
    static final FunctionDescriptor hb_unicode_funcs_set_decompose_compatibility_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_funcs_set_decompose_compatibility_func$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_funcs_set_decompose_compatibility_func",
        constants$890.hb_unicode_funcs_set_decompose_compatibility_func$FUNC
    );
    static final FunctionDescriptor hb_unicode_decompose_compatibility$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_decompose_compatibility$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_decompose_compatibility",
        constants$890.hb_unicode_decompose_compatibility$FUNC
    );
}


