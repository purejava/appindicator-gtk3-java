// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1387 {

    static final FunctionDescriptor atk_component_contains$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_component_contains$MH = RuntimeHelper.downcallHandle(
        "atk_component_contains",
        constants$1387.atk_component_contains$FUNC
    );
    static final FunctionDescriptor atk_component_ref_accessible_at_point$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_component_ref_accessible_at_point$MH = RuntimeHelper.downcallHandle(
        "atk_component_ref_accessible_at_point",
        constants$1387.atk_component_ref_accessible_at_point$FUNC
    );
    static final FunctionDescriptor atk_component_get_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_component_get_extents$MH = RuntimeHelper.downcallHandle(
        "atk_component_get_extents",
        constants$1387.atk_component_get_extents$FUNC
    );
    static final FunctionDescriptor atk_component_get_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_component_get_position$MH = RuntimeHelper.downcallHandle(
        "atk_component_get_position",
        constants$1387.atk_component_get_position$FUNC
    );
    static final FunctionDescriptor atk_component_get_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_component_get_size$MH = RuntimeHelper.downcallHandle(
        "atk_component_get_size",
        constants$1387.atk_component_get_size$FUNC
    );
    static final FunctionDescriptor atk_component_get_layer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_component_get_layer$MH = RuntimeHelper.downcallHandle(
        "atk_component_get_layer",
        constants$1387.atk_component_get_layer$FUNC
    );
}

