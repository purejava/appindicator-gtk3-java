// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1713 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1713() {}
    static final FunctionDescriptor gtk_notebook_set_scrollable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_scrollable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_scrollable",
        constants$1713.gtk_notebook_set_scrollable$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_scrollable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_scrollable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_scrollable",
        constants$1713.gtk_notebook_get_scrollable$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_tab_hborder$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_tab_hborder$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_tab_hborder",
        constants$1713.gtk_notebook_get_tab_hborder$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_tab_vborder$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_tab_vborder$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_tab_vborder",
        constants$1713.gtk_notebook_get_tab_vborder$FUNC
    );
    static final FunctionDescriptor gtk_notebook_popup_enable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_popup_enable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_popup_enable",
        constants$1713.gtk_notebook_popup_enable$FUNC
    );
    static final FunctionDescriptor gtk_notebook_popup_disable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_popup_disable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_popup_disable",
        constants$1713.gtk_notebook_popup_disable$FUNC
    );
}


