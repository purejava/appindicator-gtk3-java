// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$834 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$834() {}
    static final FunctionDescriptor hb_color_get_blue$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_color_get_blue$MH = RuntimeHelper.downcallHandle(
        "hb_color_get_blue",
        constants$834.hb_color_get_blue$FUNC
    );
    static final FunctionDescriptor hb_blob_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_blob_create$MH = RuntimeHelper.downcallHandle(
        "hb_blob_create",
        constants$834.hb_blob_create$FUNC
    );
    static final FunctionDescriptor hb_blob_create_or_fail$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_blob_create_or_fail$MH = RuntimeHelper.downcallHandle(
        "hb_blob_create_or_fail",
        constants$834.hb_blob_create_or_fail$FUNC
    );
    static final FunctionDescriptor hb_blob_create_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_blob_create_from_file$MH = RuntimeHelper.downcallHandle(
        "hb_blob_create_from_file",
        constants$834.hb_blob_create_from_file$FUNC
    );
    static final FunctionDescriptor hb_blob_create_from_file_or_fail$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_blob_create_from_file_or_fail$MH = RuntimeHelper.downcallHandle(
        "hb_blob_create_from_file_or_fail",
        constants$834.hb_blob_create_from_file_or_fail$FUNC
    );
    static final FunctionDescriptor hb_blob_create_sub_blob$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_blob_create_sub_blob$MH = RuntimeHelper.downcallHandle(
        "hb_blob_create_sub_blob",
        constants$834.hb_blob_create_sub_blob$FUNC
    );
}


