// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1187 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1187() {}
    static final FunctionDescriptor gdk_visual_get_best_with_both$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_visual_get_best_with_both$MH = RuntimeHelper.downcallHandle(
        "gdk_visual_get_best_with_both",
        constants$1187.gdk_visual_get_best_with_both$FUNC
    );
    static final FunctionDescriptor gdk_query_depths$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_query_depths$MH = RuntimeHelper.downcallHandle(
        "gdk_query_depths",
        constants$1187.gdk_query_depths$FUNC
    );
    static final FunctionDescriptor gdk_query_visual_types$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_query_visual_types$MH = RuntimeHelper.downcallHandle(
        "gdk_query_visual_types",
        constants$1187.gdk_query_visual_types$FUNC
    );
    static final FunctionDescriptor gdk_list_visuals$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_list_visuals$MH = RuntimeHelper.downcallHandle(
        "gdk_list_visuals",
        constants$1187.gdk_list_visuals$FUNC
    );
    static final FunctionDescriptor gdk_visual_get_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_visual_get_screen$MH = RuntimeHelper.downcallHandle(
        "gdk_visual_get_screen",
        constants$1187.gdk_visual_get_screen$FUNC
    );
    static final FunctionDescriptor gdk_visual_get_visual_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_visual_get_visual_type$MH = RuntimeHelper.downcallHandle(
        "gdk_visual_get_visual_type",
        constants$1187.gdk_visual_get_visual_type$FUNC
    );
}

