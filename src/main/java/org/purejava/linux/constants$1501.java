// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1501 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1501() {}
    static final FunctionDescriptor gtk_binding_set_by_class$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_binding_set_by_class$MH = RuntimeHelper.downcallHandle(
        "gtk_binding_set_by_class",
        constants$1501.gtk_binding_set_by_class$FUNC
    );
    static final FunctionDescriptor gtk_binding_set_find$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_binding_set_find$MH = RuntimeHelper.downcallHandle(
        "gtk_binding_set_find",
        constants$1501.gtk_binding_set_find$FUNC
    );
    static final FunctionDescriptor gtk_bindings_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_bindings_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_bindings_activate",
        constants$1501.gtk_bindings_activate$FUNC
    );
    static final FunctionDescriptor gtk_bindings_activate_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bindings_activate_event$MH = RuntimeHelper.downcallHandle(
        "gtk_bindings_activate_event",
        constants$1501.gtk_bindings_activate_event$FUNC
    );
    static final FunctionDescriptor gtk_binding_set_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_binding_set_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_binding_set_activate",
        constants$1501.gtk_binding_set_activate$FUNC
    );
    static final FunctionDescriptor gtk_binding_entry_skip$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_binding_entry_skip$MH = RuntimeHelper.downcallHandle(
        "gtk_binding_entry_skip",
        constants$1501.gtk_binding_entry_skip$FUNC
    );
}


