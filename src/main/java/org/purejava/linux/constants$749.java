// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$749 {

    static final FunctionDescriptor g_menu_model_get_item_attribute$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_model_get_item_attribute$MH = RuntimeHelper.downcallHandleVariadic(
        "g_menu_model_get_item_attribute",
        constants$749.g_menu_model_get_item_attribute$FUNC
    );
    static final FunctionDescriptor g_menu_model_iterate_item_links$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_menu_model_iterate_item_links$MH = RuntimeHelper.downcallHandle(
        "g_menu_model_iterate_item_links",
        constants$749.g_menu_model_iterate_item_links$FUNC
    );
    static final FunctionDescriptor g_menu_model_get_item_link$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_model_get_item_link$MH = RuntimeHelper.downcallHandle(
        "g_menu_model_get_item_link",
        constants$749.g_menu_model_get_item_link$FUNC
    );
    static final FunctionDescriptor g_menu_model_items_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_menu_model_items_changed$MH = RuntimeHelper.downcallHandle(
        "g_menu_model_items_changed",
        constants$749.g_menu_model_items_changed$FUNC
    );
    static final FunctionDescriptor g_menu_attribute_iter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_menu_attribute_iter_get_type$MH = RuntimeHelper.downcallHandle(
        "g_menu_attribute_iter_get_type",
        constants$749.g_menu_attribute_iter_get_type$FUNC
    );
    static final FunctionDescriptor g_menu_attribute_iter_get_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_attribute_iter_get_next$MH = RuntimeHelper.downcallHandle(
        "g_menu_attribute_iter_get_next",
        constants$749.g_menu_attribute_iter_get_next$FUNC
    );
}

