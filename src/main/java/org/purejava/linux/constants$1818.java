// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1818 {

    static final FunctionDescriptor gtk_icon_source_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_icon_source_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_source_get_type",
        constants$1818.gtk_icon_source_get_type$FUNC
    );
    static final FunctionDescriptor gtk_icon_source_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_icon_source_new$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_source_new",
        constants$1818.gtk_icon_source_new$FUNC
    );
    static final FunctionDescriptor gtk_icon_source_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_source_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_source_copy",
        constants$1818.gtk_icon_source_copy$FUNC
    );
    static final FunctionDescriptor gtk_icon_source_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_source_free$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_source_free",
        constants$1818.gtk_icon_source_free$FUNC
    );
    static final FunctionDescriptor gtk_icon_source_set_filename$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_source_set_filename$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_source_set_filename",
        constants$1818.gtk_icon_source_set_filename$FUNC
    );
    static final FunctionDescriptor gtk_icon_source_set_icon_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_source_set_icon_name$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_source_set_icon_name",
        constants$1818.gtk_icon_source_set_icon_name$FUNC
    );
}


