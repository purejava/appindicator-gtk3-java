// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$629 {

    static final FunctionDescriptor g_bus_own_name_on_connection_with_closures$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_own_name_on_connection_with_closures$MH = RuntimeHelper.downcallHandle(
        "g_bus_own_name_on_connection_with_closures",
        constants$629.g_bus_own_name_on_connection_with_closures$FUNC
    );
    static final FunctionDescriptor g_bus_unown_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_bus_unown_name$MH = RuntimeHelper.downcallHandle(
        "g_bus_unown_name",
        constants$629.g_bus_unown_name$FUNC
    );
    static final FunctionDescriptor GBusNameAppearedCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBusNameAppearedCallback$MH = RuntimeHelper.downcallHandle(
        constants$629.GBusNameAppearedCallback$FUNC
    );
    static final FunctionDescriptor GBusNameVanishedCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBusNameVanishedCallback$MH = RuntimeHelper.downcallHandle(
        constants$629.GBusNameVanishedCallback$FUNC
    );
}

