// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1772 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1772() {}
    static final FunctionDescriptor gtk_recent_manager_purge_items$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_purge_items$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_purge_items",
        constants$1772.gtk_recent_manager_purge_items$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_recent_info_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_type",
        constants$1772.gtk_recent_info_get_type$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_ref$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_ref",
        constants$1772.gtk_recent_info_ref$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_unref$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_unref",
        constants$1772.gtk_recent_info_unref$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_uri",
        constants$1772.gtk_recent_info_get_uri$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_display_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_display_name$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_display_name",
        constants$1772.gtk_recent_info_get_display_name$FUNC
    );
}


