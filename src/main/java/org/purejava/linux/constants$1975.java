// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1975 {

    static final FunctionDescriptor gtk_recent_filter_add_pixbuf_formats$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_filter_add_pixbuf_formats$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_filter_add_pixbuf_formats",
        constants$1975.gtk_recent_filter_add_pixbuf_formats$FUNC
    );
    static final FunctionDescriptor gtk_recent_filter_add_application$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_filter_add_application$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_filter_add_application",
        constants$1975.gtk_recent_filter_add_application$FUNC
    );
    static final FunctionDescriptor gtk_recent_filter_add_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_filter_add_group$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_filter_add_group",
        constants$1975.gtk_recent_filter_add_group$FUNC
    );
    static final FunctionDescriptor gtk_recent_filter_add_age$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_recent_filter_add_age$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_filter_add_age",
        constants$1975.gtk_recent_filter_add_age$FUNC
    );
    static final FunctionDescriptor gtk_recent_filter_add_custom$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_filter_add_custom$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_filter_add_custom",
        constants$1975.gtk_recent_filter_add_custom$FUNC
    );
    static final FunctionDescriptor gtk_recent_filter_get_needed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_filter_get_needed$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_filter_get_needed",
        constants$1975.gtk_recent_filter_get_needed$FUNC
    );
}


