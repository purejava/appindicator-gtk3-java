// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1043 {

    static final FunctionDescriptor hb_map_get_population$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_map_get_population$MH = RuntimeHelper.downcallHandle(
        "hb_map_get_population",
        constants$1043.hb_map_get_population$FUNC
    );
    static final FunctionDescriptor hb_map_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_map_set$MH = RuntimeHelper.downcallHandle(
        "hb_map_set",
        constants$1043.hb_map_set$FUNC
    );
    static final FunctionDescriptor hb_map_get$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_map_get$MH = RuntimeHelper.downcallHandle(
        "hb_map_get",
        constants$1043.hb_map_get$FUNC
    );
    static final FunctionDescriptor hb_map_del$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_map_del$MH = RuntimeHelper.downcallHandle(
        "hb_map_del",
        constants$1043.hb_map_del$FUNC
    );
    static final FunctionDescriptor hb_map_has$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_map_has$MH = RuntimeHelper.downcallHandle(
        "hb_map_has",
        constants$1043.hb_map_has$FUNC
    );
    static final FunctionDescriptor hb_shape$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_shape$MH = RuntimeHelper.downcallHandle(
        "hb_shape",
        constants$1043.hb_shape$FUNC
    );
}

