// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$471 {

    static final FunctionDescriptor g_object_class_install_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_install_property$MH = RuntimeHelper.downcallHandle(
        "g_object_class_install_property",
        constants$471.g_object_class_install_property$FUNC
    );
    static final FunctionDescriptor g_object_class_find_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_find_property$MH = RuntimeHelper.downcallHandle(
        "g_object_class_find_property",
        constants$471.g_object_class_find_property$FUNC
    );
    static final FunctionDescriptor g_object_class_list_properties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_list_properties$MH = RuntimeHelper.downcallHandle(
        "g_object_class_list_properties",
        constants$471.g_object_class_list_properties$FUNC
    );
    static final FunctionDescriptor g_object_class_override_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_override_property$MH = RuntimeHelper.downcallHandle(
        "g_object_class_override_property",
        constants$471.g_object_class_override_property$FUNC
    );
    static final FunctionDescriptor g_object_class_install_properties$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_install_properties$MH = RuntimeHelper.downcallHandle(
        "g_object_class_install_properties",
        constants$471.g_object_class_install_properties$FUNC
    );
    static final FunctionDescriptor g_object_interface_install_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_interface_install_property$MH = RuntimeHelper.downcallHandle(
        "g_object_interface_install_property",
        constants$471.g_object_interface_install_property$FUNC
    );
}

