// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1733 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1733() {}
    static final FunctionDescriptor gtk_places_sidebar_set_local_only$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_places_sidebar_set_local_only$MH = RuntimeHelper.downcallHandle(
        "gtk_places_sidebar_set_local_only",
        constants$1733.gtk_places_sidebar_set_local_only$FUNC
    );
    static final FunctionDescriptor gtk_places_sidebar_get_local_only$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_places_sidebar_get_local_only$MH = RuntimeHelper.downcallHandle(
        "gtk_places_sidebar_get_local_only",
        constants$1733.gtk_places_sidebar_get_local_only$FUNC
    );
    static final FunctionDescriptor gtk_places_sidebar_add_shortcut$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_places_sidebar_add_shortcut$MH = RuntimeHelper.downcallHandle(
        "gtk_places_sidebar_add_shortcut",
        constants$1733.gtk_places_sidebar_add_shortcut$FUNC
    );
    static final FunctionDescriptor gtk_places_sidebar_remove_shortcut$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_places_sidebar_remove_shortcut$MH = RuntimeHelper.downcallHandle(
        "gtk_places_sidebar_remove_shortcut",
        constants$1733.gtk_places_sidebar_remove_shortcut$FUNC
    );
    static final FunctionDescriptor gtk_places_sidebar_list_shortcuts$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_places_sidebar_list_shortcuts$MH = RuntimeHelper.downcallHandle(
        "gtk_places_sidebar_list_shortcuts",
        constants$1733.gtk_places_sidebar_list_shortcuts$FUNC
    );
    static final FunctionDescriptor gtk_places_sidebar_get_nth_bookmark$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_places_sidebar_get_nth_bookmark$MH = RuntimeHelper.downcallHandle(
        "gtk_places_sidebar_get_nth_bookmark",
        constants$1733.gtk_places_sidebar_get_nth_bookmark$FUNC
    );
}


