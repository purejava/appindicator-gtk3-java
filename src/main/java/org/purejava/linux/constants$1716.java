// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1716 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1716() {}
    static final FunctionDescriptor gtk_notebook_set_tab_detachable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_tab_detachable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_tab_detachable",
        constants$1716.gtk_notebook_set_tab_detachable$FUNC
    );
    static final FunctionDescriptor gtk_notebook_detach_tab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_detach_tab$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_detach_tab",
        constants$1716.gtk_notebook_detach_tab$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_action_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_action_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_action_widget",
        constants$1716.gtk_notebook_get_action_widget$FUNC
    );
    static final FunctionDescriptor gtk_notebook_set_action_widget$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_action_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_action_widget",
        constants$1716.gtk_notebook_set_action_widget$FUNC
    );
    static final FunctionDescriptor gtk_offscreen_window_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_offscreen_window_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_offscreen_window_get_type",
        constants$1716.gtk_offscreen_window_get_type$FUNC
    );
    static final FunctionDescriptor gtk_offscreen_window_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_offscreen_window_new$MH = RuntimeHelper.downcallHandle(
        "gtk_offscreen_window_new",
        constants$1716.gtk_offscreen_window_new$FUNC
    );
}


