// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2060 {

    static final FunctionDescriptor gtk_test_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_test_init$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_test_init",
        constants$2060.gtk_test_init$FUNC
    );
    static final FunctionDescriptor gtk_test_register_all_types$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_test_register_all_types$MH = RuntimeHelper.downcallHandle(
        "gtk_test_register_all_types",
        constants$2060.gtk_test_register_all_types$FUNC
    );
    static final FunctionDescriptor gtk_test_list_all_types$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_test_list_all_types$MH = RuntimeHelper.downcallHandle(
        "gtk_test_list_all_types",
        constants$2060.gtk_test_list_all_types$FUNC
    );
    static final FunctionDescriptor gtk_test_find_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gtk_test_find_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_test_find_widget",
        constants$2060.gtk_test_find_widget$FUNC
    );
    static final FunctionDescriptor gtk_test_create_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_test_create_widget$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_test_create_widget",
        constants$2060.gtk_test_create_widget$FUNC
    );
    static final FunctionDescriptor gtk_test_create_simple_window$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_test_create_simple_window$MH = RuntimeHelper.downcallHandle(
        "gtk_test_create_simple_window",
        constants$2060.gtk_test_create_simple_window$FUNC
    );
}


