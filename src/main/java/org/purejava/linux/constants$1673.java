// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1673 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1673() {}
    static final FunctionDescriptor GtkListBoxSortFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxSortFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1673.GtkListBoxSortFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GtkListBoxUpdateHeaderFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkListBoxUpdateHeaderFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxUpdateHeaderFunc_UP$MH = RuntimeHelper.upcallHandle(GtkListBoxUpdateHeaderFunc.class, "apply", constants$1673.GtkListBoxUpdateHeaderFunc_UP$FUNC);
    static final FunctionDescriptor GtkListBoxUpdateHeaderFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxUpdateHeaderFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1673.GtkListBoxUpdateHeaderFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GtkListBoxCreateWidgetFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkListBoxCreateWidgetFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxCreateWidgetFunc_UP$MH = RuntimeHelper.upcallHandle(GtkListBoxCreateWidgetFunc.class, "apply", constants$1673.GtkListBoxCreateWidgetFunc_UP$FUNC);
    static final FunctionDescriptor GtkListBoxCreateWidgetFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxCreateWidgetFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1673.GtkListBoxCreateWidgetFunc_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_list_box_row_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_list_box_row_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_row_get_type",
        constants$1673.gtk_list_box_row_get_type$FUNC
    );
}


