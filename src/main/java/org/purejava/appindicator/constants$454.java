// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$454 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$454() {}
    static final FunctionDescriptor g_param_spec_variant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_param_spec_variant$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_variant",
        constants$454.g_param_spec_variant$FUNC
    );
    static final OfAddress g_param_spec_types$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle g_param_spec_types$VH = constants$454.g_param_spec_types$LAYOUT.varHandle();
    static final MemorySegment g_param_spec_types$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_param_spec_types", constants$454.g_param_spec_types$LAYOUT);
    static final FunctionDescriptor g_signal_group_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_signal_group_get_type$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_get_type",
        constants$454.g_signal_group_get_type$FUNC
    );
    static final FunctionDescriptor g_signal_group_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_group_new$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_new",
        constants$454.g_signal_group_new$FUNC
    );
    static final FunctionDescriptor g_signal_group_set_target$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_group_set_target$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_set_target",
        constants$454.g_signal_group_set_target$FUNC
    );
    static final FunctionDescriptor g_signal_group_dup_target$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_group_dup_target$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_dup_target",
        constants$454.g_signal_group_dup_target$FUNC
    );
}


