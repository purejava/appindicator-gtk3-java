// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1917 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1917() {}
    static final FunctionDescriptor gtk_stock_add_static$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_stock_add_static$MH = RuntimeHelper.downcallHandle(
        "gtk_stock_add_static",
        constants$1917.gtk_stock_add_static$FUNC
    );
    static final FunctionDescriptor gtk_stock_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stock_lookup$MH = RuntimeHelper.downcallHandle(
        "gtk_stock_lookup",
        constants$1917.gtk_stock_lookup$FUNC
    );
    static final FunctionDescriptor gtk_stock_list_ids$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_stock_list_ids$MH = RuntimeHelper.downcallHandle(
        "gtk_stock_list_ids",
        constants$1917.gtk_stock_list_ids$FUNC
    );
    static final FunctionDescriptor gtk_stock_item_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stock_item_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_stock_item_copy",
        constants$1917.gtk_stock_item_copy$FUNC
    );
    static final FunctionDescriptor gtk_stock_item_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stock_item_free$MH = RuntimeHelper.downcallHandle(
        "gtk_stock_item_free",
        constants$1917.gtk_stock_item_free$FUNC
    );
    static final FunctionDescriptor gtk_stock_set_translate_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stock_set_translate_func$MH = RuntimeHelper.downcallHandle(
        "gtk_stock_set_translate_func",
        constants$1917.gtk_stock_set_translate_func$FUNC
    );
}


