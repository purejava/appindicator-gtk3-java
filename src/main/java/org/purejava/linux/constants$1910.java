// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1910 {

    static final FunctionDescriptor gtk_notebook_set_scrollable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_scrollable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_scrollable",
        constants$1910.gtk_notebook_set_scrollable$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_scrollable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_scrollable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_scrollable",
        constants$1910.gtk_notebook_get_scrollable$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_tab_hborder$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_tab_hborder$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_tab_hborder",
        constants$1910.gtk_notebook_get_tab_hborder$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_tab_vborder$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_tab_vborder$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_tab_vborder",
        constants$1910.gtk_notebook_get_tab_vborder$FUNC
    );
    static final FunctionDescriptor gtk_notebook_popup_enable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_popup_enable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_popup_enable",
        constants$1910.gtk_notebook_popup_enable$FUNC
    );
    static final FunctionDescriptor gtk_notebook_popup_disable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_popup_disable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_popup_disable",
        constants$1910.gtk_notebook_popup_disable$FUNC
    );
}


